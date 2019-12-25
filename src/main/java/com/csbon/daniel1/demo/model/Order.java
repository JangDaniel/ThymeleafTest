package com.csbon.daniel1.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor
public class Order {
    private Integer id = null;
    private Calendar date = null;
    private Customer customer = null;
    private Set<OrderLine> orderLines = new LinkedHashSet<OrderLine>();
}
