package com.rafue.hackathon_booking.repository;

import java.util.concurrent.ExecutionException;

import com.google.cloud.firestore.CollectionReference;
import com.google.firebase.cloud.FirestoreClient;
import com.rafue.hackathon_booking.model.Booking;

public class BookingRepository {
    private final CollectionReference bookings = FirestoreClient.getFirestore().collection("bookings");
    
    public String save(Booking booking) throws ExecutionException, InterruptedException {
        return bookings.add(booking).get().getId();
    }
}
