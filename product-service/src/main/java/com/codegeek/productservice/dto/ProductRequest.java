package com.codegeek.productservice.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@JsonSerialize
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record ProductRequest(String name, String description, BigDecimal price) {
}
