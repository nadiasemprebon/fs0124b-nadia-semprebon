const insert = document.getElementsByClassName("insert");
insert.addEventListener(
  "click",
  function (e) {
    e.preventDefault();
  },
  function () {}
);

const toDo = document.createElement("div");
toDo.innerText = "This is a paragraph";
document.body.appendChild(toDo);
