// Aguarda o carregamento completo do DOM antes de executar o script
document.addEventListener('DOMContentLoaded', () => {
    // Recupera a lista de livros do localStorage, ou inicializa uma lista vazia se não houver dados
    let livros = JSON.parse(localStorage.getItem('livros')) || [];

    // Função para salvar a lista de livros no localStorage
    function salvarLivros() {
        localStorage.setItem('livros', JSON.stringify(livros));
    }

    // Função para exibir um formulário específico baseado no ID fornecido
    function showForm(formId) {
        // Seleciona todos os formulários
        const forms = document.querySelectorAll('.form-container');
        // Esconde todos os formulários
        forms.forEach(form => form.style.display = 'none');
        // Mostra o formulário específico baseado no ID
        const formToShow = document.getElementById(`form-${formId}`);
        if (formToShow) {
            formToShow.style.display = 'block';
        }
        // Esconde o container da lista de livros
        document.getElementById('list-container').style.display = 'none';

        // Se o formulário for o de apagar, exibe os livros para apagar
        if (formId === 'apagar') {
            exibirLivrosParaApagar();
        }
    }

    // Função para cadastrar um livro
    function cadastrarLivro() {
        // Obtém os valores dos campos de entrada do formulário
        const title = document.getElementById('titulo').value;
        const author = document.getElementById('autor').value;
        const capa = document.getElementById('capa').files[0];

        // Verifica se o campo título está preenchido
        if (title) {
            // Se houver uma capa, lê a imagem
            if (capa) {
                const reader = new FileReader();
                reader.onload = function (e) {
                    // Adiciona o livro com a imagem da capa à lista de livros
                    livros.push({ title, author, capa: e.target.result });
                    salvarLivros();
                    alert('Livro cadastrado com sucesso!');
                    // Limpa os campos do formulário
                    document.getElementById('titulo').value = '';
                    document.getElementById('autor').value = '';
                    document.getElementById('capa').value = '';
                };
                reader.readAsDataURL(capa);
            } else {
                // Adiciona o livro sem capa à lista de livros
                livros.push({ title, author, capa: null });
                salvarLivros();
                alert('Livro cadastrado com sucesso!');
                // Limpa os campos do formulário
                document.getElementById('titulo').value = '';
                document.getElementById('autor').value = '';
            }
        } else {
            alert('Por favor, preencha o título do livro.');
        }
    }

    // Função para consultar um livro pelo título ou autor
    function consultarLivro() {
        // Obtém os valores dos campos de entrada para consulta
        const title = document.getElementById('consulta-titulo').value;
        const author = document.getElementById('consulta-autor').value;
        const resultContainer = document.getElementById('consulta-result');
        resultContainer.innerHTML = '';

        // Filtra a lista de livros pelo título ou autor
        const livrosEncontrados = livros.filter(livro => {
            return (title && livro.title.toLowerCase().includes(title.toLowerCase())) ||
                   (author && livro.author.toLowerCase().includes(author.toLowerCase()));
        });

        // Exibe os detalhes dos livros encontrados ou uma mensagem de não encontrado
        if (livrosEncontrados.length > 0) {
            livrosEncontrados.forEach(livro => {
                resultContainer.innerHTML += `
                    <div>
                        ${livro.capa ? `<img src="${livro.capa}" alt="Capa do Livro">` : ''}
                        <div>
                            <p>Título: ${livro.title}</p>
                            <p>Autor: ${livro.author}</p>
                        </div>
                    </div>
                `;
            });
        } else {
            resultContainer.innerHTML = 'Livro não encontrado.';
        }
    }

    // Função para exibir a lista de livros cadastrados
    function showBooks() {
        const listContainer = document.getElementById('list-container');
        const bookList = document.getElementById('book-list');
        bookList.innerHTML = '';

        // Adiciona cada livro da lista de livros ao elemento de lista na página
        livros.forEach(livro => {
            const listItem = document.createElement('li');
            listItem.innerHTML = `
                ${livro.capa ? `<img src="${livro.capa}" alt="Capa do Livro" class="book-cover">` : ''}
                <div>
                    <p>Título: ${livro.title}</p>
                    <p>Autor: ${livro.author}</p>
                </div>
            `;
            bookList.appendChild(listItem);
        });

        // Exibe o container da lista de livros
        listContainer.style.display = 'block';
    }

    // Função para exibir os livros a serem apagados com checkboxes
    function exibirLivrosParaApagar() {
        const apagarList = document.getElementById('apagar-list');
        apagarList.innerHTML = '';

        // Adiciona cada livro da lista de livros ao elemento de lista para apagar na página
        livros.forEach((livro, index) => {
            const listItem = document.createElement('li');
            listItem.innerHTML = `
                <input type="checkbox" id="apagar-${index}" data-index="${index}">
                ${livro.capa ? `<img src="${livro.capa}" alt="Capa do Livro" class="book-cover">` : ''}
                <label for="apagar-${index}">${livro.title} - ${livro.author}</label>
            `;
            apagarList.appendChild(listItem);
        });

        const selectAllCheckbox = document.getElementById('select-all');
        selectAllCheckbox.checked = false;
        // Adiciona um evento para selecionar ou desmarcar todos os checkboxes
        selectAllCheckbox.addEventListener('change', () => {
            const checkboxes = document.querySelectorAll('#apagar-list input[type="checkbox"]');
            checkboxes.forEach(checkbox => checkbox.checked = selectAllCheckbox.checked);
        });
    }

    // Função para apagar os livros selecionados
    function apagarLivros() {
        // Seleciona todos os checkboxes que estão marcados
        const checkboxes = document.querySelectorAll('#apagar-list input[type="checkbox"]:checked');
        if (checkboxes.length > 0) {
            // Obtém os índices dos livros a serem apagados
            const indicesParaApagar = Array.from(checkboxes).map(checkbox => parseInt(checkbox.dataset.index));
            // Filtra a lista de livros, removendo os livros que estão marcados para apagar
            livros = livros.filter((_, index) => !indicesParaApagar.includes(index));
            salvarLivros();
            alert('Livro(s) apagado(s) com sucesso!');
            // Atualiza a lista de livros a serem apagados
            exibirLivrosParaApagar();
        } else {
            alert('Por favor, selecione pelo menos um livro para apagar.');
        }
    }

    // Adiciona eventos aos botões do menu
    document.getElementById('btn-cadastrar').addEventListener('click', () => showForm('cadastrar'));
    document.getElementById('btn-consultar').addEventListener('click', () => showForm('consultar'));

    // Recarrega a página ao clicar em "Listar Livros" para exibir a lista de livros
    document.getElementById('btn-listar').addEventListener('click', () => {
        localStorage.setItem('listBooks', 'true');
        location.reload();
    });

    document.getElementById('btn-apagar').addEventListener('click', () => showForm('apagar'));

    // Adiciona eventos aos botões de submissão dos formulários
    document.getElementById('btn-submit-cadastrar').addEventListener('click', cadastrarLivro);
    document.getElementById('btn-submit-consultar').addEventListener('click', consultarLivro);
    document.getElementById('btn-submit-apagar').addEventListener('click', apagarLivros);

    // Verifica se a página foi recarregada para listar os livros
    if (localStorage.getItem('listBooks') === 'true') {
        showBooks();
        localStorage.removeItem('listBooks');
    }
});
