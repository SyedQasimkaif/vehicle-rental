package com.rental.service;
import java.io.ByteArrayInputStream;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rental.entity.Report;
import com.rental.repository.ReportRepository;

@SuppressWarnings("unused")
@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    // Fetch all reports
    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }
    // Save or update report
    public void saveReport(Report report) {
        reportRepository.save(report);
    }
}
