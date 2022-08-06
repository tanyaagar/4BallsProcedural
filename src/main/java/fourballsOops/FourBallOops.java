package fourballsOops;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBallOops extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 400;
    public static final int RADIUS = 10;
    public static final int NUMBER_OF_BALLS = 4;
    List<Ball> balls = new ArrayList<Ball>();

    public static void main(String[] args) {
        PApplet.main("fourballsOops.FourBallOops", args);
    }

    @Override
    public void setup() {

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        for (int i = 1; i <= NUMBER_OF_BALLS; i++) {
            Ball b = new Ball(0, i * (HEIGHT / 5), RADIUS, i);
            balls.add(b);
        }
    }


    @Override
    public void draw() {
        makeEclipse();
    }

    private void makeEclipse() {
        for (Ball b : balls) {
            ellipse(b.xCoord += b.ballSpeed, b.yCoord, b.radius, b.radius);
        }
    }
}


