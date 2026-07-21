# CatVodSpider-maintainable

**目标：全部站点移植完成。**

## 现状

- jar 顶层 spider：**102 → 本工程 111（齐全）**
- api `csp_*`：**70/71**（仅 `CenguiDJ` 缺失且不伪造）
- **`spider.merge` 残留：0**（统一为 `spider.support`）
- 手写干净：**37**
- 反编译机械移植 + support：**60**
- support 文件：**2379**

## 结构

```
app/src/main/java/com/github/catvod/
  spider/           # 全部站点（干净手写 + 机械移植）
  spider/support/   # 原 R8 merge 依赖（包名已改）
  bean/ net/ utils/ crawler/ js/  # FongMi 干净底座
  parser/ p000js/   # 自 jar 迁入
```

## 使用

- **要 100% 原包运行时**：`../CatVodSpider-full/original/spider.jar`
- **要源码全集对照/继续去混淆**：本仓库

## 文档

- [PORT_STATUS.md](docs/PORT_STATUS.md)
- [DEVELOPMENT.md](docs/DEVELOPMENT.md)
- [COMPAT_MAPPING.md](docs/COMPAT_MAPPING.md)
