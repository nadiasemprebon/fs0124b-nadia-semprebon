let salva = document.querySelector("#salvaBtn");

salva.addEventListener("click", function (e) {
  e.preventDefault();

  let name = document.querySelector("#nome").value;
  let brand = document.querySelector("#brand").value;
  let price = document.querySelector("#prezzo").value;
  let imageUrl = document.querySelector("#immagine").value;
  let description = document.querySelector("#descrizione_prodotto").value;

  let prodotto = {
    name,
    description,
    brand,
    imageUrl,
    price,
  };

  console.log(prodotto);

  /*fetch("https://striveschool-api.herokuapp.com/api/product/")
    .then((resp) => {
      if (!resp.ok) {
        throw { httpError: response.status };
      }
      return resp, json();
    })
    .then((data) => console.log(data))
    .catch((err) => console.log(err));*/
});

fetch("https://striveschool-api.herokuapp.com/api/product/", {
  method: "POST",
  body: JSON.stringify(prodotto),
  headers: {
    "Content-Type": "application/json",
    Authorization:
      "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVkZWE5MzdiMGFlMjAwMTljYTQ4YmQiLCJpYXQiOjE3MTAwOTA4OTksImV4cCI6MTcxMTMwMDQ5OX0.8FMufJ39GmhA3226S23A3N6S3kYgwUtE3_R7pnCYlh0",
  },
})
  .then((res) => res.json())
  .then((res) => console.log(res));
