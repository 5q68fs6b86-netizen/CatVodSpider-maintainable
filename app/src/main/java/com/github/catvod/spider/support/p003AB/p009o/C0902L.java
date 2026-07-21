package com.github.catvod.spider.support.p003AB.p009o;

import com.github.catvod.crawler.SpiderDebug;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0902L {
    /* JADX INFO: renamed from: a */
    public static void m2182a(String str) {
        try {
            int iWaitFor = Runtime.getRuntime().exec(str).waitFor();
            if (iWaitFor == 0) {
                return;
            }
            throw new RuntimeException("Shell command failed with exit code " + iWaitFor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2183b(String str) {
        try {
            String str2 = "nohup " + str + " 2>&1 &";
            SpiderDebug.log("execNoHupIgnoreInfoWarn:  " + str2);
            Process processExec = Runtime.getRuntime().exec(str2);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (!line.toLowerCase().contains("info") && !line.toLowerCase().contains("warn") && !line.toLowerCase().contains("error")) {
                    SpiderDebug.log(line);
                }
            }
            int iWaitFor = processExec.waitFor();
            if (iWaitFor != 0) {
                SpiderDebug.log(String.format("Shell command failed with exit code '%s'", Integer.valueOf(iWaitFor)));
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
