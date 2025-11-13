package org.example.Dto;

import org.example.models.BuilderHackathon;
import org.example.models.Hackathon;
import org.example.models.HackathonBuilder;
import org.example.util.State;

import java.time.LocalDateTime;

public record HackathonRequestDto(
        String nome,
        String argomento,
        String regolamento,
        String luogoEvento,
        Double premio,
        LocalDateTime scadenzaIscrizioni,
        LocalDateTime dataInizio,
        LocalDateTime dataFine,
        State stato,
        Integer capienzaMax,
        Integer capienzaMin
) {

    public Hackathon toEntity() {
        return new BuilderHackathon()
                .withName(this.nome)
                .withArgomento(this.argomento)
                .withRegolamento(this.regolamento)
                .withLuogoEvento(this.luogoEvento)
                .withPremio(this.premio)
                .withScadenzaIscrizioni(this.scadenzaIscrizioni)
                .withDataInizio(this.dataInizio)
                .withDataFine(this.dataFine)
                .withStato(this.stato)
                .withCapienzaMax(this.capienzaMax)
                .withCapienzaMin(this.capienzaMin)
                .build();
    }
}
