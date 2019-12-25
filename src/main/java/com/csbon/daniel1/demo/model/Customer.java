package com.csbon.daniel1.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@Data
@NoArgsConstructor
public class Customer {
    private Integer id = null;
    private String name = null;
    private Calendar customerSince = null;

}
