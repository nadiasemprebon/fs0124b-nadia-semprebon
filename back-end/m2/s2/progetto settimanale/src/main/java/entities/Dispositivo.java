package entities;

import enums.StatoDispositivo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "dispositivi")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    @NotBlank
    private String tipologia;

    @Enumerated(EnumType.STRING)
    private StatoDispositivo status;

    @ManyToOne
    private Dipendente dipendente;



}
