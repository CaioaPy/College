// 1
function bemvindo() {
    alert("Bem-vindo ao site!");
}
window.onload = bemvindo;

// 2
function ehPar(numero) {
    return numero % 2 === 0;
}
console.log(ehPar(4));
console.log(ehPar(5)); 

// 3
function calcularMedia() {
    let valores = prompt("Digite os números separados por virgula:");
    let numeros = valores.split(",").map(Number);
    let soma = numeros.reduce((acc, num) => acc + num, 0);
    let media = soma / numeros.length;
    return media;
}
console.log(calcularMedia());

// 4
function CaixaAlta(texto) {
    return texto.toUpperCase();
}
console.log(CaixaAlta("olá mundo"));

// 5
function inverterArray(array) {
    return array.reverse();
}
console.log(inverterArray([1, 2, 3, 4, 5]));

// 6
function calcularAcrescimo(valor, porcentagem) {
    return valor + (valor * (porcentagem / 100));
}
console.log(calcularAcrescimo(100, 20)); // 120

// 7
function Palindromo(palavra) {
    let palavraInvertida = palavra.split("").reverse().join("");
    return palavra === palavraInvertida;
}
console.log(Palindromo("arara"));
console.log(Palindromo("javascript"));

// 8
function Fatorial(numero) {
    if (numero === 0 || numero === 1) return 1;
    let fatorial = 1;
    for (let i = 2; i <= numero; i++) {
        fatorial *= i;
    }
    return fatorial;
}
console.log(Fatorial(5));
