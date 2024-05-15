// API CEP
// Api Url
 
 const apiUrl = "https://viacep.com.br/ws/";

 function consultarCep(cep) { // function fetch().then().catch();
    fetch(`${apiUrl}${cep}/json/`)
    .then(response => {
        if (!response.ok) {
            throw new Error("Erro ao consultar cep");
        } 
        return response.json();

    })

    .then (data => {
        console.log("CEP: ", data.cep);
        console.log("Logradouro: ", data.logradouro);
        console.log("Complemento: ", data.complemento);
        console.log("Bairro: ", data.bairro);
        console.log("Cidade: ", data.localidade);
        console.log("Estado: ", data.uf); 
    })

    .catch (error => {
        console.error("Erro", error);
    })


 }

 consultarCep("69033142");