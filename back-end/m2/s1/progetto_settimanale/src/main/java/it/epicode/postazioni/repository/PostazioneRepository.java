package it.epicode.postazioni.repository;

import it.epicode.postazioni.entity.Postazione;
import it.epicode.postazioni.enums.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {

    @Query("SELECT p FROM Postazione p WHERE p.tipo = :tipo AND p.edificio.citta = :citta AND p.libero = true")
    List<Postazione> findAvailableByTipoAndCitta(TipoPostazione tipo, String citta);
}

