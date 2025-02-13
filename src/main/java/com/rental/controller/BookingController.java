package com.rental.controller;
import com.rental.entity.Booking;
import com.rental.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Controller
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @GetMapping
    public String listAllBookings(Model model) {
        List<Booking> bookings = bookingService.getAllBookings();
        model.addAttribute("bookings", bookings);
        return "bookingList";
    }

    @GetMapping("/user/{userId}")
    public String listUserBookings(@PathVariable String userId, Model model) {
        List<Booking> bookings = bookingService.getBookingsByUserId(userId);
        model.addAttribute("bookings", bookings);
        return "userBookingList";
    }
}
