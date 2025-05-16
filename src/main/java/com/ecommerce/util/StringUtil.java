package com.ecommerce.util;

public class StringUtil {

    public static String formatFirstName(String firstName) {
        // Null kontrolü
        if (firstName == null) {
            return null;
        }

        // Trim işlemi
        String trimmedName = firstName.trim();

        // Boş string kontrolü (trim sonrası)
        if (trimmedName.isEmpty()) {
            return null;
        }

        // Sayı içeriyor mu kontrolü
        if (trimmedName.matches(".*\\d.*")) {
            return null;
        }

        // İlk harf büyük, diğerleri küçük
        return trimmedName.substring(0, 1).toUpperCase()
                + trimmedName.substring(1).toLowerCase();
    }
}
