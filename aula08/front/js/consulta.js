/* function hello() {
    let numero
    numero = document.getElementById("chave").value
    let saida = document.getElementById("saida")
    saida.innerHTML = "Você digitou:" + numero
    console.log('Você digitou: ' + numero)
} */

function validaLogin() {
    let usuario = localStorage.getItem("userLogged")

    if(!usuario) {
        window.location = "login.html"
    }

    let objUser = JSON.parse(usuario)

    document.getElementById("dadosUser").innerHTML = 'Usuário: <b>' + objUser.nome + '</b> - ' + objUser.email + '<br>'

}

function logout() {
    localStorage.removeItem("userLogged");
    window.location = "login.html"
}

function consultaUsuario() {
    let numero
    numero = document.getElementById("chave").value

    const url = "http://localhost:8080/user/compras/" + numero

    fetch(url)
        .then(res => validaResposta(res))

}

function validaResposta(resultado) {
    if (resultado.status == 200) {
        resultado.json().then(res => exibirDados(res))
    } else {
        document.getElementById("saida").innerHTML = "Não encontrado"
    }
}

function exibirDados(compras) {
    console.log(compras)
    let tabela = 'Descrição - valor - data <br>'

    for (let index = 0; index < compras.length; index++) {
        tabela += compras[index].descricao + '-' + compras[index].valor + '-' + compras[index].data + '<br>' 
    }
    document.getElementById("saida").innerHTML = tabela 
}