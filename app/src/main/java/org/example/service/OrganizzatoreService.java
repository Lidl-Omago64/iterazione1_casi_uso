package org.example.service;

import org.example.models.Staff.Organizzatore;
import org.example.repository.OrganizzatoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizzatoreService {
    private final OrganizzatoreRepository organizzatoreRepository;

    public OrganizzatoreService(OrganizzatoreRepository organizzatoreRepository) {
        this.organizzatoreRepository = organizzatoreRepository;
    }

    public List<Organizzatore> getAll() {
        return organizzatoreRepository.findAll();
    }

    public Organizzatore getById(int id) {
        return organizzatoreRepository.findById(id).orElse(null);
    }

    public Organizzatore save(Organizzatore organizzatore) {
        return organizzatoreRepository.save(organizzatore);
    }

}
