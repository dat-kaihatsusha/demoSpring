package com.example.demospring.controllers;

import com.example.demospring.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
  @GetMapping("")
    //this request is: http://localhost:8080/api/v1/Products
  List<Product> getAllProduct() {
    List<Product> a = new ArrayList<Product>();
    a.add(new Product(1L, "Macbook pro 16 inch", 2020, 2400.0, ""));
    a.add(new Product(2L, "Ipad", 2020, 2400.0, ""));
    return a;
  }
}
