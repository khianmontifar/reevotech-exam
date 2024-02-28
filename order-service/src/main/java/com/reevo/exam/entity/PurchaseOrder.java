package com.reevo.exam.entity;

import com.reevo.exam.enums.OrderStatus;
import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Data
@ToString
public class PurchaseOrder {
    private UUID id;
    private int productId;
    private int userId;
    private OrderStatus status;
    private double price;
}
