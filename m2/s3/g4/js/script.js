async function chiamata(query) {
  const apiKey = "0JzuekpBQjHs4kPw7moMmxQbFPCcJWNb0zSHVpfbPlElLGLUVFWU3guH";

  return await fetch(`https://api.pexels.com/v1/search?query=${query}`, {
    method: "GET",
    headers: {
      Authorization: apiKey,
    },
  }).then((dati) => dati.json());
}

chiamata("pizza").then((pizze) => {
  console.log(pizze);
});
