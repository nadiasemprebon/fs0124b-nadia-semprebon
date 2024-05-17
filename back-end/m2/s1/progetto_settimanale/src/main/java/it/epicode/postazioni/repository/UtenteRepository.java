package it.epicode.postazioni.repository;

import it.epicode.postazioni.entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
