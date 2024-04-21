package com.example.takehomeorder.controller;

import com.example.takehomeorder.model.Order;
import com.example.takehomeorder.model.requst.OrderRequest;
import com.example.takehomeorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
  @Autowired
  private OrderService orderService;

  @PostMapping()
  public ResponseEntity<?> createOrder(@RequestBody OrderRequest request) {
    return ResponseEntity.ok(orderService.createOrder(request));
  }

  @DeleteMapping("/{id}")
  public String deleteById(@PathVariable Integer id) {
    orderService.deleteById(id);
    return "success";
  }

  @GetMapping("/{id}")
  public Order getById(@PathVariable Integer id) {
    return  orderService.getById(id);
  }

  @GetMapping()
  public List<Order> getAll() {
    return orderService.getAll();
  }

  @GetMapping("/page/{userId}")
  public Page<Order> getByPage( @PathVariable Integer userId,
                                @RequestParam Integer pageNumber,
                                @RequestParam Integer pageSize,
                                @RequestParam(required = false) List<String> sorts) {
    return orderService.getByPage(userId,pageNumber,pageSize,sorts);
  }
}
