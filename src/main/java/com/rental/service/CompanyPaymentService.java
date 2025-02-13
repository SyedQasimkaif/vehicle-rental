package com.rental.service;
import com.rental.entity.*;
import com.rental.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;
@Service
public class CompanyPaymentService {

    @Autowired
    private CompanyPaymentRepository companyPaymentRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    // Fetch all company payments
    public List<CompanyPayment> getAllCompanyPayments() {
        return companyPaymentRepository.findAll();
    }

    // Add payment to wallet
    public void addPaymentToWallet(String userId, double paymentAmount) {
        CompanyPayment companyPayment = companyPaymentRepository.findByUserId(userId).get(0);
        companyPayment.setBalance(companyPayment.getBalance() + (float) paymentAmount);
        companyPayment.setAmountReceived((float) paymentAmount);
        companyPaymentRepository.save(companyPayment);
    }

    // Refund payment from wallet
    public void refundPaymentFromWallet(String userId, double refundAmount) {
        CompanyPayment companyPayment = companyPaymentRepository.findByUserId(userId).get(0);
        if (companyPayment.getBalance() >= refundAmount) {
            companyPayment.setBalance(companyPayment.getBalance() - (float) refundAmount);
            companyPayment.setPaymentStatus("Refunded");
            companyPaymentRepository.save(companyPayment);
        } else {
            throw new IllegalArgumentException("Insufficient wallet balance for refund.");
        }
    }

    // Validate booking and payment timestamps
    public boolean validateBookingAndPayment(String bookingId, String paymentId) {
        Booking booking = bookingRepository.findById(bookingId)
            .orElseThrow(() -> new RuntimeException("Booking not found"));
        Payment payment = paymentRepository.findById(paymentId)
            .orElseThrow(() -> new RuntimeException("Payment not found"));

        // Check for null dates
        if (payment.getPaymentDate() == null || booking.getBookingTime() == null) {
            throw new IllegalArgumentException("Booking time or payment date cannot be null");
        }

        // Compare dates using isAfter for LocalDateTime
        return payment.getPaymentDate().isAfter(booking.getBookingTime());
    }



    // Authenticate admin user
    public boolean authenticateAdmin(String adminUsername, String adminPassword) {
        // You should use encrypted passwords and proper authentication in production
        return "admin".equals(adminUsername) && "password".equals(adminPassword);
    }
}
