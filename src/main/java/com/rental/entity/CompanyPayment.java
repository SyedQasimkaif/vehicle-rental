package com.rental.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@SuppressWarnings("unused")
@Entity
@Table(name = "company_payment")
public class CompanyPayment {

    @Id
    private String id;
    private String userId;
    private String paymentId;
    private float amountReceived;
    private String paymentStatus;
    private float balance;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public float getAmountReceived() {
		return amountReceived;
	}
	public void setAmountReceived(float amountReceived) {
		this.amountReceived = amountReceived;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}

    // Getters and Setters
}
