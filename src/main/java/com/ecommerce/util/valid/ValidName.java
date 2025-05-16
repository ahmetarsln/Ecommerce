package com.ecommerce.util.valid;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NameValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidName {
    String message() default "Geçersiz isim: boşluk veya sayı içeremez!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
