package com.github.catvod.spider;

import com.google.gson.JsonObject;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.Collections;
import java.util.HashMap;

import static com.github.catvod.spider.TestSupport.first;
import static com.github.catvod.spider.TestSupport.firstPlayUrl;
import static com.github.catvod.spider.TestSupport.nonEmptyArray;
import static com.github.catvod.spider.TestSupport.object;
import static com.github.catvod.spider.TestSupport.string;
import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 35)
public class KanqiuTest {

    private static final String SITE = "https://www.88kanqiu.tw";
    private static final Kanqiu spider = new Kanqiu();
    private static JsonObject category;
    private static JsonObject detail;

    @BeforeClass
    public static void setUp() {
        spider.init(null, SITE);
    }

    @Test
    public void init() {
        spider.init(null, SITE);
        nonEmptyArray(category(), "list");
    }

    @Test
    public void homeContent() throws Exception {
        JsonObject result = object(spider.homeContent(false));
        nonEmptyArray(result, "class");
    }

    @Test
    public void categoryContent() {
        nonEmptyArray(category(), "list");
    }

    @Test
    public void detailContent() {
        firstPlayUrl(detail());
    }

    @Test
    public void playerContent() {
        String url = firstPlayUrl(detail());
        JsonObject result = object(spider.playerContent("Qile", url, Collections.emptyList()));
        assertEquals(url.replace("***", "#"), string(result, "url"));
        assertEquals(1, result.get("parse").getAsInt());
    }

    private static synchronized JsonObject category() {
        if (category == null) category = object(spider.categoryContent("", "1", false, new HashMap<>()));
        return category;
    }

    private static synchronized JsonObject detail() {
        if (detail == null) {
            String id = string(first(category(), "list"), "vod_id");
            detail = object(spider.detailContent(Collections.singletonList(id)));
        }
        return detail;
    }
}
