package com.rafue.hackathon_booking.service;

import org.springframework.stereotype.Service;

import com.rafue.hackathon_booking.model.Hackathon;
import com.rafue.hackathon_booking.repository.HackathonRepository;

@Service
public class HackathonService {
    private final HackathonRepository repo;

    public HackathonService(HackathonRepository repo){
        this.repo = repo;
    }

    public String createHackathon(Hackathon hackathon)
                throws Exception {
            return repo.save(hackathon);
        }
}
