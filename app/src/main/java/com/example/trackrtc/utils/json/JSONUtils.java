package com.example.trackrtc.utils.json;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;

public class JSONUtils {

    /**
     * Iterate over all keys of the JSON
     *
     * @param jsonObject the json object
     * @return the hash map
     */
    public static HashMap<String, String> iterateOverJSON(JSONObject jsonObject) {
        Iterator<String> iter = jsonObject.keys();
        HashMap<String, String> keyValueMap = new HashMap<>();
        while (iter.hasNext()) {
            String key = iter.next();
            try {
                String value = jsonObject.getString(key);
                keyValueMap.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return keyValueMap;
    }

    private JSONUtils() {
        throw new UnsupportedOperationException(
                "Should not create instance of Util class. Please use as static..");
    }

    /**
     * Read and parse a JSON file stored in assets folder
     *
     * @param context  the context
     * @param filename the filename
     * @return the json object
     */
    public JSONObject loadJSONFromAsset(Context context, String filename) {
        String json = null;
        JSONObject jsonObject = null;
        try {

            InputStream is = context.getAssets().open(filename);

            int size = is.available();

            byte[] buffer = new byte[size];

            final int read = is.read(buffer);
            is.close();
            if (read > 0) {
                json = new String(buffer, StandardCharsets.UTF_8);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }

        try {
            jsonObject = new JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
