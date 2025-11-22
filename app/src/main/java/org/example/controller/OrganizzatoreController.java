package org.example.controller;

import org.example.models.Staff.Organizzatore;
import org.example.service.OrganizzatoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/organizzatore")
public class OrganizzatoreController {
    private final OrganizzatoreService organizzatoreService;

    public OrganizzatoreController(OrganizzatoreService organizzatoreService) {
        this.organizzatoreService = organizzatoreService;
    }

    @GetMapping
    public List<Organizzatore> getOrganizzatori() {
        return organizzatoreService.getAll();
    }

    @PostMapping
    public Organizzatore addOrganizzatore(@RequestBody Organizzatore organizzatore) {
        return organizzatoreService.save(organizzatore);
    }
}
