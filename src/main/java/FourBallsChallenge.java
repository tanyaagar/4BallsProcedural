import processing.core.PApplet;

public class FourBallsChallenge extends PApplet{
    int x = 0;
    public static final int WIDTH = 640;
    public static final int HEIGHT = 400;

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
        //addBg();
        drawEllipse();
    }
    int x1 = 0;
    int x2 = 0;
    int x3 = 0;
    int x4 = 0;
    private void drawEllipse() {
        ellipse(x1, HEIGHT/5 , 10 , 10);
        x1++;
        ellipse(x2, 2*(HEIGHT/5) , 10 , 10);
        x2+=2;
        ellipse(x3 , 3*(HEIGHT/5) , 10 , 10);
        x3+=3;
        ellipse(x4 , 4*(HEIGHT/5) , 10 , 10);
        x4+=4;

    }

    private void addBg() {
        background(234);
    }
}
