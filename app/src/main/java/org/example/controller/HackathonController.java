package org.example.controller;

import org.example.Dto.HackathonRequestDto;
import org.example.models.Hackathon;
import org.example.service.HackathonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/hackathon")
public class HackathonController {

    private final HackathonService hackathonService;

    public HackathonController(HackathonService hackathonService) {
        this.hackathonService = hackathonService;
    }

    @GetMapping
    public List<Hackathon> getAllHackathon() {
        return hackathonService.getAllHackathons();
    }

    @PostMapping
    public Hackathon addHackathon(@RequestBody HackathonRequestDto dto) {
        return hackathonService.addHackathon(dto);
    }
}


