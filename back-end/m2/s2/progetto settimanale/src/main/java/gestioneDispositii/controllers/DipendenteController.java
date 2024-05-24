package gestioneDispositii.controllers;


import gestioneDispositii.entities.Dipendente;
import gestioneDispositii.services.DipendenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/dipendenti")
@RequiredArgsConstructor
public class DipendenteController {

    private final DipendenteService dipendenteService;

    @PostMapping
    public ResponseEntity<Dipendente> createDipendente(@RequestBody Dipendente dipendente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(dipendenteService.save(dipendente));
    }

    @GetMapping
    public ResponseEntity<Page<Dipendente>> getAllDipendenti(@RequestParam(defaultValue = "0") int page,
                                                             @RequestParam(defaultValue = "10") int size,
                                                             @RequestParam(defaultValue = "id") String sort) {
        return ResponseEntity.ok(dipendenteService.getDispositivi(page, size, sort));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dipendente> getDipendenteById(@PathVariable Long id) {
        return ResponseEntity.ok(dipendenteService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dipendente> updateDipendente(@PathVariable Long id, @RequestBody Dipendente dipendente) {
        return ResponseEntity.ok(dipendenteService.findByIdAndUpdate(id, dipendente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDipendente(@PathVariable Long id) {
        dipendenteService.findByIdAndDelete(id);
        return ResponseEntity.noContent().build();
    }
}
