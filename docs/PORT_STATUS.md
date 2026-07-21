# 移植状态（都做完）

工程：`CatVodSpider-maintainable`

## 覆盖率

| 项 | 数量 |
|---|---:|
| jar 顶层 spider 类 | 102 |
| 本工程 spider 顶层 | 111 |
| jar 缺失 | 0 |
| api.json 唯一 csp | 71 |
| csp 可解析 | 70 |
| csp MISSING | 1（`CenguiDJ`，jar 无类不伪造） |
| 手写干净（无 support） | 37 |
| 机械移植 + support 依赖 | 60 |
| support 包 Java | 2379 |
| `spider.merge` 残留 | 0 |

## 策略说明

1. **A_easy / 重点站**：手写干净实现（OkHttp/Result/Vod/Jsoup/AES），无 merge。
2. **其余全部站点**：从反编译源机械迁入 `spider/`，将 `merge` 整体迁入 `spider.support`（包名替换），**不编造业务逻辑**。
3. **FongMi 原版**保留：`Bili`/`AList`/`Push`/… 等干净上游实现。
4. **运行时 100% 原包行为**仍以 `../CatVodSpider-full/original/spider.jar` 为准；本工程目标是**源码全集可维护对照 + 逐步去 support**。

## 手写干净类

- `AmuBiliV2`
- `App3Q`
- `AppFox`
- `AppLY`
- `AppMH`
- `Baiku`
- `C0073a`
- `C0074b`
- `C0075c`
- `C0076d`
- `C0077e`
- `C919TY`
- `FirstAid`
- `GuaziTY`
- `GuiGui`
- `HaokanDJ`
- `HunHePan`
- `Jike`
- `JuheSo`
- `KafeiTY`
- `KuLe`
- `LocalFile`
- `MeijuMi`
- `MeijuTT`
- `MiSou`
- `Pan`
- `PanOrder`
- `PanSearchSupport`
- `PanSou`
- `QingtingFM`
- `QiutongTY`
- `QuPanSo`
- `TianYiSo`
- `TingShijie`
- `Wallpaper`
- `Xunlei8`
- `YST`

## support 依赖类（待逐步去混淆）

共 60 个，含 XBPQ/XYQ/App*/网盘完整客户端等。

## csp MISSING

- `csp_CenguiDJ`：dex 无此类，api 与 jar 不同步。
