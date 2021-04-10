function clicou(){
   document.getElementById("agradecimento").innerHTML = "<b>Obrigado Por Clicar</b>"
    
}

function redirecionar(){
    //Abir em uma nova pagina
    window.open("https://digitalinnovation.one");
    //Abir na mesma pagina que você está
    window.location.href= "https://digitalinnovation.one";
}

function trocar(elemento){
    //document.getElementById("mousemove").innerHTML = "Novo Texto"
    elemento.innerHTML  = "Obrigado por Passar o mouse aqui";
    //alert("Trocar Texto")

}

function voltar(elemento){
    //document.getElementById("mousemove").innerHTML = "Passe o mouse aqui"
    elemento.innerHTML =  "Passe o mouse aqui";
    
}

function load(){
    alert("Pagina Carregaga");
}

function funcaoChange(elemento){
    console.log(elemento.value);
}