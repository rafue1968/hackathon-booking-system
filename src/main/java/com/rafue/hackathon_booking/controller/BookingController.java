package com.rafue.hackathon_booking.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafue.hackathon_booking.model.Booking;
import com.rafue.hackathon_booking.service.BookingService;

@RestController
@RequestMapping
public class BookingController {
    private final BookingService service;

    public BookingController(BookingService service){
        this.service = service;
    }
    
    @PostMapping
    public String createBooking(
        @RequestBody Booking booking
    ) throws Exception {
        return service.createBooking(booking);
    }
}
