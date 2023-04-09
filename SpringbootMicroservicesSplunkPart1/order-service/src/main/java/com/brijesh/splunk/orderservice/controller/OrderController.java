package com.brijesh.splunk.orderservice.controller;

import com.brijesh.splunk.orderservice.dto.Order;
import com.brijesh.splunk.orderservice.service.OrderService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    Logger logger = LogManager.getLogger(OrderController.class);

    @Autowired
    private OrderService service;


    @GetMapping
    public List<Order> getOrders(){
        logger.info("OrderController: getOrders():   -- started");
    List<Order> orders = service.getOrders();
        logger.info("OrderController: getOrders():   -- ended");
      return orders;
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id){
        logger.info("OrderController: getOrder():   -- started");
    Order order = service.getOrder(id);
        logger.info("OrderController: getOrder():   -- ended");
    return order;
    }

    @PostMapping
    public Order placeOrder(@RequestBody Order order){
        logger.info("OrderController: placeOrder():   -- started");
        Order order1 = service.addOrder(order);
        logger.info("OrderController: placeOrder():   -- ended");
        return order1;
    }
}