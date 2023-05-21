package com.codegeek.orderservice.dto;

import com.codegeek.orderservice.model.OrderLineItems;

import java.util.List;

public record OrderRequest(List<OrderLineItemsDTO> orderLineItemsDTOList) {
}
