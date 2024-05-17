package it.epicode.postazioni.repository;

import it.epicode.postazioni.entity.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
}
