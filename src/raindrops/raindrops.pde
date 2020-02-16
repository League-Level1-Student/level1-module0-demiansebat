int y=100;
int randomNumber = (int) random(width);
int score=0;

void setup() {
  fullScreen();
}
void draw() {
  background(150, 150, 0);
  fill(0, 0, 255);
  stroke(0, 1, 0);
  ellipse(randomNumber, y, 50, 100);
  y+=15
;
  if (y>500) {
     checkCatch(randomNumber);
    randomNumber = (int) random(width);
    y=0;
  }
  rect(mouseX, 425, 100, 75);
 text("Score: " + score, 20, 20);
  println("Your score is now: " + score);
}




void checkCatch(int x) {
  if (x > mouseX && x < mouseX+100)
    score++;
  else if (score >0)
    score--;
  fill(0, 0, 0);
  textSize(16);
}
