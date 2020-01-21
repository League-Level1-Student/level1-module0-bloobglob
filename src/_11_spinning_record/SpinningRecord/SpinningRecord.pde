import ddf.minim.*;
Minim minim;
AudioPlayer song;
PImage pictureOfRecord;
int imageAngle;
void setup(){
  size(600,600);
  pictureOfRecord= loadImage("record.png");
  pictureOfRecord.resize(height,width);
  minim = new Minim(this);
  song = minim.loadFile("awesomeTrack.mp3", 512);
}
void draw(){
  if(mousePressed){
    imageAngle+=5;
    song.play();
  }else{
    song.pause();
  }
  rotateImage(pictureOfRecord, imageAngle);
  image(pictureOfRecord, 0, 0);
}
void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}
