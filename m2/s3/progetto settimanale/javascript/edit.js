//step 1: recupero l'id della pizza scelta
let url = new URLSearchParams(location.search);
let id = url.get("_id");

//step 2: recupero i dati di questa pizza e li uso per popolare il form
fetch(`http://localhost:3000/pizze/${"_id"}`)
  .then((res) => res.json())
  .then((prodotto) => {
    let gusto = document.querySelector("#gusto");
    let prezzo = document.querySelector("#prezzo");

    gusto.value = pizza.gusto;
    prezzo.value = pizza.prezzo;
  });

//step 3: faccio funzionare il form, in modo che sia in grado di fare una richiesta di aggiornamento dati

const salva = document.querySelector("#salva");

salva.addEventListener("click", function (e) {
  e.preventDefault();

  let gusto = document.querySelector("#gusto").value;
  let prezzo = document.querySelector("#prezzo").value;

  let pizza = {
    gusto,
    prezzo,
  };

  fetch(`http://localhost:3000/pizze/${id}`, {
    method: "PUT",
    headers: {
      "Content-type": "application/json",
    },
    body: JSON.stringify(pizza),
  })
    .then((res) => res.json())
    .then((res) => {
      //do conferma all'utente oppure lo mando via

      location.href = "read.html";
    });
});
