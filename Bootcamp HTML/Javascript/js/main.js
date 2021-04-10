var nome = "Carlos Pavão";
var idade = 27;
document.write(nome+ " tem " + idade + " anos");
document.write("<hr />");



var nome1 = "Carlos Pavão";
var idade1 = 27;
var idade2 = 10;

document.write(idade1+idade2);
document.write("<hr />");
var frase = "Japão é o melhor time do mundo";

document.write(frase.replace("Japão", "Brasil"));
document.write("<hr />");
document.write(frase.toLowerCase());
document.write("<hr />");
document.write(frase.toUpperCase());
document.write("<hr />");


var lista = ["maça","pêra","Laranja"];
console.log(lista[1]);/*Acessar um item especifico*/
lista.push("uva");/*Adicionar item na lista*/
console.log(lista);/*Mostrar todos os elementos da lista*/
lista.pop();/*remover item na lista*/
console.log(lista.reverse())/*Trazer lista de tras para frente*/
console.log(lista.toString())/*tras como um texto*/
console.log(lista.join(" - ")) /*substitui o que separa o texto*/

/*Dicionario*/
var fruta = {nome:"Maça", cor:"Vermelha"}
console.log(fruta)
console.log(fruta.nome);
console.log(fruta.cor);


var frutas = [{nome:"Maça", cor:"Vermelha"}, {nome:"Uva", cor:"Roxa"}]

console.log(frutas)
console.log(frutas[1].nome);
console.log(frutas[1].cor);

var idade = 18;

if(idade >=18){
    document.write("Maior de idade")
    document.write("<hr />");
}

var count;
for(count=0; count<= 10;count++){
    document.write(count);
}
document.write("<hr />");

var d = new Date();
    document.write(d.getDay());
    document.write("<hr />");
    document.write(d.getMonth()+1);
    document.write("<hr />");
    document.write(d.getFullYear());
    document.write("<hr />");
    document.write(d.getHours());
    document.write("<hr />");
    document.write(soma(10,5));
    document.write("<hr />");
    document.write(setReplace("Vai Japão","Japão", "Brasil"));
    document.write("<hr />");

    var idade = prompt("Qual sua idade?");

    document.write(validaIdade(idade));



function soma(n1,n2){
    return n1+n2;
}

function setReplace(frase,nome, nomeNome){
    return frase.replace(nome,nomeNome)
}
function validaIdade(idade){
    var validar;
    if(idade >= 18){
        validar = true;
    }else{
        validar = false;
    }
    return validar
}