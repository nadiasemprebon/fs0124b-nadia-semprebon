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

  fetch("https://striveschool-api.herokuapp.com/api/product/", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
      Authorization:
        "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZDc0NzJkN2IxMTAwMTkwZTZkZDUiLCJpYXQiOjE3MDk4ODkzNTIsImV4cCI6MTcxMTA5ODk1Mn0.ucxjVMkecAJlqDTpKVEicRDoZL3gcFcikqwWrUkwfYQ",
    },
    body: JSON.stringify(prodotto),
  })
    .then((res) => {
      console.log(res);
      res.json();
    })
    .then((data) => {
      console.log(data);
    });
});
