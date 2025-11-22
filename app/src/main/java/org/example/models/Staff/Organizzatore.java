package org.example.models.Staff;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.models.Hackathon;

import java.util.Set;

@Getter
@Setter
@Entity
public class Organizzatore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany
    private Set<Hackathon> hackathons;

    private String name;

    public Organizzatore() {}
}
