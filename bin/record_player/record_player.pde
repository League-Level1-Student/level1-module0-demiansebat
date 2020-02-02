int angle=0;
PImage pictureOfRecord;     //as member variable
import ddf.minim.*; //at the very top of your sketch
Minim minim; //as a member variable
AudioPlayer song; //as a member variable
void setup(){
  size(600,600);     //in setup method
  pictureOfRecord= loadImage("vinyl.jpg");     //in setup method
  pictureOfRecord.resize(600,600);     //in setup method
  minim = new Minim(this); //in the setup method
  song = minim.loadFile("Unity.mp3", 512);//in the setup method
song.play();
  }
void draw(){
  angle+=10;
 background(255,255,255,255);
   if (mousePressed){
  rotateImage(pictureOfRecord, angle);
song.play();
}
song.pause();
image(pictureOfRecord,0,0);     //in draw method
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/20);
     translate(-image.width/2, -image.height/2);
}
