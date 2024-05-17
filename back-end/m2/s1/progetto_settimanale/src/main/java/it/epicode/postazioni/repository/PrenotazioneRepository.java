package it.epicode.postazioni.repository;

import it.epicode.postazioni.entity.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
}
