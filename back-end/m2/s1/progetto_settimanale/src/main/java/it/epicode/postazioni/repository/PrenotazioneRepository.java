package it.epicode.postazioni.repository;

import it.epicode.postazioni.entity.Postazione;
import it.epicode.postazioni.entity.Prenotazione;
import it.epicode.postazioni.enums.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione,Long> {

    List<Prenotazione> findByPostazioneIdAndDataPrenotazione(Long postazioneId, LocalDate dataPrenotazione);
    List<Prenotazione> findByUtenteIdAndDataPrenotazione(Long utenteId, LocalDate dataPrenotazione);


}

