const btnCad = document.getElementById("btn-cadastrar");
const submitCad = document.getElementById("btn-submit-cadastro");
const livros = [["Titulo", "Autor"]];
const titulo = document.getElementById("titulo").value;
const autor = document.getElementById("autor").value;


btnCad.onclick = () => {
    const form = document.getElementById("form-cadastrar");
    form.style.display = "block";
}

submitCad.onclick = () => {
    for (let i = 0; i < livros[0].length; i++) {
        
    }
}
