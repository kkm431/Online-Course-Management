package com.online_course_management.service;

import org.springframework.stereotype.Service;

import com.online_course_management.payment.Payment;

@Service
public class PaymentService {
    public void makePayment(Payment paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
