package it.epicode;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Date;

public class EventoDAO {

        private static final String PERSISTENCE_UNIT = "JPA_Sample";
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);

        EntityManager em = emf.createEntityManager();


    public void save (String[] args) {




        var e = new Evento(1L, "Suicidio di Massa", new Date(), "Accogliamo la pace eterna dopo una vita di stenti", TipoEvento.PRIVATO, 666);
        EntityTransaction trans = em.getTransaction();


        trans.begin();
        em.persist(e);
        trans.commit();
        em.close();
        emf.close();
    }

    public Evento getById (Long Id){
        return em.find(Evento.class,Id);
    }

    public void  delete(Long Id) {
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        em.remove(getById(Id));
        trans.commit();
        em.close();
        emf.close();
    }
}

