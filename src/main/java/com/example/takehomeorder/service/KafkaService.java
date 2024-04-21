package com.example.takehomeorder.service;

import com.example.takehomeorder.model.Order;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

  @Autowired
  private KafkaTemplate kafkaTemplate;

  public String addOder(Order order){
    Gson gson = new Gson();
    String json = gson.toJson(order);
    System.out.println("json:"+json);
    kafkaTemplate.send("order",json);
    return null;
  }

}
