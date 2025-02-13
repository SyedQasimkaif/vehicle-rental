package com.rental.service;
import com.rental.entity.Payment;
import com.rental.repository.PaymentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    // Fetch all payments
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Fetch payments by Payer ID
    public List<Payment> getPaymentsByPayerId(String payerId) {
        return paymentRepository.findByPayerId(payerId);
    }
}
