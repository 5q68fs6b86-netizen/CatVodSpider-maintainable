package com.github.catvod.spider.support.p001A;

import android.content.DialogInterface;
import android.util.Log;
import com.github.catvod.spider.support.p128m.C2253G;
import com.github.catvod.spider.support.p128m.C2256I;
import com.github.catvod.spider.support.p128m.C2268k;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p001A.h */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0095h implements DialogInterface.OnClickListener {
    private C2253G.HomePageOption optionListener;

    public DialogInterfaceOnClickListenerC0095h(C2253G.HomePageOption homePageOption) {
        this.optionListener = homePageOption;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        boolean[] selectedOptions = this.optionListener.getSelectedOptions();
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"猜你喜欢", "热门电影", "热播剧集", "热门动漫", "热播综艺", "电影筛选", "电视筛选", "电影榜单", "电视剧榜单"};
        for (int i2 = 0; i2 < selectedOptions.length; i2++) {
            if (selectedOptions[i2]) {
                arrayList.add(strArr[i2]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (i3 > 0) {
                sb.append(",");
            }
            sb.append((String) arrayList.get(i3));
        }
        String string = sb.toString();
        try {
            File fileM6169c = C2268k.m6169c("/config.json");
            JSONObject jSONObject = new JSONObject();
            if (fileM6169c.exists() && ((int) fileM6169c.length()) > 0) {
                String strM6164a = C2268k.m6164a(fileM6169c);
                if (strM6164a.length() > 0) {
                    jSONObject = new JSONObject(strM6164a);
                }
            }
            jSONObject.put("homePage", string);
            C2268k.m6168c(fileM6169c, jSONObject.toString());
            Log.i("Config", "配置已保存到config.json, homepage: " + string);
            if (string.length() == 0) {
                C2256I.m6113i("主页分类不能为空，已恢复默认配置！");
            } else {
                C2256I.m6113i("主页分类已设置: \n" + string);
            }
            dialogInterface.dismiss();
        } catch (Exception e) {
            C2256I.m6113i("分类设置失败: " + e);
            Log.e("Config", "保存配置失败", e);
        }
    }
}
