package com.rafue.hackathon_booking.repository;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Repository;

import com.google.cloud.firestore.CollectionReference;
import com.google.firebase.cloud.FirestoreClient;
import com.rafue.hackathon_booking.model.Hackathon;;

@Repository
public class HackathonRepository {
    private final CollectionReference hackathons = FirestoreClient.getFirestore().collection("hackathons");

    public String save(Hackathon hackathon)
                throws ExecutionException, InterruptedException {
            return hackathons.add(hackathon).get().getId();
        }
}
