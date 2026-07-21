# 混淆包 → 干净 API 映射

反编译 jar 里的 `com.github.catvod.spider.merge.*` **不要搬进可维护工程**。  
移植站点时，按下表替换。

## 网络

| 混淆 | 干净 API | 说明 |
|---|---|---|
| `C2238b.m6073l(url, headers)` | `OkHttp.string(url, headers)` | GET 文本 |
| `C2238b.m6072k(url)` | `OkHttp.string(url)` | GET 无头 |
| `C2238b.m6066f / m6067g` | `OkHttp.post(...)` | POST |
| `C2238b.m6059a / m6062b` | `OkHttp.getLocation(...)` | 取重定向 |
| `C2238b.m6060a()` | `OkHttp` 内部 client / `Spider.client()` | 客户端 |

位置：`com.github.catvod.net.OkHttp`

## 结果模型

| 混淆 | 干净 API |
|---|---|
| `C1768j` | `com.github.catvod.bean.Vod` |
| `C1759a` | `com.github.catvod.bean.Class` |
| `C1761c` / Filter 相关 | `com.github.catvod.bean.Filter` |
| `C1765g` / `C2192c` | `com.github.catvod.bean.Result` |
| `C1765g.m4189q(list)` | `Result.string(list)` |
| `C1765g.m4188p(vod)` | `Result.string(vod)` |
| `C1765g.m4191s(classes, list)` | `Result.string(classes, list)` |
| `Result.page(page,count,limit,total)` | `Result.get().page(...).vod(...).string()` |
| player `parse/url/header` | `Result.get().url(id).header(map).string()` 等 |

## 路径 / 存储

| 混淆 | 干净 API |
|---|---|
| `C2268k.m6164a(file)` | `Path.read(file)` |
| `C2268k.m6166b(name)` | `Path.tv(name)` / `Path.*` |
| shell chmod 一类 | `Shell` / 尽量避免 |

位置：`com.github.catvod.utils.Path`

## HTML 解析

| 混淆 | 干净 API |
|---|---|
| `C1286l.m3222g(html)` + `m3478o0(css)` | `Jsoup.parse(html)` + `selectFirst/select` |
| `C1840c.m4479n(url, headers)` | `OkHttp.string(url, headers)` 再 Jsoup |

依赖：工程已有 `org.jsoup:jsoup`

## 字符串 / 工具

| 混淆 | 干净 API |
|---|---|
| `C2137a.m5396a("prefix")` | 普通 `StringBuilder` / `+` |
| `Util.CHROME` | `com.github.catvod.utils.Util.CHROME` |
| JSON 安全解析 | `com.github.catvod.utils.Json` |

## Init / Proxy

| 混淆 jar | 可维护工程 |
|---|---|
| 胖 `Init`（更新检查、盘 cookie 等） | 保持 FongMi 瘦 `Init`；业务拆到站点类 |
| 胖 `Proxy` 大 switch | 显式 `if ("xxx") return Xxx.proxy()`，可维护 |

## 禁止事项

1. 复制 `merge/**` 进可维护工程  
2. 保留 `f167a` / `m504a` 这类无意义命名（移植时重命名）  
3. 依赖 `np.protect`  
4. 数字开头类名：`4KZhinan` → 源码写 `C4KZhinan` 或 `Zhinan4K`，并在 api 映射文档里注明宿主 `csp_` 名
