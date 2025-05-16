package com.ecommerce.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class CustomerDto {

   @NotNull
   @Size(min=1, max = 10)
   private String firstName;

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public CustomerDto(String firstName) {
      this.firstName = firstName;
   }

   public String getFirstName() {
      return firstName;
   }
}


