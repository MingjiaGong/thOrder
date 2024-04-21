package com.example.takehomeorder.service;


import com.example.takehomeorder.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


import java.net.URI;

@Component
public class CheckInventoryService {

  private final RestTemplate restTemplate;
  private final String inventoryServiceUrl = "http://localhost:8081/product";

  public CheckInventoryService() {
    this.restTemplate = new RestTemplate();
  }

  public Product checkInventory(Integer productId) {
    try {
      return restTemplate.getForObject(inventoryServiceUrl + "/" + productId, Product.class);
    } catch (Exception e) {
      throw new RuntimeException("HTTP error: " + e.getMessage(), e);
    }
}

  public void updateInventory(Integer productId,int quantityChange) {
    try {
      String baseUrl = inventoryServiceUrl+"/quantity/"+productId;
      String url = UriComponentsBuilder.fromUriString(baseUrl)
              .queryParam("quantity", quantityChange)
              .toUriString();
      System.out.println(url);
      restTemplate.put(url, null, Void.class);
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage(), e);
    }
  }


}
