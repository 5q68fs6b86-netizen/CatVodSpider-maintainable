package com.github.catvod.spider;

import com.google.gson.JsonObject;

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
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 35)
public class JableTest {

    private static final String TYPE_ID = "bdsm";
    private static final Jable spider = new Jable();
    private static JsonObject category;
    private static JsonObject detail;

    @Test
    public void homeContent() {
        JsonObject result = object(spider.homeContent(false));
        nonEmptyArray(result, "class");
        nonEmptyArray(result, "list");
    }

    @Test
    public void categoryContent() {
        nonEmptyArray(category(), "list");
    }

    @Test
    public void detailContent() {
        JsonObject vod = first(detail(), "list");
        String playUrl = string(vod, "vod_play_url");
        assertTrue("Missing live URL: " + playUrl, playUrl.contains("$http"));
    }

    @Test
    public void searchContent() throws InterruptedException {
        String id = string(first(category(), "list"), "vod_id");
        nonEmptyArray(search(id), "list");
    }

    @Test
    public void playerContent() {
        String url = firstPlayUrl(detail());
        JsonObject result = object(spider.playerContent("Jable", url, Collections.emptyList()));
        assertEquals(url, string(result, "url"));
        assertTrue(string(result, "header").contains("User-Agent"));
    }

    private static synchronized JsonObject category() {
        if (category == null) category = object(spider.categoryContent(TYPE_ID, "1", false, new HashMap<>()));
        return category;
    }

    private static JsonObject search(String id) throws InterruptedException {
        for (int attempt = 1; attempt <= 3; attempt++) {
            String response = spider.searchContent(id, false);
            if (!response.isEmpty()) return object(response);
            if (attempt < 3) Thread.sleep(1000);
        }
        throw new AssertionError("Empty real site search response for " + id + " after 3 attempts");
    }

    private static synchronized JsonObject detail() {
        if (detail == null) {
            String id = string(first(category(), "list"), "vod_id");
            detail = object(spider.detailContent(Collections.singletonList(id)));
        }
        return detail;
    }
}
