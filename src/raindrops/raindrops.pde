int y=100;
  int randomNumber = (int) random(width);
void setup(){
size(500,500);

}
void draw(){
background(150,150,0);
fill(0, 0, 255);
stroke(0, 1, 0);
ellipse(randomNumber, y,50,100);
y+=5;
if(y>500){
randomNumber = (int) random(width);
y=0;

}
rect(mouseX, 425, 100, 75);
}
