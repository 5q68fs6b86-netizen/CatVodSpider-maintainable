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
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 35)
public class PTTTest {

    private static final PTT spider = new PTT();
    private static JsonObject home;
    private static JsonObject category;
    private static JsonObject detail;

    @BeforeClass
    public static void setUp() {
        spider.init(null, "");
    }

    @Test
    public void init() {
        spider.init(null, "");
        nonEmptyArray(home(), "class");
    }

    @Test
    public void homeContent() {
        nonEmptyArray(home(), "class");
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
        String id = firstPlayUrl(detail());
        JsonObject result = object(spider.playerContent("PTT", id, Collections.emptyList()));
        String url = string(result, "url");
        assertTrue(url.startsWith("http://") || url.startsWith("https://"));
    }

    @Test
    public void searchContent() {
        String key = string(first(category(), "list"), "vod_name");
        nonEmptyArray(object(spider.searchContent(key, false)), "list");
    }

    @Test
    public void pagedSearchContent() {
        String key = string(first(category(), "list"), "vod_name");
        nonEmptyArray(object(spider.searchContent(key, false, "1")), "list");
    }

    private static synchronized JsonObject home() {
        if (home == null) home = object(spider.homeContent(false));
        return home;
    }

    private static synchronized JsonObject category() {
        if (category == null) {
            String typeId = string(first(home(), "class"), "type_id");
            category = object(spider.categoryContent(typeId, "1", false, new HashMap<>()));
        }
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
