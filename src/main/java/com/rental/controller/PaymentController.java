package com.rental.controller;
import com.rental.entity.Payment;
import com.rental.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // Display all payments
    @GetMapping
    public String listAllPayments(Model model) {
        List<Payment> payments = paymentService.getAllPayments();
        model.addAttribute("payments", payments);
        return "paymentList";
    }

    // Display payments by payer ID
    @GetMapping("/user/{payerId}")
    public String listPaymentsByPayerId(@PathVariable String payerId, Model model) {
        List<Payment> payments = paymentService.getPaymentsByPayerId(payerId);
        model.addAttribute("payments", payments);
        return "userPaymentList";
    }
}
