package com.github.catvod.spider.support.p001A;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import com.github.catvod.spider.support.p128m.C2256I;
import com.github.catvod.spider.support.p128m.C2268k;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p001A.d */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0091d implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        String str = null;
        switch (((AlertDialog) dialogInterface).getListView().getCheckedItemPosition()) {
            case 0:
                str = "UC原画";
                break;
            case 1:
                str = "UC普画";
                break;
            case 2:
                str = "UC无限";
                break;
            case 3:
                str = "UC原画|UC普画";
                break;
            case 4:
                str = "UC普画|UC原画";
                break;
        }
        try {
            File fileM6169c = C2268k.m6169c("/config.json");
            JSONObject jSONObject = new JSONObject();
            if (fileM6169c.exists() && ((int) fileM6169c.length()) > 0) {
                String strM6164a = C2268k.m6164a(fileM6169c);
                if (strM6164a.length() > 0) {
                    jSONObject = new JSONObject(strM6164a);
                }
            }
            jSONObject.put("ucQuality", str);
            C2268k.m6168c(fileM6169c, jSONObject.toString());
            Log.i("Config", "配置已保存到config.json, ucQuality: " + str);
            C2256I.m6113i("UC画质已更新: " + str);
            dialogInterface.dismiss();
        } catch (Exception e) {
            C2256I.m6113i("画质设置失败: " + e);
            Log.e("Config", "保存配置失败", e);
        }
    }
}
