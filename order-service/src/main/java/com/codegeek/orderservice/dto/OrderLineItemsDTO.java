package com.codegeek.orderservice.dto;

import java.math.BigDecimal;

public record OrderLineItemsDTO(Long id, String skuCode, BigDecimal price, Integer quantity) {
}
