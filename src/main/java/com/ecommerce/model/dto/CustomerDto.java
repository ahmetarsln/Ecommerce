package com.ecommerce.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

   @NotNull
   @Size(min=1, max = 10)
   private String firstName;

}