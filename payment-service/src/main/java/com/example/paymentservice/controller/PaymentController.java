package com.example.paymentservice.controller;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.service.PaymentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment-service")
public class PaymentController {
@Autowired
    private PaymentService paymentService;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment) throws JsonProcessingException {
        return paymentService.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrderId(@PathVariable int orderId) throws JsonProcessingException {
        return paymentService.findPaymentHistoryByOrderId(orderId);
    }
}
