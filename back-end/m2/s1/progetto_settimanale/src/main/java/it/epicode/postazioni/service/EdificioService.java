package it.epicode.postazioni.service;

import it.epicode.postazioni.entity.Edificio;
import it.epicode.postazioni.exceptions.NotFoundException;
import it.epicode.postazioni.repository.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EdificioService {
    @Autowired
    EdificioRepository edificioRepository;



    public List<Edificio> getAll(){ return edificioRepository.findAll(); }

    public Edificio findById(long id){ return edificioRepository.findById(id).orElseThrow(() ->new NotFoundException(id));}

    public void save(Edificio edificio) { edificioRepository.save(edificio); }

    public void findByIdAndDelete(long id) {
        Edificio edificio = this.findById(id);
        edificioRepository.delete(edificio);
    }
}
