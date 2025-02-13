package com.rental.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "report")
public class Report {
    @Id
    private String id;
    private String name;
    private String vehicleName;
    private String bookingId;
    private int bookingDuration;
    private double rentalPrice;
    private double totalAmount;
    private String paymentStatus;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public int getBookingDuration() {
		return bookingDuration;
	}
	public void setBookingDuration(int bookingDuration) {
		this.bookingDuration = bookingDuration;
	}
	public double getRentalPrice() {
		return rentalPrice;
	}
	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

    // Getters and Setters
}
