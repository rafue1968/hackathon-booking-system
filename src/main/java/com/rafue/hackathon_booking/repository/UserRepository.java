package com.rafue.hackathon_booking.repository;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Repository;

import com.google.cloud.firestore.CollectionReference;
import com.google.firebase.cloud.FirestoreClient;
import com.rafue.hackathon_booking.model.User;

@Repository
public class UserRepository {
    private final CollectionReference users = FirestoreClient.getFirestore().collection("users");

    public String save(User user) throws ExecutionException, InterruptedException {
        return users.add(user).get().getId();
    }
}
