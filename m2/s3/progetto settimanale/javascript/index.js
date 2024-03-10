fetch("https://striveschool-api.herokuapp.com/api/product/", {
  method: "GET",
  headers: {
    "Content-Type": "application/json",
    Authorization:
      "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVkZWE5MzdiMGFlMjAwMTljYTQ4YmQiLCJpYXQiOjE3MTAwOTA4OTksImV4cCI6MTcxMTMwMDQ5OX0.8FMufJ39GmhA3226S23A3N6S3kYgwUtE3_R7pnCYlh0",
  },
})
  .then((res) => res.json())
  .then((prodotti) => {
    console.log(prodotti);

    for (let prodotto of prodotti) {
      let riga = generaClone();

      let imgUrl = riga.querySelector(".imgUrl");
      let name = riga.querySelector(".name");
      let brand = riga.querySelector(".brand");
      let description = riga.querySelector(".description");
      let price = riga.querySelector(".price");
      let editBtn = riga.querySelector(".edit");
      let infoBtn = riga.querySelector(".info");

      imgUrl.src = prodotto.imgUrl; /// serve qualcosa d'altro
      name.innerText = prodotto.name;
      brand.innerText = prodotto.brand;
      description.innerText = prodotto.description;
      price.innerText = prodotto.price;
      editBtn.href = `edit.html?id=${prodotto._id}`; //.ID è GIUSTO? NON NE SONO SICURA
      infoBtn.href = `info.html?id=${prodotto._id}`; // .ID è GIUSTO?? NON NE SONO
    }
  });

function generaClone() {
  //crea un clone del template e inseriscilo nella row
  let template = document.querySelector("#card");
  let clone = template.content.cloneNode(true);

  return clone;
}
