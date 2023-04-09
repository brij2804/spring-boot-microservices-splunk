package com.brijesh.splunk.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private int id;
    private String name;

    private int qty;

    private int price;
}
