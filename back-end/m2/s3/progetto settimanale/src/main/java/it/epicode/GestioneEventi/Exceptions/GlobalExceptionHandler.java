package it.epicode.GestioneEventi.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EventoNonTrovatoException.class)
    public ResponseEntity<String> handleEventoNonTrovatoException(EventoNonTrovatoException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(PrenotazioneNonTrovataException.class)
    public ResponseEntity<String> handlePrenotazioneNonTrovataException(PrenotazioneNonTrovataException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UtenteNonTrovatoException.class)
    public ResponseEntity<String> handleUtenteNonTrovatoException(UtenteNonTrovatoException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UtenteGiaEsistenteException.class)
    public ResponseEntity<String> handleUtenteGiaEsistenteException(UtenteGiaEsistenteException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
