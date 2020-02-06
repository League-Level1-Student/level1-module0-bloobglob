boolean raindropScored = false;
int score = 0;
int y = 0;
int x = round(random(500));
void setup(){
  size(500, 500);
}
void draw(){
  background(#000000);
  y+=5;
  fill(#0000ee);
  noStroke();
  ellipse(x, y, 10, 10);
  if(y>499){
    raindropScored = false;
    y = 0;
    x = round(random(500));
  }
  fill(#FF0000);
  rect(mouseX, 400, 50, 100);
  if(!raindropScored){
    checkCatch(x);
  }
  fill(#ffffff);
  textSize(16);
  text("Score: " + score, 20, 20);
}
void checkCatch(int x){
  if (x > mouseX && x < mouseX+100 && y>450){
    score++;
    println("Your score is now: " + score);
    raindropScored = true;
  }
  else if (score > 0 && y>450) {
    score--;
    println("Your score is now: " + score);
    raindropScored = true;
  }
    }
