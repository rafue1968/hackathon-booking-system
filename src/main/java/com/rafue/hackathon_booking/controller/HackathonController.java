package com.rafue.hackathon_booking.controller;

// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.rafue.hackathon_booking.model.Hackathon;
import com.rafue.hackathon_booking.service.HackathonService;

@RestController
@RequestMapping("/hackathons")
public class HackathonController {
    
    private final HackathonService service;

    public HackathonController(HackathonService service){
        this.service = service;
    }

    @PostMapping
    public String createHackathon(
            @RequestBody Hackathon hackathon)
            throws Exception {
            return service.createHackathon(hackathon);
        }
}
