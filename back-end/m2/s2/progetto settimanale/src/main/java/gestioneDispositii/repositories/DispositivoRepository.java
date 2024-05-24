package gestioneDispositii.repositories;

import gestioneDispositii.entities.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DispositivoRepository extends JpaRepository<Dispositivo,Long> {
}
