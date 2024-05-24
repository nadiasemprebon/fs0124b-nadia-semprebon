package repositories;

import entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DipendeteRepository extends JpaRepository<Dipendente, Long> {
}
