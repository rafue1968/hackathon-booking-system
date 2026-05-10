package com.rafue.hackathon_booking.service;

import org.springframework.stereotype.Service;

import com.rafue.hackathon_booking.model.Booking;
import com.rafue.hackathon_booking.repository.BookingRepository;

@Service
public class BookingService {
    private BookingRepository repo;

    public BookingService(BookingRepository repo){
        this.repo = repo;
    }

    public String createBooking(Booking booking) throws Exception {
        return repo.save(booking);
    }
}
