# 用公开干净源替换的文件

目标：尽量保源码、不瞎编。仅替换 GitHub 上能找到的干净实现。

| 本工程文件 | 来源 | 说明 |
|---|---|---|
| AppYsV2.java | bizhangjie/CatVodSpider | 干净手写 |
| Kugou.java | bizhangjie/CatVodSpider | 干净手写 |
| Wogg.java | bizhangjie/CatVodSpider | 干净手写 |
| Douban.java | bizhangjie/CatVodSpider | 干净手写 |
| AList.java | bizhangjie/CatVodSpider | 干净手写 |
| Alist.java | 别名 extends AList | 兼容 csp_Alist |
| Ikanbot.java | bizhangjie/CatVodSpider | 去掉 orhanobut.logger |
| Jianpian.java + bean/jianpian | bizhangjie/CatVodSpider | 干净手写 |
| JianPian.java | 别名 extends Jianpian | 兼容 csp_JianPian |

jar 反编译备份：`docs/jar-decompile-backup/`

未找到公开干净源的编译错误类（仍用 jar 反编译，可能无法 javac）：
XYQHiker, AppFox, Kuwo, PianKu8, AppQi, Hxq, Web1905, Duboku, SaoHuo, SP360, App99, AppSy, AppMH, PanBaidu, PanWebShare*, 等

## 依赖一并迁入

- `api/AliYun.java` + `bean/ali/*`（Wogg → Ali → AliYun）
- `bean/jianpian/*`（Jianpian）
- `utils/AESEncryption.java`, `utils/CgImageUtil.java`（若缺失）
- `app/build.gradle`：`buildConfig = true` + `CLIENT_ID` 空字符串字段
