# 可维护二次开发指南

## 目标

把「单线路 spider.jar 黑盒」变成：

- 能编译
- 能按站点增量移植
- 能用 FongMi 同款方式打 `custom_spider.jar`
- 不继续堆积 R8 merge 混淆代码

## 仓库分层

```
CatVodSpider-maintainable/     ← 你日常开发的仓库（本目录）
CatVodSpider-danxianlu/        ← 反编译对照只读库（不要在里面开发）
ref-CatVodSpider/              ← 上游 FongMi 快照
```

## 日常开发流程

### 1. 选站点

看 `docs/PORT_PRIORITY.md`：

- **A_easy**：优先
- **B_medium**：次优先
- **C_framework**：XBPQ/XYQ/网盘基座，单独设计
- **D_hard**：最后

### 2. 对照反编译

只读打开：

`../CatVodSpider-danxianlu/app/src/main/java/com/github/catvod/spider/XXX.java`

搞清楚：

1. 请求了哪些 URL
2. 首页/分类/详情/搜索/播放各自返回什么 JSON 字段
3. 有没有 proxy / cookie / 签名

### 3. 干净重写

在：

`app/src/main/java/com/github/catvod/spider/XXX.java`

使用：

- `OkHttp` / `Result` / `Vod` / `Class` / `Filter`
- 需要 HTML 时用 **Jsoup**
- 需要 JS 时用现有 `com.github.catvod.js.*`（FongMi 原版）

对照表：`docs/COMPAT_MAPPING.md`

### 4. 接 api.json

`assets/tvbox/api.json` 中：

```json
{
  "key": "yst",
  "name": "养生堂",
  "type": 3,
  "api": "csp_YST",
  "searchable": 0
}
```

`csp_` 后面必须等于 **public class 名**。

### 5. 编译 spider.jar

需要本机 Android SDK + JDK 17：

```bash
./gradlew spiderJar
# 产物：jar/custom_spider.jar
```

（Windows 原脚本依赖 powershell 校验；Linux 可先 `./gradlew :app:assembleRelease` 再按 `build.gradle` 中的 apktool 流程。）

### 6. 验收清单（每个站点）

- [ ] `homeContent` 分类正常
- [ ] `categoryContent` 列表有封面/标题
- [ ] `detailContent` 有播放线路
- [ ] `playerContent` 能出可播 URL（或正确 parse）
- [ ] `searchContent`（若 searchable=1）
- [ ] 无 `merge.*` import
- [ ] 无硬编码调试残留

## 框架类怎么处理（C_framework）

| 类 | 建议 |
|---|---|
| `XBPQ` / `XBPQPlay` | 单独模块，先写配置 schema + 最小解释器，不要一次搬 4 万行 |
| `XYQHiker` / `XYQBiu` | 同上，配置驱动爬虫 |
| `Pan*` 家族 | 先抽象 `PanClient` 接口，再实现夸克/UC/阿里/百度 |
| `Config` | 配置中心 UI/本地文件，拆成 settings + update |

这些适合开 issue 分里程碑，不适合「一个 PR 塞完」。

## 与反编译库共存策略

| 需求 | 去哪 |
|---|---|
| 查原逻辑 | `CatVodSpider-danxianlu` |
| 写新代码 | `CatVodSpider-maintainable` |
| 跑现成线路 | `assets/tvbox` + 暂时仍可用 `original/spider.jar` |
| 合并上游 FongMi | 把 `ref-CatVodSpider` 当 upstream，cherry-pick |

## 代码风格（强制）

1. 类/方法英文语义化命名  
2. 字符串 URL 抽 `private static final`  
3. 捕获异常时返回 `Result.error(...)` 或空列表，避免裸 `""` 难以排查  
4. 新增 proxy 必须在 `Proxy.proxy` 显式注册  
5. 每个移植类文件头注释：来源站点、逆向日期、是否已验证

## 网络代理（本机）

GitHub / 依赖拉取：

```bash
export https_proxy=socks5h://127.0.0.1:40000
export http_proxy=socks5h://127.0.0.1:40000
export ALL_PROXY=socks5h://127.0.0.1:40000
```
