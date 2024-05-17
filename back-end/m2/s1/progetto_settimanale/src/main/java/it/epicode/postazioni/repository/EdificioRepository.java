package it.epicode.postazioni.repository;

import it.epicode.postazioni.entity.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {
}
