package com.rental.entity;
import jakarta.persistence.*;
import lombok.*;
import java.security.Timestamp;
import java.time.LocalDateTime;
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    private String id;
    private String userId;
    private String vehicleId;
    private LocalDateTime bookingTime;
    private float bookingPrice;
    private double duration;
    private String paymentId;
    private Timestamp createdAt;
    private String bookingStatus;
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
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public LocalDateTime getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}
	public float getBookingPrice() {
		return bookingPrice;
	}
	public void setBookingPrice(float bookingPrice) {
		this.bookingPrice = bookingPrice;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

}