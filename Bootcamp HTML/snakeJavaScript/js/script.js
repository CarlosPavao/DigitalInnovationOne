let canvas = document.getElementById("snake"); //criar elemento que irá rodar o jogo
let context = canvas.getContext("2d"); //....
let box = 32;
let direction = "right";
let snake = []; //criar cobrinha como lista, já que ela vai ser uma série de coordenadas, que quando pintadas, criam os quadradinhos
snake[0] ={
    x: 8 * box,
    y: 8 * box
}
let comida = {
    //Math.floor - tira a parte decimal
    x: Math.floor(Math.random() * 15 + 1) * box,
    y: Math.floor(Math.random() * 15 + 1) * box
    //Math.random - número aleatorio
}

function criarBG(){
    context.fillStyle = "lightgreen";
    context.fillRect(0, 0, 16*box, 16*box); //desenha o retângulo usando x e y e a largura e altura setadas
}

function criarSnake (){
    for(i = 0; i < snake.length; i++){
        context.fillStyle = "green";
        context.fillRect(snake[i].x, snake[i].y, box, box);
    }
}

function comer(){
    context.fillStyle = "red";
    context.fillRect(comida.x, comida.y, box, box );
}
//quando um evento acontece, detecta e chama uma função
document.addEventListener('keydown',update);

//função para movimentar a snake
function update(event){
    if(event.keyCode == 65 || event.keyCode == 37 && direction != 'right') direction = 'left';
    if(event.keyCode == 87 || event.keyCode == 38  && direction != 'down') direction = 'up';
    if( event.keyCode == 68 || event.keyCode == 39  && direction != 'left') direction = 'right';
    if( event.keyCode == 83 || event.keyCode == 40 && direction != 'up') direction = 'down';

}




function iniciarJogo(){
    
    if(snake[0].x > 15*box && direction == "right") snake[0].x = 0;
    if(snake[0].x < 0 && direction == 'left') snake[0].x = 16 * box;
    if(snake[0].y > 15*box && direction == "down") snake[0].y = 0;
    if(snake[0].y < 0 && direction == 'up') snake[0].y = 16 * box;   
    
    for(i = 1; i < snake.length; i++){
        if(snake[0].x == snake[i].x && snake[0].y == snake[i].y){
            clearInterval(jogo);
            alert('Game Over :(');
        }
    }

    criarBG();
    criarSnake();
    comer();

    let snakeX = snake[0].x;
    let snakeY = snake[0].y;

    //Direções da snake
    if(direction == "right") snakeX += box;
    if(direction == "left") snakeX -= box;
    if (direction == "up") snakeY -= box;
    if(direction == "down") snakeY += box;
    

    //Ação quando snake comer a comida
    if(snakeX != comida.x || snakeY != comida.y){
        //pop tira o último elemento da lista
        snake.pop();
    }else{
        comida.x = Math.floor(Math.random() * 15 + 1) * box;
        comida.y = Math.floor(Math.random() * 15 + 1) * box;
    }

    
    
    //Movimento Snake
    let newHead = {
        x:snakeX,
        y:snakeY
    }

    // //método unshift adiciona como primeiro quadradinho da cobrinha
    snake.unshift(newHead);

}

let jogo = setInterval(iniciarJogo,100);
