package com.example.orderservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "order_tb")
public class Order {
    @Id
    private int orderId;
    private String name;
    private int qty;
    private double price;
}
