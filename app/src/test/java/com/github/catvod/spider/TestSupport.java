package com.github.catvod.spider;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

final class TestSupport {

    static JsonObject object(String response) {
        assertNotNull("Spider response is null", response);
        assertFalse("Spider response is empty", response.isEmpty());
        JsonElement element = JsonParser.parseString(response);
        assertTrue("Spider response is not a JSON object", element.isJsonObject());
        return element.getAsJsonObject();
    }

    static JsonArray nonEmptyArray(JsonObject object, String key) {
        assertTrue("Missing array: " + key, object.has(key) && object.get(key).isJsonArray());
        JsonArray array = object.getAsJsonArray(key);
        assertFalse("Empty array: " + key, array.isEmpty());
        return array;
    }

    static JsonObject first(JsonObject object, String key) {
        return nonEmptyArray(object, key).get(0).getAsJsonObject();
    }

    static String string(JsonObject object, String key) {
        assertTrue("Missing value: " + key, object.has(key) && !object.get(key).isJsonNull());
        String value = object.get(key).getAsString();
        assertFalse("Empty value: " + key, value.isEmpty());
        return value;
    }

    static String firstPlayUrl(JsonObject detail) {
        String playUrl = string(first(detail, "list"), "vod_play_url");
        String firstSource = playUrl.split("\\$\\$\\$", 2)[0];
        String firstEpisode = firstSource.split("#", 2)[0];
        int separator = firstEpisode.indexOf('$');
        assertTrue("Invalid play item: " + firstEpisode, separator > 0 && separator < firstEpisode.length() - 1);
        return firstEpisode.substring(separator + 1);
    }

    private TestSupport() {
    }
}
