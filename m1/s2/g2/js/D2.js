/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/

  let array = [1, 2, 3, 4];
  let m = Math.max(...array);
  console.log(m);


  let x= 5;
  let y=37;
  if (x < y) || (y > x)
    console.log(piu grande);
  else if{
    cosole.log(più piccolo)
  }
  
/* ESERCIZIO 2

  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/
{
  let numero = 7;
  if (numero !== 5) {
    console.log("not equal");
  } 
}

/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: usa l'operatore modulo)
*/
{
  let numero = 20;
  let risultato = (numero %5);
  if (risultato==0) {
    console.log("divisibile per 5");
  }
}
{
  let numero = 20;
  if (numero / 5) {
    console.log("divisibile per 5");
  }
}

/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/

{
  let a = 21;
  let b = 8;
  console.log(b);
  console.log(a);
}
/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/

{
  let carrello = 100;
  let totalShoppingCart = "spedizione gratuita";

  if(carrello >= 50) 
  {
    console.log(totalShoppingCart)
  }if else {
    console.log(carrello <=50)
  } else{
    console.log(carrello + 10)
  }
}

/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/

{
  let prima = 3;
let seconda = 5;
let terza = 7;
 } /* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/

{
  let a = 15;
  console.log(typeof a);
}

/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

{
  function isEvenOrOdd(number) {
  if (number % 2 === 0) {
    return "Il numero è pari";
  } else {
    return "Il numero è dispari";
  }
}
}

/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  let val = 7
  if (val < 10) {
      console.log("Meno di 10");
    } else if (val < 5) {
      console.log("Meno di 5");
    } else {
      console.log("Uguale a 10 o maggiore");
    }
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".
*/

{
  const me = {
    name: "John",
    lastName: "Doe",
    skills: ["javascript", "html", "css"],
  };
  city.push("toronto");
  console.log(city);

  //manca qualcosa
}

/* ESERCIZIO 12
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".
*/

{
  const me = {
    name: "John",
    lastName: "Doe",
    skills: ["javascript", "html", "css"],
  };
  console.log(lastName.batch);
}

/* ESERCIZIO 13
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/

{
  {
  const me = {
    name: "John",
    lastName: "Doe",
    skills: ["javascript", "html", "css"],
  };
  console.log(skills[2].batch);
}
}

/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 15
  Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
