package com.example.takehomeorder.model.requst;


import jakarta.persistence.Column;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class OrderRequest {
  private Integer userId;
  private Integer productId;
  private Integer quantity;
}
