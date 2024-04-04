package com.example.paymentservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "payment")
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
@Id
@GeneratedValue
private int paymentId;
    private String paymentStatus;
    private String transactionId;
    private int orderId;
    private double amount;
}
