package gestioneDispositii.controllers;

import gestioneDispositii.entities.Dispositivo;
import gestioneDispositii.services.DispositivoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/dispositivi")
@RequiredArgsConstructor
public class DispositiviController {

    private final DispositivoService dispositivoService;

    @PostMapping
    public ResponseEntity<Dispositivo> createDispositivo(@RequestBody Dispositivo dispositivo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(dispositivoService.save(dispositivo));
    }

    @GetMapping
    public ResponseEntity<Page<Dispositivo>> getAllDispositivi(@RequestParam(defaultValue = "0") int page,
                                                               @RequestParam(defaultValue = "10") int size,
                                                               @RequestParam(defaultValue = "id") String sort) {
        return ResponseEntity.ok(dispositivoService.getDispositivi(page, size, sort));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dispositivo> getDispositivoById(@PathVariable Long id) {
        return ResponseEntity.ok(dispositivoService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dispositivo> updateDispositivo(@PathVariable Long id, @RequestBody Dispositivo dispositivo) {
        return ResponseEntity.ok(dispositivoService.findByIdAndUpdate(id, dispositivo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDispositivo(@PathVariable Long id) {
        dispositivoService.findByIdAndDelete(id);
        return ResponseEntity.noContent().build();
    }
}
