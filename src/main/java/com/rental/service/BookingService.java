package com.rental.service;
import com.rental.entity.Booking;
import com.rental.repository.BookingRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    // Fetch all bookings
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // Fetch bookings by user ID
    public List<Booking> getBookingsByUserId(String userId) {
        return bookingRepository.findByUserId(userId);
    }
}
