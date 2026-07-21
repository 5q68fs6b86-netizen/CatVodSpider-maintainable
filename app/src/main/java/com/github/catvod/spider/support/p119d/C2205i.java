package com.github.catvod.spider.support.p119d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.d.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2205i {

    /* JADX INFO: renamed from: a */
    @SerializedName("video_preview_play_info")
    private a f5371a;

    /* JADX INFO: renamed from: b */
    @SerializedName("drive_id")
    private String f5372b;

    /* JADX INFO: renamed from: c */
    @SerializedName("file_id")
    private String f5373c;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.d.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        @SerializedName("quick_video_list")
        private List<b> f5374a;

        /* JADX INFO: renamed from: b */
        @SerializedName("live_transcoding_subtitle_task_list")
        private List<b> f5375b;

        /* JADX INFO: renamed from: c */
        @SerializedName("live_transcoding_task_list")
        private List<b> f5376c;

        /* JADX INFO: renamed from: a */
        public final List<b> m5905a() {
            List<b> list = this.f5374a;
            if (list != null && !list.isEmpty()) {
                return list;
            }
            List<b> list2 = this.f5376c;
            return list2 == null ? Collections.emptyList() : list2;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.d.i$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        @SerializedName("template_id")
        private String f5377a;

        /* JADX INFO: renamed from: b */
        @SerializedName("language")
        private String f5378b;

        /* JADX INFO: renamed from: c */
        @SerializedName("status")
        private String f5379c;

        /* JADX INFO: renamed from: d */
        @SerializedName("url")
        private String f5380d;

        /* JADX INFO: renamed from: a */
        public final String m5906a() {
            return TextUtils.isEmpty(this.f5377a) ? "" : this.f5377a;
        }

        /* JADX INFO: renamed from: b */
        public final String m5907b() {
            return TextUtils.isEmpty(this.f5380d) ? "" : this.f5380d;
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m5904a() {
        a aVar = this.f5371a;
        return aVar == null ? new a() : aVar;
    }
}
