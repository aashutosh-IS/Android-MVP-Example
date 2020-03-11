package com.ex.crm.Utils;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;



public class SharedPreferenceUtil {
    private static SharedPreferences sharedPreference;


    public static void init(Context context) {
        sharedPreference = context.getSharedPreferences("SHARED_PREFERENCE", Context.MODE_PRIVATE);
    }

    public static SharedPreferences getDefaultSharedPreference() {
        return sharedPreference;
    }


    public static SharedPreferences.Editor getPreferenceEditor() {
        return sharedPreference.edit();
    }


    public static void updateBulkSharedPreferencesValue(HashMap<String, String> data) {
        SharedPreferences.Editor editor = sharedPreference.edit();
        for (String key : data.keySet()) {
            editor.putString(key, data.get(key));
        }
        editor.apply();
    }
}
