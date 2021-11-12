/*  Scripts: DOM - HTML e JavaScript
    Autor: prof. Marnei Cardoso
    Data: 09/11/2021
    Versão: 1.1
*/

// 1. Mudar valores com o .value
function mudarTexto() {
    document.getElementById('texto').value = "Novo texto";
}

// 2. Mudar valores com .innerHTML (e innertext)
function mudarTexto2() {
    // document.getElementById('texto2').innerHTML = "<h3>Texto com innerHTML</h3>";

    document.getElementById('texto2').innerText = "<h3>Texto com innerText</h3>";
}

// 3. Mudar imagem
function mudarImagem() {
    document.querySelector('#img01').src = "img/catioro.jpg";

    // document.getElementById('img01').src = "https://cdn.pixabay.com/photo/2021/09/15/12/52/animal-6626792_1280.jpg";
}

// 4. Mudar o CSS (estilo)
function mudarCSS() {
    /*document.getElementById('texto3').style.color = "red";
    document.getElementById('texto3').style.backgroundColor = "yellow";
    document.getElementById('texto3').style.fontSize = "2rem";*/

    // Encapsulamento
    //var texto = document.getElementById('texto3');
    var texto = document.querySelector('#texto3');
    texto.style.color = "purple";
    texto.style.fontSize = "1.5rem";
    texto.style.fontWeight = "bold";
    texto.innerHTML = "Buenas!";
}

// 5. Mudar texto (com uso de parâmetro)
function mudarTexto3(id) {
    //console.log(id.innerHTML);

    // id.innerHTML = "Texto alterado por JavaScript";
    let num = Math.floor(Math.random() * 1000);

    id.innerHTML = num;
}

// 6. Data e hora
function mostrarDataHora() {
    document.getElementById('hora').innerHTML = Date();
}

// 7. Alterar texto ao tirar o foco
function alterarTexto() {
    const textoInformado = document.getElementById('nome');
    textoInformado.value = textoInformado.value.toUpperCase();
    textoInformado.style.border = "solid 2px red";
    // textoInformado.value = textoInformado.value.toLowerCase();

    // document.getElementById('nome').value = document.getElementById('nome').value.toUpperCase();
}

// 8. Passar o mouse sobre
function passarMouse(objeto) {
    objeto.innerHTML = "Obrigado!";
    objeto.style.backgroundColor = "#59a6d3";
    objeto.style.transition = "0.5s";
}

function tirarMouse(objeto) {
    objeto.innerHTML = "Passe o mouse";
    objeto.style.backgroundColor = "#f9f9f9";
    objeto.style.transition = "1.5s";
}

// 9. Clicar, segurar e soltar
function clicar(elemento) {
    elemento.innerHTML = "Solte!";
    elemento.style.backgroundColor = "#1ec5e5";
    elemento.style.transition = "0.3s";
}

function soltar(elemento) {
    elemento.innerHTML = "Clicar!";
    elemento.style.backgroundColor = "#d94a38";
    elemento.style.transition = "0.3s";
}

// Atributo (variável) Global
let contador = 0;

// 10. Contador de cliques
function contadorClique() {
    contador++; // Incrementa de 1 em 1
    // contador = contador + 5;
    // contador += 5;
    // contador *= 5;

    // Atualiza o display
    document.querySelector('.display').value = contador;

    /*var valor = parseInt(document.querySelector('.display').value);
    // valor = valor + 1;
    valor++; // o mesmo que o comando acima
    document.querySelector('.display').value = valor;*/
}

function zerarContador() {
    contador = 0;
    document.querySelector('.display').value = contador;
}