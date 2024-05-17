package it.epicode.postazioni.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
    //indica la classe primaria
    @Id
    //generazione di id univoci dal db
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
