package com.ex.crm.Utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtli{



    public static String toString(Object src) {
        if (src == null) {
            return null;
        }
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        return gson.toJson(src);
    }





}


