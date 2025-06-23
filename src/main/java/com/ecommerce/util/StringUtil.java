package com.ecommerce.util;

public class StringUtil {

    public static String formatName(String ad)
    {
        ad = ad.trim();
        return ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
    }
}
