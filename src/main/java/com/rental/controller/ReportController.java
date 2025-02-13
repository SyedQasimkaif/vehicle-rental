package com.rental.controller;
import com.rental.entity.Report;
import com.rental.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.io.ByteArrayInputStream;
import java.util.List;
@SuppressWarnings("unused")
@Controller
@RequestMapping("/reports")
public class ReportController {
    @Autowired
    private ReportService reportService;

    // Display all reports
    @GetMapping
    public String listAllReports(Model model) {
        List<Report> reports = reportService.getAllReports();
        model.addAttribute("reports", reports);
        return "reportList";
    }

    // Optionally add a method to create a new report
}
