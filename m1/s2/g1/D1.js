/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/*
--> LA STRINGA e si scrive come 
    let stringa="Parola";
    consol.log(stringa);
    Importante è ricordare che si usa per una sequenza di caratteri e può contnere anche dei numeri.
    La dicitura vuole "".
    
    
--> I NUMERI e si scrive come
    let numero=5;
    consol.log(numero)
    

--> BOOLEAN e si scriVe come
let booleano= true;= false;
Deriva sempre da una comparazione


--> ARRAY e si scrive
let array=[0,1,2,3];



--> OBJECT e si scrive
let oggetti={nome:'Mario'}
*/

/* ESERCIZIO 2
 Crea una variable chiamata "myName" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

let myName = "Nadia";
console.log(myName);

/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

{
  let x = 12;
  let y = 20;
  let z = x + y;
  console.log(z);
}
/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

let x = 12;
console.log(x);

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "myName" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

myName = "Semprebon";
console.log(myName);

// non potrei farlo con cons perchè non è riassegnabile e quindi ha un andamento costante ed eita le sovrascritture

/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

console.log(4 - "12");

/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

const name1 = "john";
const name2 = "John";
const c = name1 !== name2;
console.log(true);

{
  let name1 = "john";
  let name2 = "John";
  let c = name1 == name2;
  console.log(true);
} /*mi dava errore quindi le ho inserite nelle graffe ma non saprei dire il perchè ora sia corretto. */
