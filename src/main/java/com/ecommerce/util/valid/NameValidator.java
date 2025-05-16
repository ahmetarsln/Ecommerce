package com.ecommerce.util.valid;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<ValidName, String> {

    @Override
    public boolean isValid(String ad, ConstraintValidatorContext context) {
        if (ad == null || ad.trim().isEmpty()) {
            return false;
        }

        // Harflerden oluşmalı ve boşluk içermemeli
        if (!ad.matches("^[a-zA-ZğüşöçİĞÜŞÖÇ]+$")) {
            return false;
        }

        return true;
    }
}
