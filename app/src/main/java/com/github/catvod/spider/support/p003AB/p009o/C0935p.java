package com.github.catvod.spider.support.p003AB.p009o;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.p */
/* JADX INFO: loaded from: classes.dex */
final class C0935p extends ArrayAdapter<String> {

    /* JADX INFO: renamed from: a */
    final C0936q f2205a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0935p(C0936q c0936q, Context context, List list) {
        super(context, R.layout.simple_list_item_1, list);
        this.f2205a = c0936q;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getView(i, view, viewGroup);
        String string = textView.getText().toString();
        int iIndexOf = string.indexOf("\n");
        if (iIndexOf >= 0) {
            string = string.substring(0, iIndexOf);
        }
        textView.setText(string);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int iM2266r = this.f2205a.m2266r(12);
        textView.setPadding(iM2266r, this.f2205a.m2266r(4), iM2266r, this.f2205a.m2266r(4));
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        return textView;
    }
}
