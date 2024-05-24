package services;

import entities.Dipendente;
import entities.Dispositivo;
import enums.StatoDispositivo;
import exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import repositories.DipendeteRepository;
import repositories.DispositivoRepository;

public class DipendenteService {
    @Autowired
    private DipendeteRepository dipendeteRepository;

    public Dipendente save(Dipendente body){
        return dipendeteRepository.save(body);
    }

    public Page<Dipendente> getDispositivi(int page, int size, String sort) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sort));
        return dipendeteRepository.findAll(pageable);
    }

    public Dipendente findById(Long id){
        return dipendeteRepository.findById(id).orElseThrow(()-> new NotFoundException(id));
    }

    public void findByIdAndDelete(Long id){
        Dipendente found = this.findById(id);
        dipendeteRepository.delete(found);
    }

    public Dipendente findByIdAndUpdate(Long id, Dipendente body) {

        Dipendente found = this.findById(id);
        found.setUsername(body.getUsername());
        found.setNome(body.getNome());
        found.setCognome(body.getCognome());
        found.setEmail(body.getEmail());
        return dipendeteRepository.save(found);
}
}
