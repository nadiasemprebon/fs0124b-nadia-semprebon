package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Table(name = "dipendenti")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dipendente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    @NotBlank
    @NotNull

    private String username;


    @NotBlank
    @NotNull

    private String nome;

    @NotBlank
    @NotNull

    private String cognome;

    @NotBlank
    @NotNull
    @Email

    private String email;


    @OneToMany(mappedBy = "dipendente")
    private List<Dispositivo>dispositivi;





}