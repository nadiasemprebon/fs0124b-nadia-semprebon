const eliminaBtn = document.querySelector("#deleteBtn");

eliminaBtn.addEventListener("click", function (e) {
  e.preventDefault();

  localStorage.removeItem("valoreSalvato");
  mostraValore();
});
