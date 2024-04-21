package com.example.takehomeorder.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Product {

  private Integer productId;
  private String name;
  private String description;
  private Double unitPrice;
  private Integer quantity;
}
