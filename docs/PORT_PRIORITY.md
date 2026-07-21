# 移植优先级清单

来源：单线路 spider.jar 相对 FongMi 干净源码的差集。

策略：以 FongMi 为底，**禁止**把 `merge/*` 混淆包搬进可维护工程。


## A_easy (25)

| 类 | LOC | merge引用 | api.json | 备注 |
|---|---:|---:|:---:|---|
| `Baiku` | 59 | 4 | Y |  |
| `KuLe` | 63 | 4 | Y |  |
| `GuiGui` | 69 | 4 | Y | 偏JSON |
| `QingtingFM` | 110 | 7 | Y |  |
| `MiSou` | 116 | 2 | Y | 偏JSON |
| `AppLY` | 128 | 6 | Y | App壳 |
| `QuPanSo` | 131 | 3 | Y | 偏JSON |
| `GuaziTY` | 138 | 7 | Y |  |
| `KafeiTY` | 142 | 1 | Y | 偏JSON |
| `LocalFile` | 145 | 1 | Y | 偏JSON |
| `C919TY` | 165 | 1 | Y | 偏JSON |
| `HaokanDJ` | 165 | 8 | Y |  |
| `JuheSo` | 168 | 2 | Y |  |
| `YST` | 168 | 1 | Y | 偏JSON |
| `PanSou` | 171 | 3 | Y | 网盘 |
| `Jike` | 178 | 4 | Y | 偏JSON |
| `QiutongTY` | 188 | 2 | Y | 偏JSON |
| `TianYiSo` | 210 | 3 | Y | 偏JSON |
| `Xunlei8` | 223 | 7 | Y |  |
| `TingShijie` | 224 | 3 | Y | 偏JSON |
| `MeijuMi` | 226 | 7 | Y |  |
| `Wallpaper` | 46 | 0 | N |  |
| `AmuBiliV2` | 71 | 7 | N |  |
| `PanOrder` | 102 | 1 | N | 网盘 |
| `MeijuTT` | 233 | 7 | N |  |

## B_medium (42)

| 类 | LOC | merge引用 | api.json | 备注 |
|---|---:|---:|:---:|---|
| `FirstAid` | 115 | 10 | Y | HTML/Jsoup |
| `Wwys` | 130 | 14 | Y | HTML/Jsoup |
| `Djlh` | 144 | 12 | Y |  |
| `C4KZhinan` | 150 | 11 | Y |  |
| `Web1905` | 157 | 12 | Y |  |
| `Xlys` | 170 | 11 | Y | HTML/Jsoup |
| `SaoHuo` | 183 | 15 | Y | HTML/Jsoup |
| `RenRen` | 190 | 10 | Y |  |
| `PanWebShareKF` | 249 | 11 | Y | 网盘 |
| `ShuangXing` | 255 | 4 | Y | 偏JSON |
| `Wogg` | 261 | 12 | Y | HTML/Jsoup |
| `New6v` | 262 | 8 | Y |  |
| `Djuu` | 268 | 8 | Y |  |
| `Duboku` | 268 | 9 | Y |  |
| `AppSy` | 292 | 7 | Y | App壳 |
| `App3Q` | 294 | 5 | Y | 偏JSON, App壳 |
| `AppMH` | 296 | 5 | Y | 偏JSON, App壳 |
| `PanWebShare` | 312 | 12 | Y | HTML/Jsoup, 网盘 |
| `PanWebShare123` | 312 | 12 | Y | 网盘 |
| `AppRJ` | 313 | 7 | Y | App壳 |
| `BiliYS` | 316 | 14 | Y |  |
| `Czsapp` | 329 | 16 | Y | HTML/Jsoup |
| `YGP` | 329 | 5 | Y | 偏JSON, HTML/Jsoup |
| `Jpys` | 344 | 11 | Y | HTML/Jsoup |
| `JianPian` | 361 | 7 | Y |  |
| `Douban` | 379 | 9 | Y |  |
| `Ikanbot` | 403 | 8 | Y |  |
| `Feiyu` | 412 | 5 | Y | 偏JSON |
| `QnMp4` | 454 | 8 | Y |  |
| `AppDrama` | 468 | 8 | Y | App壳 |
| `PianKu8` | 499 | 7 | Y |  |
| `AppGet` | 511 | 9 | Y | App壳 |
| `SP360` | 512 | 4 | Y | 偏JSON |
| `AppQi` | 524 | 9 | Y | App壳 |
| `XueLuo` | 194 | 13 | N | HTML/Jsoup |
| `Tvyb` | 216 | 11 | N | HTML/Jsoup |
| `PanWebShareLL` | 266 | 12 | N | HTML/Jsoup, 网盘 |
| `Mp4Mov` | 280 | 8 | N |  |
| `Kugou` | 319 | 7 | N | HTML/Jsoup |
| `Kuwo` | 344 | 7 | N |  |
| `AppMuou` | 362 | 10 | N | App壳 |
| `Alist` | 450 | 20 | N |  |

## C_framework (15)

| 类 | LOC | merge引用 | api.json | 备注 |
|---|---:|---:|:---:|---|
| `PanBaidu` | 119 | 6 | Y | 网盘 |
| `PanAli` | 178 | 9 | Y | 网盘 |
| `PanQuark` | 266 | 9 | Y | HTML/Jsoup, 网盘 |
| `PanUC` | 266 | 9 | Y | HTML/Jsoup, 网盘 |
| `Config` | 1026 | 19 | Y |  |
| `XYQHiker` | 8318 | 17 | Y | HTML/Jsoup |
| `XBPQ` | 43927 | 65 | Y |  |
| `HunHePan` | 68 | 2 | N | 偏JSON, 网盘 |
| `XiongdiPan` | 111 | 8 | N | 网盘 |
| `XBPQPlay` | 134 | 8 | N |  |
| `UCPan` | 200 | 6 | N | 网盘 |
| `QuarkPan` | 202 | 6 | N | 网盘 |
| `XunleiPan` | 204 | 7 | N | 网盘 |
| `Pan` | 537 | 16 | N | 网盘 |
| `XYQBiu` | 3168 | 13 | N |  |

## D_hard (8)

| 类 | LOC | merge引用 | api.json | 备注 |
|---|---:|---:|:---:|---|
| `App99` | 621 | 7 | Y | App壳 |
| `Gz360` | 640 | 7 | Y |  |
| `AppYsV2` | 998 | 3 | Y | 偏JSON, App壳 |
| `Hxq` | 1769 | 12 | Y |  |
| `AppFox` | 713 | 3 | N | 偏JSON, App壳 |
| `PushAgent` | 721 | 10 | N |  |
| `Danmu` | 1015 | 5 | N | 偏JSON |
| `AppYs` | 1326 | 4 | N | 偏JSON, App壳 |