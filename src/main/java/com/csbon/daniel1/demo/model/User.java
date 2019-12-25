package com.csbon.daniel1.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String firstName = null;
    private String lastName = null;
    private String nationality = null;
    private Integer age = null;


}
