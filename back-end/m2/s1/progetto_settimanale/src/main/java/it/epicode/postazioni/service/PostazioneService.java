package it.epicode.postazioni.service;

import it.epicode.postazioni.entity.Postazione;
import it.epicode.postazioni.repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class PostazioneService {

    @Autowired
    PostazioneRepository postazioneRepository;
    public List<Postazione> getAll(){ return postazioneRepository.findAll(); }

    public Postazione findById(long id){ return postazioneRepository.findById(id).orElseThrow(() ->NotFoundException(id));}

    public void save(Postazione postazione) { postazioneRepository.save(postazione); }

    public void findByIdAndDelete(long id) {
        Postazione postazione = this.findById(id);
        postazioneRepository.delete(postazione);
    }

}

