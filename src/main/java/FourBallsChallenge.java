import processing.core.PApplet;

public class FourBallsChallenge extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 400;
    public static final int RADIUS = 10;

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge" , args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup(){

    }
    @Override
    public void draw(){
        drawEllipse();
    }

    private void drawEllipse() {

        int x = 0;
        for(int i = 1 ; i<=4 ; i++){
            ellipse(x+=i, i*(HEIGHT/5) , RADIUS, RADIUS);
        }
    }

}
