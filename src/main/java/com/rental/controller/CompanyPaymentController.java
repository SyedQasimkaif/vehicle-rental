package com.rental.controller;

import com.rental.entity.CompanyPayment;
import com.rental.service.CompanyPaymentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.rental.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@SuppressWarnings("unused")
@Controller
@RequestMapping("/company-payments")
public class CompanyPaymentController {

    @Autowired
    private CompanyPaymentService companyPaymentService;

    // Display all company payments (admin only)
    @GetMapping
    public String listAllCompanyPayments(@RequestParam String adminUsername, @RequestParam String adminPassword, Model model) {
        if (companyPaymentService.authenticateAdmin(adminUsername, adminPassword)) {
            List<CompanyPayment> payments = companyPaymentService.getAllCompanyPayments();
            model.addAttribute("companyPayments", payments);
            return "companyPaymentList";
        } else {
            return "unauthorized";
        }
    }

    // Add payment to wallet
    @PostMapping("/add-to-wallet")
    public String addPaymentToWallet(@RequestParam String userId, @RequestParam double paymentAmount) {
        companyPaymentService.addPaymentToWallet(userId, paymentAmount);
        return "redirect:/company-payments";
    }

    // Refund payment from wallet
    @PostMapping("/refund-payment")
    public String refundPaymentFromWallet(@RequestParam String userId, @RequestParam double refundAmount) {
        try {
            companyPaymentService.refundPaymentFromWallet(userId, refundAmount);
        } catch (IllegalArgumentException e) {
            return "refundFailed";
        }
        return "redirect:/company-payments";
    }
}

