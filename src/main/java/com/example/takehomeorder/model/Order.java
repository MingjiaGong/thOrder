package com.example.takehomeorder.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "user_order")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Order {
  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer orderId;

  @Column(name = "user_id")
  private Integer userId;

  @Column(name = "product_id")
  private Integer productId;

  @Column
  private Integer quantity;

  @Column(name = "unit_price")
  private Double unitPrice;

  @Column(name = "total_price")
  private Double totalPrice;

  @Column(name = "timestamp")
  private Date timeStamp;


}
