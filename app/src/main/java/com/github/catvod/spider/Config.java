package com.github.catvod.spider;
import com.github.catvod.spider.support.p117b.C2186v;
import com.github.catvod.spider.support.p128m.C2268k;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p116a.C2137a;

import com.github.catvod.spider.support.p118c.C2192c;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p001A.C0100m;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.spider.support.p117b.C2175i;
import com.github.catvod.spider.support.p117b.RunnableC2169c;
import com.github.catvod.spider.support.p117b.RunnableC2173g;
import com.github.catvod.spider.support.p117b.RunnableC2182p;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.spider.support.p128m.C2253G;
import com.github.catvod.spider.support.p128m.C2254H;
import com.github.catvod.spider.support.p128m.C2256I;
import com.github.catvod.spider.support.p128m.C2257J;
import com.github.catvod.utils.Path;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Config extends Spider {
    public static long lastResetClickTime;

    /* JADX INFO: renamed from: a */
    private String f151a;

    /* JADX INFO: renamed from: b */
    private String f152b;

    /* JADX INFO: renamed from: c */
    private String f153c;

    /* JADX INFO: renamed from: d */
    private String f154d;

    /* JADX INFO: renamed from: e */
    private String f155e;
    private String e$1;

    /* JADX INFO: renamed from: f */
    private String f156f;

    /* JADX INFO: renamed from: g */
    private String f157g;

    /* JADX INFO: renamed from: h */
    private String f158h;

    /* JADX INFO: renamed from: i */
    private boolean f159i;

    /* JADX INFO: renamed from: k */
    private C2257J f160k;

    /* JADX INFO: renamed from: com.github.catvod.spider.Config$1 */
    public class C00331 {
        private String name;
        private String nickname;
        private Map user;
        private String userAccount;
        private String userName;
        private String username;

        public String getAliNickname() {
            Map map = this.user;
            return (map == null || map.get("nick_name") == null) ? "" : (String) map.get("nick_name");
        }

        public String getNickname() {
            return this.nickname;
        }

        public String getuserAccount() {
            return this.userAccount;
        }

        public String getuserName() {
            return this.username;
        }

        public String getuserName$1() {
            return this.userName;
        }

        public String name() {
            return this.name;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m476a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(file);
            String nickname = ((C00331) gson.fromJson(fileReader, C00331.class)).getNickname();
            fileReader.close();
            return nickname;
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m477a(Config config) {
        String str = config.f158h;
        config.m491r(1);
    }

    /* JADX INFO: renamed from: b */
    private String m478b(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(file);
            String str2 = ((C00331) gson.fromJson(fileReader, C00331.class)).getuserName();
            fileReader.close();
            return str2;
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m479b(Config config) {
        config.getClass();
        try {
            config.m487l(config.f158h);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    private String m480c(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(file);
            String str2 = ((C00331) gson.fromJson(fileReader, C00331.class)).getuserAccount();
            fileReader.close();
            return str2;
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m481c(Config config) {
        config.getClass();
        try {
            config.m489o(config.f158h);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    private String m482d(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(file);
            String aliNickname = ((C00331) gson.fromJson(fileReader, C00331.class)).getAliNickname();
            fileReader.close();
            return aliNickname;
        } catch (Exception e) {
            return "";
        }
    }

    public static void disableUpdateCheck() {
        try {
            File fileM6169c = Path.tv("/config.json");
            JsonObject jsonObject = new JsonObject();
            if (fileM6169c.exists()) {
                String strM6164a = Path.read(fileM6169c);
                if (!strM6164a.isEmpty()) {
                    jsonObject = new JsonParser().parse(strM6164a).getAsJsonObject();
                }
            }
            if ("关闭".equals(jsonObject.has("update") ? jsonObject.get("update").getAsString() : "开启")) {
                C2256I.m6113i("已是关闭状态");
                return;
            }
            jsonObject.addProperty("update", "关闭");
            C2268k.m6168c(fileM6169c, jsonObject.toString());
            C2256I.m6113i("检查更新已关闭");
            SpiderDebug.log("配置已更新: " + jsonObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    private String m483e(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(file);
            String str2 = ((C00331) gson.fromJson(fileReader, C00331.class)).getuserName$1();
            fileReader.close();
            return str2;
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m484e(Config config) {
        String str = config.f158h;
        config.m491r(2);
    }

    public static void enableUpdateCheck() {
        try {
            File fileM6169c = Path.tv("/config.json");
            JsonObject jsonObject = new JsonObject();
            if (fileM6169c.exists()) {
                String strM6164a = Path.read(fileM6169c);
                if (!strM6164a.isEmpty()) {
                    jsonObject = new JsonParser().parse(strM6164a).getAsJsonObject();
                }
            }
            if ("开启".equals(jsonObject.has("update") ? jsonObject.get("update").getAsString() : "开启")) {
                C2256I.m6113i("已是开启状态");
                return;
            }
            jsonObject.addProperty("update", "开启");
            C2268k.m6168c(fileM6169c, jsonObject.toString());
            C2256I.m6113i("检查更新已开启");
            SpiderDebug.log("配置已更新: " + jsonObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    private String m485f(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(file);
            String strName = ((C00331) gson.fromJson(fileReader, C00331.class)).name();
            fileReader.close();
            return strName;
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048 A[Catch: Exception -> 0x004e, TRY_LEAVE, TryCatch #0 {Exception -> 0x004e, blocks: (B:3:0x0005, B:5:0x001a, B:7:0x0034, B:9:0x003a, B:11:0x0042, B:12:0x0048), top: B:17:0x0005 }] */
    public static List<String> get123Options() {
        ArrayList arrayList = new ArrayList();
        try {
            Gson gson = new Gson();
            String strM6164a = Path.read(Path.tv("/config.json"));
            if (strM6164a.length() > 0) {
                String asString = ((JsonObject) gson.fromJson(strM6164a, JsonObject.class)).get("123Quality").getAsString();
                if (!"123原画".equals(asString) && "123无限".equals(asString)) {
                    arrayList.add("123无限");
                } else {
                    arrayList.add("123原画");
                }
            } else {
                arrayList.add("123原画");
            }
        } catch (Exception e) {
            arrayList.add("123原画");
        }
        return arrayList;
    }

    public static List<String> getAliOptions() {
        ArrayList arrayList = new ArrayList();
        try {
            Gson gson = new Gson();
            String strM6164a = Path.read(Path.tv("/config.json"));
            if (strM6164a.length() > 0) {
                String asString = ((JsonObject) gson.fromJson(strM6164a, JsonObject.class)).get("aliQuality").getAsString();
                if ("阿里原画".equals(asString)) {
                    arrayList.add("阿里原画");
                } else if ("阿里普画".equals(asString)) {
                    arrayList.add("阿里普画");
                } else if ("阿里原画|阿里普画".equals(asString)) {
                    arrayList.add("阿里原画");
                    arrayList.add("阿里普画");
                } else if ("阿里普画|阿里原画".equals(asString)) {
                    arrayList.add("阿里普画");
                    arrayList.add("阿里原画");
                } else {
                    arrayList.add("阿里原画");
                }
            } else {
                arrayList.add("阿里原画");
            }
        } catch (Exception e) {
            arrayList.add("阿里原画");
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048 A[Catch: Exception -> 0x004e, TRY_LEAVE, TryCatch #0 {Exception -> 0x004e, blocks: (B:3:0x0005, B:5:0x001a, B:7:0x0034, B:9:0x003a, B:11:0x0042, B:12:0x0048), top: B:17:0x0005 }] */
    public static List<String> getBaiduOptions() {
        ArrayList arrayList = new ArrayList();
        try {
            Gson gson = new Gson();
            String strM6164a = Path.read(Path.tv("/config.json"));
            if (strM6164a.length() > 0) {
                String asString = ((JsonObject) gson.fromJson(strM6164a, JsonObject.class)).get("baiduQuality").getAsString();
                if (!"百度原画".equals(asString) && "百度无限".equals(asString)) {
                    arrayList.add("百度无限");
                } else {
                    arrayList.add("百度原画");
                }
            } else {
                arrayList.add("百度原画");
            }
        } catch (Exception e) {
            arrayList.add("百度原画");
        }
        return arrayList;
    }

    public static List<String> getGuangyaOptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("光鸭原画");
        return arrayList;
    }

    public static List<String> getMobileOptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("移动普画");
        return arrayList;
    }

    public static List<String> getMyBaiduOptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("百度原画");
        return arrayList;
    }

    public static List<String> getMyQuarkOptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("夸克原画");
        return arrayList;
    }

    public static List<String> getMyUCOptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("UC原画");
        return arrayList;
    }

    public static List<String> getQuarkOptions() {
        ArrayList arrayList = new ArrayList();
        try {
            Gson gson = new Gson();
            String strM6164a = Path.read(Path.tv("/config.json"));
            if (strM6164a.length() > 0) {
                String asString = ((JsonObject) gson.fromJson(strM6164a, JsonObject.class)).get("quarkQuality").getAsString();
                if ("夸克原画".equals(asString)) {
                    arrayList.add("夸克原画");
                } else if ("夸克普画".equals(asString)) {
                    arrayList.add("夸克普画");
                } else if ("夸克无限".equals(asString)) {
                    arrayList.add("夸克无限");
                } else if ("夸克原画|夸克普画".equals(asString)) {
                    arrayList.add("夸克原画");
                    arrayList.add("夸克普画");
                } else if ("夸克普画|夸克原画".equals(asString)) {
                    arrayList.add("夸克普画");
                    arrayList.add("夸克原画");
                } else {
                    arrayList.add("夸克原画");
                }
            } else {
                arrayList.add("夸克原画");
            }
        } catch (Exception e) {
            arrayList.add("夸克原画");
        }
        return arrayList;
    }

    public static List<String> getTianyiOptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("天翼原画");
        return arrayList;
    }

    public static List<String> getUCOptions() {
        ArrayList arrayList = new ArrayList();
        try {
            Gson gson = new Gson();
            String strM6164a = Path.read(Path.tv("/config.json"));
            if (strM6164a.length() > 0) {
                String asString = ((JsonObject) gson.fromJson(strM6164a, JsonObject.class)).get("ucQuality").getAsString();
                if ("UC原画".equals(asString)) {
                    arrayList.add("UC原画");
                } else if ("UC普画".equals(asString)) {
                    arrayList.add("UC普画");
                } else if ("UC无限".equals(asString)) {
                    arrayList.add("UC无限");
                } else if ("UC原画|UC普画".equals(asString)) {
                    arrayList.add("UC原画");
                    arrayList.add("UC普画");
                } else if ("UC普画|UC原画".equals(asString)) {
                    arrayList.add("UC普画");
                    arrayList.add("UC原画");
                } else {
                    arrayList.add("UC原画");
                }
            } else {
                arrayList.add("UC原画");
            }
        } catch (Exception e) {
            arrayList.add("UC原画");
        }
        return arrayList;
    }

    public static List<String> getXunleiOptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("迅雷原画");
        return arrayList;
    }

    public static String inputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
            sb.append("\n");
        }
    }

    public static boolean is1314GoProxyActive() {
        String strM6073l = OkHttp.string("http://127.0.0.1:1314/api/ping", new HashMap());
        return strM6073l != null && strM6073l.equals("ok");
    }

    /* JADX INFO: renamed from: l */
    private boolean m487l(String str) {
        String string;
        JsonObject jsonObject = new JsonObject();
        String strM6164a = Path.read(C2175i.m5662d().m5668f());
        if (!TextUtils.isEmpty(strM6164a)) {
            jsonObject.addProperty("ali", strM6164a);
        }
        String strM6164a2 = Path.read(Path.tv("/quark_cookie.txt"));
        if (!TextUtils.isEmpty(strM6164a2)) {
            jsonObject.addProperty("quark", strM6164a2);
        }
        String strM6164a3 = Path.read(Path.tv("/uc_cookie.txt"));
        if (!TextUtils.isEmpty(strM6164a3)) {
            jsonObject.addProperty("uc", strM6164a3);
        }
        String strM6164a4 = Path.read(Path.tv("/uc_token.txt"));
        if (!TextUtils.isEmpty(strM6164a4)) {
            jsonObject.addProperty("uc_tv", strM6164a4);
        }
        String strM6164a5 = Path.read(Path.tv("/bili_cookie.txt"));
        if (!TextUtils.isEmpty(strM6164a5)) {
            jsonObject.addProperty("bili", strM6164a5);
        }
        String strM6164a6 = Path.read(Path.tv("/cloud189.txt"));
        if (!TextUtils.isEmpty(strM6164a6)) {
            jsonObject.addProperty("cloud189", strM6164a6);
        }
        String strM6164a7 = Path.read(Path.tv("/cloud123.txt"));
        if (!TextUtils.isEmpty(strM6164a7)) {
            jsonObject.addProperty("cloud123", strM6164a7);
        }
        String strM6164a8 = Path.read(Path.tv("/uc_machine_code.txt"));
        if (!TextUtils.isEmpty(strM6164a8)) {
            jsonObject.addProperty("ucMachineCode", strM6164a8);
        }
        String strM6164a9 = Path.read(Path.tv("/baidu.txt"));
        if (!TextUtils.isEmpty(strM6164a9)) {
            jsonObject.addProperty("baidu", strM6164a9);
        }
        if (jsonObject.size() > 0) {
            String strM5408a = C2139c.m5408a(str, "/add");
            HashMap mapM5756b = C2186v.m5756b("username", "");
            mapM5756b.put("data", this.f160k.m6124c(jsonObject.toString()));
            JSONObject jSONObject = new JSONObject(C2238b.m6068h(strM5408a, new JSONObject(mapM5756b).toString()));
            if (jSONObject.optInt("code") == 200) {
                C2256I.m6113i("登录信息已成功上传至云端");
                return true;
            }
            StringBuilder sbM5396a = C2137a.m5396a("上传登录信息失败:");
            sbM5396a.append(jSONObject.optString("msg"));
            string = sbM5396a.toString();
        } else {
            string = "当前设备无登录信息,请先扫码登录";
        }
        C2256I.m6113i(string);
        return false;
    }

    /* JADX INFO: renamed from: n */
    private String m488n(String str) {
        if (str.startsWith("quark")) {
            return "夸克";
        }
        return str.startsWith("uc") ? "UC" : "阿里";
    }

    /* JADX INFO: renamed from: o */
    private boolean m489o(String str) {
        String str2;
        String strM6068h = C2238b.m6068h(C2139c.m5408a(str, "/get"), new JSONObject(C2186v.m5756b("username", "")).toString());
        SpiderDebug.log(strM6068h);
        JSONObject jSONObject = new JSONObject(strM6068h);
        SpiderDebug.log(jSONObject.toString());
        if (jSONObject.optInt("code") == 200) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("token");
            if (jSONArrayOptJSONArray.length() > 0) {
                JSONObject jSONObject2 = new JSONObject(this.f160k.m6123b(jSONArrayOptJSONArray.optString(0)));
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject2.optString(next);
                    if (!TextUtils.isEmpty(strOptString)) {
                        if ("ali".equals(next)) {
                            C2268k.m6168c(Path.tv("aliyun"), strOptString);
                        }
                        if ("quark".equals(next)) {
                            C2268k.m6168c(Path.tv("/quark_cookie.txt"), strOptString);
                        }
                        if ("uc".equals(next)) {
                            C2268k.m6168c(Path.tv("/uc_cookie.txt"), strOptString);
                        }
                        if ("uc_tv".equals(next)) {
                            C2268k.m6168c(Path.tv("/uc_token.txt"), strOptString);
                        }
                        if ("bili".equals(next)) {
                            C2268k.m6168c(Path.tv("/bili_cookie.txt"), strOptString);
                        }
                        if ("cloud189".equals(next)) {
                            C2268k.m6168c(Path.tv("/cloud189.txt"), strOptString);
                        }
                        if ("cloud123".equals(next)) {
                            C2268k.m6168c(Path.tv("/cloud123.txt"), strOptString);
                        }
                        if ("ucMachineCode".equals(next)) {
                            C2268k.m6168c(Path.tv("/uc_machine_code.txt"), strOptString);
                        }
                        if ("baidu".equals(next)) {
                            C2268k.m6168c(Path.tv("/baidu.txt"), strOptString);
                        }
                    }
                }
                C2256I.m6113i("从云端获取登录信息成功");
                return true;
            }
            str2 = "云端没有数据";
        } else {
            str2 = "从云端获取登录信息出现异常";
        }
        C2256I.m6113i(str2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m490p(String str) {
        String str2;
        String str3;
        String str4;
        HashMap map = new HashMap();
        if ("100".equals(str)) {
            map.put("site", "ali");
            str4 = "请使用阿里云盘APP扫码";
        } else if ("300".equals(str)) {
            map.put("site", "quark");
            str4 = "请使用夸克浏览器APP扫码";
        } else if ("500".equals(str)) {
            map.put("site", "uc");
            str4 = "请使用UC浏览器APP扫码";
        } else if ("700".equals(str)) {
            map.put("site", "bili");
            str4 = "请使用哔哩哔哩APP扫码";
        } else if ("b300".equals(str)) {
            map.put("site", "baidu");
            str4 = "请使用百度网盘APP扫码";
        } else if ("x300".equals(str)) {
            map.put("site", "xunlei");
            str4 = "请使用迅雷APP扫码";
        } else if ("g300".equals(str)) {
            map.put("site", "guangya");
            str4 = "请使用光鸭云盘APP扫码";
        } else if ("c500".equals(str)) {
            map.put("site", "cloud189");
            str4 = "请输入天翼云盘账号密码";
        } else if ("p300".equals(str)) {
            map.put("site", "cloud123");
            str4 = "请输入123云盘账号密码";
        } else if ("quarktip".equals(str)) {
            map.put("site", "quarktip");
            str4 = "夸克网盘帮助";
        } else if ("uctip".equals(str)) {
            map.put("site", "uctip");
            str4 = "UC网盘帮助";
        } else {
            if (!"189tip".equals(str)) {
                if ("123panfxck".equals(str)) {
                    map.put("site", "123panfxck");
                    str4 = "请输入123云盘社区Cookie";
                } else {
                    if ("BlockAli".equals(str)) {
                        str3 = "阿里云盘";
                    } else if ("BlockQuark".equals(str)) {
                        str3 = "夸克网盘";
                    } else if ("BlockUC".equals(str)) {
                        str3 = "UC网盘";
                    } else if ("Block189".equals(str)) {
                        str3 = "天翼云盘";
                    } else if ("Block123".equals(str)) {
                        str3 = "123云盘";
                    } else if ("BlockBaidu".equals(str)) {
                        str3 = "百度网盘";
                    } else if ("BlockXunlei".equals(str)) {
                        str3 = "迅雷云盘";
                    } else if ("BlockGuangya".equals(str)) {
                        str3 = "光鸭云盘";
                    } else {
                        if ("Block139".equals(str)) {
                            str3 = "移动云盘";
                        } else {
                            if (!"homePage".equals(str) && !"danmuColor".equals(str) && !"panOrder".equals(str) && !"pansou".equals(str) && !"proxyMode".equals(str) && !"backup".equals(str) && !"aliThread".equals(str) && !"quarkThread".equals(str) && !"ucThread".equals(str) && !"baiduThread".equals(str) && !"xunleiThread".equals(str) && !"guangyaThread".equals(str) && !"aliQuality".equals(str) && !"quarkQuality".equals(str) && !"ucQuality".equals(str) && !"baiduQuality".equals(str) && !"123Quality".equals(str) && !"update".equals(str) && !"newaliyun".equals(str) && !"newquark".equals(str) && !"newuc".equals(str) && !"newbaidu".equals(str) && !"newxunlei".equals(str) && !"newguangya".equals(str) && !"new189".equals(str) && !"new123".equals(str) && !"newbili".equals(str)) {
                                if ("200".equals(str)) {
                                    str2 = "aliyun";
                                } else if ("400".equals(str)) {
                                    str2 = "/quark_cookie.txt";
                                } else if ("c400".equals(str)) {
                                    C2268k.m6168c(Path.tv("/189_cookie.txt"), "");
                                    str2 = "/cloud189.txt";
                                } else if ("p400".equals(str)) {
                                    str2 = "/cloud123.txt";
                                } else if ("b400".equals(str)) {
                                    str2 = "/baidu.txt";
                                } else if ("x400".equals(str)) {
                                    C2268k.m6168c(Path.tv("free_thunder"), "");
                                    str2 = "/xunlei.txt";
                                } else if ("g400".equals(str)) {
                                    C2268k.m6168c(Path.tv("free_guangya"), "");
                                    str2 = "/guangya.txt";
                                } else if ("600".equals(str)) {
                                    str2 = "/uc_cookie.txt";
                                } else if ("600token".equals(str)) {
                                    str2 = "/uc_token.txt";
                                } else {
                                    if (!"800".equals(str)) {
                                        if ("uctoken".equals(str)) {
                                            C0100m.m859t().m860D();
                                            return;
                                        }
                                        if ("recovery".equals(str)) {
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            if (jCurrentTimeMillis - lastResetClickTime < 500) {
                                                lastResetClickTime = 0L;
                                                C2254H.backupsConfig();
                                                return;
                                            } else {
                                                lastResetClickTime = jCurrentTimeMillis;
                                                C2256I.m6113i("⚠️ 为防止误操作，请双击确认重置");
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    str2 = "/bili_cookie.txt";
                                }
                                File fileM6166b = Path.tv(str2);
                                C2268k.m6168c(fileM6166b, "");
                                C2256I.m6113i(fileM6166b.getName());
                                return;
                            }
                            map.put("site", str);
                        }
                        map.put("flag", "");
                    }
                    map.put("site", str3);
                    map.put("flag", "");
                }
                C2253G.m6099q().m6108z(map);
            }
            map.put("site", "189tip");
            str4 = "天翼账号无法登录？";
        }
        map.put("flag", str4);
        C2253G.m6099q().m6108z(map);
    }

    /* JADX INFO: renamed from: r */
    private void m491r(final int i) {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f159i ? Init.getConfigActivity() : Init.getActivity());
            builder.setTitle("提示");
            builder.setMessage(i == 1 ? "将当前设备的云盘、B站登录信息上传至云端" : "从云端下载云盘、B站登录信息,并覆盖已有的");
            builder.setNegativeButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p127l.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Config config = this.f5602a;
                    int i3 = i;
                    config.getClass();
                    int i4 = 2;
                    Init.execute(i3 == 1 ? new RunnableC2169c(config, i4) : new RunnableC2173g(config, i4));
                }
            });
            builder.setPositiveButton("取消", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p127l.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                }
            });
            builder.create().show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String action(String str) {
        Init.execute(new RunnableC2182p(this, str, 3));
        return "";
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        Vod c2194e;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        try {
            ArrayList arrayList = new ArrayList();
            if ("alipan".equals(str)) {
                if (new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("阿里云盘")) {
                    str25 = "阿里云盘";
                    str26 = "当前状态:已关闭";
                } else {
                    str25 = "阿里云盘";
                    str26 = "当前状态:已开启";
                }
                arrayList.add(new Vod("BlockAli", str25, "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/8Yr6/1200X800/aliyun.jpg/webp", str26, this.f159i ? "BlockAli" : ""));
                String strM482d = m482d(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/.aliyun");
                arrayList.add(new Vod("newaliyun", "阿里个人中心", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/8Yr6/1200X800/aliyun.jpg/webp", TextUtils.isEmpty(strM482d) ? "未登录" : strM482d, this.f159i ? "newaliyun" : ""));
                arrayList.add(new Vod("100", "设置阿里Token", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/8Yr6/1200X800/aliyun.jpg/webp", "点击设置", this.f159i ? "100" : ""));
                arrayList.add(new Vod("200", "清除阿里Token", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/8Yr6/1200X800/aliyun.jpg/webp", "点击清除", this.f159i ? "200" : ""));
                arrayList.add(new Vod("aliQuality", "阿里云盘画质", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/8Yr6/1200X800/aliyun.jpg/webp", new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("aliQuality").getAsString(), this.f159i ? "aliQuality" : ""));
                c2194e = new Vod("aliThread", "阿里云盘线程", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/8Yr6/1200X800/aliyun.jpg/webp", "当前线程:" + new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("aliThread").getAsString(), this.f159i ? "aliThread" : "");
            } else if ("quark".equals(str)) {
                if (new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("夸克网盘")) {
                    str23 = "夸克网盘";
                    str24 = "当前状态:已关闭";
                } else {
                    str23 = "夸克网盘";
                    str24 = "当前状态:已开启";
                }
                arrayList.add(new Vod("BlockQuark", str23, "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/LX2y/1200X800/quark.jpg/webp", str24, this.f159i ? "BlockQuark" : ""));
                String strM476a = m476a(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/quark_cookie.txt");
                arrayList.add(new Vod("newquark", "夸克个人中心", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/LX2y/1200X800/quark.jpg/webp", TextUtils.isEmpty(strM476a) ? "未登录" : strM476a, this.f159i ? "newquark" : ""));
                arrayList.add(new Vod("300", "设置夸克Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/LX2y/1200X800/quark.jpg/webp", "点击设置", this.f159i ? "300" : ""));
                arrayList.add(new Vod("400", "清除夸克Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/LX2y/1200X800/quark.jpg/webp", "点击清除", this.f159i ? "400" : ""));
                arrayList.add(new Vod("quarkQuality", "夸克网盘画质", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/LX2y/1200X800/quark.jpg/webp", new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("quarkQuality").getAsString(), this.f159i ? "quarkQuality" : ""));
                arrayList.add(new Vod("quarkThread", "夸克网盘线程", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/LX2y/1200X800/quark.jpg/webp", "当前线程:" + new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("quarkThread").getAsString(), this.f159i ? "quarkThread" : ""));
                c2194e = new Vod("quarktip", "夸克网盘帮助", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/LX2y/1200X800/quark.jpg/webp", "点击查看", this.f159i ? "quarktip" : "");
            } else if ("uc".equals(str)) {
                if (new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("UC网盘")) {
                    str21 = "UC网盘";
                    str22 = "当前状态:已关闭";
                } else {
                    str21 = "UC网盘";
                    str22 = "当前状态:已开启";
                }
                arrayList.add(new Vod("BlockUC", str21, "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/kbEn/1200X800/uc.jpg/webp", str22, this.f159i ? "BlockUC" : ""));
                String strM476a2 = m476a(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/uc_cookie.txt");
                arrayList.add(new Vod("newuc", "UC个人中心", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/kbEn/1200X800/uc.jpg/webp", TextUtils.isEmpty(strM476a2) ? "未登录" : strM476a2, this.f159i ? "newuc" : ""));
                arrayList.add(new Vod("500", "设置UC Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/kbEn/1200X800/uc.jpg/webp", "点击设置", this.f159i ? "500" : ""));
                arrayList.add(new Vod("uctoken", "设置UC TV Token", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/kbEn/1200X800/uc.jpg/webp", "点击设置", this.f159i ? "uctoken" : ""));
                arrayList.add(new Vod("600", "清除UC Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/kbEn/1200X800/uc.jpg/webp", "点击清除", this.f159i ? "600" : ""));
                arrayList.add(new Vod("600token", "清除UC TV Token", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/kbEn/1200X800/uc.jpg/webp", "点击清除", this.f159i ? "600token" : ""));
                arrayList.add(new Vod("ucQuality", "UC网盘画质", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/kbEn/1200X800/uc.jpg/webp", new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("ucQuality").getAsString(), this.f159i ? "ucQuality" : ""));
                arrayList.add(new Vod("ucThread", "UC网盘线程", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/kbEn/1200X800/uc.jpg/webp", "当前线程:" + new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("ucThread").getAsString(), this.f159i ? "ucThread" : ""));
                c2194e = new Vod("uctip", "UC网盘帮助", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/kbEn/1200X800/uc.jpg/webp", "点击查看", this.f159i ? "uctip" : "");
            } else if ("cloud189".equals(str)) {
                if (new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("天翼云盘")) {
                    str19 = "天翼云盘";
                    str20 = "当前状态:已关闭";
                } else {
                    str19 = "天翼云盘";
                    str20 = "当前状态:已开启";
                }
                arrayList.add(new Vod("Block189", str19, "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/n1b9/1200X800/189.jpg/webp", str20, this.f159i ? "Block189" : ""));
                String strM480c = m480c(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/cloud189.txt");
                arrayList.add(new Vod("new189", "天翼个人中心", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/n1b9/1200X800/189.jpg/webp", TextUtils.isEmpty(strM480c) ? "未登录" : strM480c, this.f159i ? "new189" : ""));
                arrayList.add(new Vod("c500", "设置天翼账号密码", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/n1b9/1200X800/189.jpg/webp", "点击设置", this.f159i ? "c500" : ""));
                arrayList.add(new Vod("c400", "清除天翼Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/n1b9/1200X800/189.jpg/webp", "点击清除", this.f159i ? "c400" : ""));
                c2194e = new Vod("189tip", "天翼云盘帮助", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/n1b9/1200X800/189.jpg/webp", "点击查看", this.f159i ? "189tip" : "");
            } else if ("cloud123".equals(str)) {
                if (new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("123云盘")) {
                    str17 = "123云盘";
                    str18 = "当前状态:已关闭";
                } else {
                    str17 = "123云盘";
                    str18 = "当前状态:已开启";
                }
                arrayList.add(new Vod("Block123", str17, "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/N1l5/1200X800/123.jpg/webp", str18, this.f159i ? "Block123" : ""));
                String strM476a3 = m476a(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/cloud123.txt");
                arrayList.add(new Vod("new123", "123个人中心", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/N1l5/1200X800/123.jpg/webp", TextUtils.isEmpty(strM476a3) ? "未登录" : strM476a3, this.f159i ? "new123" : ""));
                arrayList.add(new Vod("p300", "设置123账号密码", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/N1l5/1200X800/123.jpg/webp", "点击设置", this.f159i ? "p300" : ""));
                arrayList.add(new Vod("p400", "清除123 Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/N1l5/1200X800/123.jpg/webp", "点击清除", this.f159i ? "p400" : ""));
                arrayList.add(new Vod("123Quality", "123云盘画质", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/N1l5/1200X800/123.jpg/webp", new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("123Quality").getAsString(), this.f159i ? "123Quality" : ""));
                c2194e = new Vod("123panfxck", "设置123云盘社区Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/N1l5/1200X800/123.jpg/webp", "点击设置", this.f159i ? "123panfxck" : "");
            } else if ("baidu".equals(str)) {
                if (new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("百度网盘")) {
                    str15 = "百度网盘";
                    str16 = "当前状态:已关闭";
                } else {
                    str15 = "百度网盘";
                    str16 = "当前状态:已开启";
                }
                arrayList.add(new Vod("BlockBaidu", str15, "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/dyXZ/1200X800/baidu.jpg/webp", str16, this.f159i ? "BlockBaidu" : ""));
                String strM478b = m478b(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/baidu.txt");
                arrayList.add(new Vod("newbaidu", "百度个人中心", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/dyXZ/1200X800/baidu.jpg/webp", TextUtils.isEmpty(strM478b) ? "未登录" : strM478b, this.f159i ? "newbaidu" : ""));
                arrayList.add(new Vod("b300", "设置百度Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/dyXZ/1200X800/baidu.jpg/webp", "点击设置", this.f159i ? "b300" : ""));
                arrayList.add(new Vod("b400", "清除百度Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/dyXZ/1200X800/baidu.jpg/webp", "点击清除", this.f159i ? "b400" : ""));
                arrayList.add(new Vod("baiduQuality", "百度网盘画质", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/dyXZ/1200X800/baidu.jpg/webp", new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("baiduQuality").getAsString(), this.f159i ? "baiduQuality" : ""));
                c2194e = new Vod("baiduThread", "百度网盘线程", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/dyXZ/1200X800/baidu.jpg/webp", "当前线程:" + new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("baiduThread").getAsString(), this.f159i ? "baiduThread" : "");
            } else if ("xunlei".equals(str)) {
                if (new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("迅雷云盘")) {
                    str13 = "迅雷云盘";
                    str14 = "当前状态:已关闭";
                } else {
                    str13 = "迅雷云盘";
                    str14 = "当前状态:已开启";
                }
                arrayList.add(new Vod("BlockXunlei", str13, "https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260623/4oPO/1200X800/xunlei.jpg/webp", str14, this.f159i ? "BlockXunlei" : ""));
                String strM478b2 = m478b(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/xunlei.txt");
                arrayList.add(new Vod("newxunlei", "迅雷个人中心", "https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260623/4oPO/1200X800/xunlei.jpg/webp", TextUtils.isEmpty(strM478b2) ? "未登录" : strM478b2, this.f159i ? "newxunlei" : ""));
                arrayList.add(new Vod("x300", "设置迅雷Cookie", "https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260623/4oPO/1200X800/xunlei.jpg/webp", "点击设置", this.f159i ? "x300" : ""));
                arrayList.add(new Vod("x400", "清除迅雷Cookie", "https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260623/4oPO/1200X800/xunlei.jpg/webp", "点击清除", this.f159i ? "x400" : ""));
                c2194e = new Vod("xunleiThread", "迅雷云盘线程", "https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260623/4oPO/1200X800/xunlei.jpg/webp", "当前线程:" + new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("xunleiThread").getAsString(), this.f159i ? "xunleiThread" : "");
            } else if ("guangya".equals(str)) {
                if (new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("光鸭云盘")) {
                    str11 = "光鸭云盘";
                    str12 = "当前状态:已关闭";
                } else {
                    str11 = "光鸭云盘";
                    str12 = "当前状态:已开启";
                }
                arrayList.add(new Vod("BlockGuangya", str11, "https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260625/kqrL/1200X800/guangya.jpg/webp", str12, this.f159i ? "BlockGuangya" : ""));
                String strM478b3 = m478b(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/guangya.txt");
                arrayList.add(new Vod("newguangya", "光鸭个人中心", "https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260625/kqrL/1200X800/guangya.jpg/webp", TextUtils.isEmpty(strM478b3) ? "未登录" : strM478b3, this.f159i ? "newguangya" : ""));
                arrayList.add(new Vod("g300", "设置光鸭Cookie", "https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260625/kqrL/1200X800/guangya.jpg/webp", "点击设置", this.f159i ? "g300" : ""));
                c2194e = new Vod("g400", "清除光鸭Cookie", "https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260625/kqrL/1200X800/guangya.jpg/webp", "点击清除", this.f159i ? "g400" : "");
            } else if ("cloud139".equals(str)) {
                if (new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("panBlock").getAsString().contains("移动云盘")) {
                    str9 = "移动云盘";
                    str10 = "当前状态:已关闭";
                } else {
                    str9 = "移动云盘";
                    str10 = "当前状态:已开启";
                }
                c2194e = new Vod("Block139", str9, "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/D9nT/1200X800/139.jpg/webp", str10, this.f159i ? "Block139" : "");
            } else if ("bili".equals(str)) {
                String strM476a4 = m476a(Environment.getExternalStorageDirectory().getAbsolutePath() + "/TVBox/bili_cookie.txt");
                arrayList.add(new Vod("newbili", "哔哩个人中心", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/3lGI/1200X800/bili.jpg/webp", TextUtils.isEmpty(strM476a4) ? "未登录" : strM476a4, this.f159i ? "newbili" : ""));
                arrayList.add(new Vod("700", "设置哔哩Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/3lGI/1200X800/bili.jpg/webp", "点击设置", this.f159i ? "700" : ""));
                c2194e = new Vod("800", "清除哔哩Cookie", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/3lGI/1200X800/bili.jpg/webp", "点击清除", this.f159i ? "800" : "");
            } else {
                if (!"other".equals(str)) {
                    if ("recovery".equals(str)) {
                        c2194e = new Vod("recovery", "重置配置中心", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/o2Gy/1200X800/recovery.jpg/webp", "双击重置", this.f159i ? "recovery" : "");
                    }
                    C2192c c2192c = new C2192c();
                    c2192c.m5817i(1, 1, 1, 1);
                    c2192c.m5829w(arrayList);
                    return c2192c.toString();
                }
                arrayList.add(new Vod("homePage", "主页管理", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/7CTd/1200X800/home.jpg/webp", "点击设置", this.f159i ? "homePage" : ""));
                if ("默认".equals(new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("danmuColor").getAsString())) {
                    str3 = "弹幕颜色";
                    str4 = "当前颜色:默认";
                } else {
                    str3 = "弹幕颜色";
                    str4 = "当前颜色:彩色";
                }
                arrayList.add(new Vod("danmuColor", str3, "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/rV1Y/1600X1068/danmu.jpg/webp", str4, this.f159i ? "danmuColor" : ""));
                arrayList.add(new Vod("panOrder", "云盘排序", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/umg6/1200X800/yunpan.jpg/webp", "点击设置", this.f159i ? "panOrder" : ""));
                arrayList.add(new Vod("pansou", "盘搜域名", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/39Vv/1200X800/pansou.jpg/webp", new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("pansouUrl").getAsString(), this.f159i ? "pansou" : ""));
                if ("Go多线程".equals(new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("proxyMode").getAsString())) {
                    str5 = "当前模式:GO多线程";
                    str6 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/CsBn/1200X800/go.jpg/webp";
                } else {
                    str5 = "当前模式:Java多线程";
                    str6 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/QjfE/1200X800/java.jpg/webp";
                }
                arrayList.add(new Vod("proxyMode", "多线程代理模式", str6, str5, this.f159i ? "proxyMode" : ""));
                arrayList.add(new Vod("backup", "数据备份", "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/sAhl/1200X800/backup.jpg/webp", "点击设置", this.f159i ? "backup" : ""));
                if ("开启".equals(new JsonParser().parse(Path.read(Path.tv("/config.json"))).getAsJsonObject().get("update").getAsString())) {
                    str7 = "检查更新";
                    str8 = "当前状态:已开启";
                } else {
                    str7 = "检查更新";
                    str8 = "当前状态:已关闭";
                }
                c2194e = new Vod("update", str7, "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/ZnKX/1200X800/update.jpg/webp", str8, this.f159i ? "update" : "");
            }
            arrayList.add(c2194e);
            C2192c c2192c2 = new C2192c();
            c2192c2.m5817i(1, 1, 1, 1);
            c2192c2.m5829w(arrayList);
            return c2192c2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            Init.interceptActivityStart();
            m490p(list.get(0));
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject("{\"综合配置\":\"other\",\"夸克网盘配置\":\"quark\",\"UC网盘配置\":\"uc\",\"百度网盘配置\":\"baidu\",\"迅雷云盘配置\":\"xunlei\",\"光鸭云盘配置\":\"guangya\",\"天翼云盘配置\":\"cloud189\",\"123云盘配置\":\"cloud123\",\"阿里云盘配置\":\"alipan\",\"移动云盘配置\":\"cloud139\",\"哔哩配置\":\"bili\",\"重置配置\":\"recovery\"}");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                arrayList.add(new Class(jSONObject.optString(next), next, null));
            }
            return Result.string(arrayList, new ArrayList());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void init(Context context, String str) {
        Init.checkPermission();
        try {
            this.f159i = C2256I.m6112f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
