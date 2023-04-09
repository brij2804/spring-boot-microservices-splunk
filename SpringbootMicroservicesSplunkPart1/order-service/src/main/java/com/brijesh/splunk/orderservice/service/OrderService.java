package com.brijesh.splunk.orderservice.service;

import com.brijesh.splunk.orderservice.dto.Order;
import com.brijesh.splunk.orderservice.util.Mapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {

    Logger logger = LogManager.getLogger(OrderService.class);

    private List<Order> list = new ArrayList<>();

    public List<Order> getOrders(){
        logger.info("OrderService : getOrders() : started");
     List<Order> lst= null;
     lst= list;
        logger.info("OrderService:addOrder request payload{} ", Mapper.mapToJasonString(list));

        logger.info("OrderService : getOrders() : ended");
     return lst;
    }

    public Order getOrder(int id){
        logger.info("OrderService : getOrder() : started");
        Order order = list.stream()
                .filter(ord -> ord.getId() ==id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Order not found with id "+ id));
        logger.info("OrderService : getOrder() : ended");
        return order;
    }

    public Order addOrder(Order order){
        logger.info("OrderService : addOrder() : started");
        logger.info("OrderService:addOrder request payload{} ", Mapper.mapToJasonString(order));
        list.add(order);
        logger.info("OrderService : addOrder() : ended");
        return order;
    }
}
