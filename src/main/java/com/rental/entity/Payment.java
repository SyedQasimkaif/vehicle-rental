package com.rental.entity;
import jakarta.persistence.*;
import lombok.*;
import java.security.Timestamp;
import java.time.LocalDateTime;
@SuppressWarnings("unused")
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    private String id;
    private String payerId;
    private double paymentAmount;
    private String paymentMode;
    private String paymentStatus;
    private LocalDateTime paymentDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPayerId() {
		return payerId;
	}
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

    // Getters and Setters
}
