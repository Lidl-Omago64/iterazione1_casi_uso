package org.example.service;

import org.example.Dto.HackathonRequestDto;
import org.example.models.Hackathon;
import org.example.models.Staff.Organizzatore;
import org.example.repository.HackathonRespository;
import org.example.repository.OrganizzatoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HackathonService {
    private final HackathonRespository hackathonRespository;
    private final OrganizzatoreRepository organizzatoreRepository;

    public HackathonService(HackathonRespository hackathonRespository, OrganizzatoreRepository organizzatoreRepository) {
        this.hackathonRespository = hackathonRespository;
        this.organizzatoreRepository = organizzatoreRepository;
    }

    public List<Hackathon> getAllHackathons() {
        return hackathonRespository.findAll();
    }

    public Hackathon addHackathon(HackathonRequestDto dto) {

        Hackathon hackathon = dto.toEntity();

        // Recupero l'organizzatore dal DB
        Organizzatore organizzatore = organizzatoreRepository
                .findById(dto.organizzatoreId())
                .orElseThrow(() -> new RuntimeException("Organizzatore non trovato"));

        // Lo assegno all’hackathon
        hackathon.setOrganizzatore(organizzatore);

        return hackathonRespository.save(hackathon);
    }
}
