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
    document.getElementById('texto2').innerHTML = "<h3>Texto com innerHTML</h3>";

    // document.getElementById('texto2').innerText = "<h3>Texto com innerText</h3>";
}

// 3. Mudar imagem
function mudarImagem() {
    document.querySelector('#img01').src = "img/catioro.jpg";
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