package fourballsOops;

import processing.core.PApplet;

public class Ball extends PApplet {
    int xCoord;
    int yCoord;
    int radius;
    int ballSpeed;
    Ball(int xCoord , int yCoord , int radius , int ballSpeed){
        this.xCoord = xCoord;
        this.yCoord  = yCoord;
        this.radius = radius;
        this.ballSpeed = ballSpeed;
    }




}
