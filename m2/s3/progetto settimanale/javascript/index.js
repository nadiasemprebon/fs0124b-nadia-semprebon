fetch("https://striveschool-api.herokuapp.com/api/product/", {
  headers: {
    "Content-Type": "application/json",
    Authorization:
      "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZDc0NzJkN2IxMTAwMTkwZTZkZDUiLCJpYXQiOjE3MDk4ODkzNTIsImV4cCI6MTcxMTA5ODk1Mn0.ucxjVMkecAJlqDTpKVEicRDoZL3gcFcikqwWrUkwfYQ",
  },
})
  .then((res) => res.json())
  .then((prodotti) => {
    console.log(prodotti);

    for (let prodotto of prodotti) {
      let riga = generaClone();

      let imgUrl = riga.querySelector(".imgUrl");
      let name = riga.querySelector(".name");
      let brand = riga.querySelector(".prezzo");
      let description = riga.querySelector(".description");
      let price = riga.querySelector(".price");
      let editBtn = riga.querySelector(".edit");
      let infoBtn = riga.querySelector(".info");

      imgUrl.innerText = prodotto.imgUrl;
      name.innerText = prodotto.name;
      brand.innerText = prodotto.brand;
      description.innerText = prodotto.description;
      price.innerText = prodotto.price;
      editBtn.href = `edit.html?id=${prodotto.id}`; //.ID è GIUSTO? NON NE SONO SICURA
      infoBtn.href = `edit.html?id=${prodotto.id}`; // .ID è GIUSTO?? NON NE SONO
    }
  });

function generaClone() {
  //crea un clone del template e inseriscilo nella row
  let template = document.querySelector("#card");
  let clone = template.content.cloneNode(true);

  return clone;
}

function redirectToPage(event) {
  // Impedisce il comportamento predefinito del link (aprire una nuova pagina)
  event.preventDefault();

  // Specifica il percorso della pagina di destinazione
  var destinationPage = "http://127.0.0.1:5500/addProduct.html";

  // Reindirizza l'utente alla pagina di destinazione
  window.location.href = destinationPage;
}

// Aggiungi un gestore di eventi al click del link
document
  .getElementById("linkToRedirect")
  .addEventListener("click", redirectToPage);
