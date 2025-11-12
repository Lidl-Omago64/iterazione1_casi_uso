package org.example.service;

import org.example.models.Hackathon;
import org.example.repository.HackathonRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HackathonService {
    private final HackathonRespository hackathonRespository;

    public HackathonService(HackathonRespository hackathonRespository) {
        this.hackathonRespository = hackathonRespository;
    }

    public List<Hackathon> getAllHackathons() {
        return hackathonRespository.findAll();
    }

    public Hackathon addHackathon(Hackathon hackathon) {
        return hackathonRespository.save(hackathon);
    }
}
