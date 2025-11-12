package org.example.repository;

import org.example.models.Hackathon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HackathonRespository extends JpaRepository<Hackathon, Long> {
}
