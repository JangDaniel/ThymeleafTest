package com.csbon.daniel1.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class OrderLine {
    private Product product = null;
    private Integer amount = null;
    private BigDecimal purchasePrice = null;
}
