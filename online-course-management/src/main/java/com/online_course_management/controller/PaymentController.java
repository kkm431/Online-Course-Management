package com.online_course_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.online_course_management.payment.CreditCardPayment;
import com.online_course_management.payment.PayPalPayment;
import com.online_course_management.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/creditcard")
    public void payWithCreditCard(@RequestParam double amount) {
        paymentService.makePayment(new CreditCardPayment(), amount);
    }

    @PostMapping("/paypal")
    public void payWithPaypal(@RequestParam double amount) {
        paymentService.makePayment(new PayPalPayment(), amount);
    }
}
