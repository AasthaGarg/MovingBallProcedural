import processing.core.PApplet;

public class MovingBalls extends PApplet{
    int WIDTH = 800;
    int HEIGHT = 600;
    int DIAMETER = 50;
    int[] heightPosition = {1,2,3,4};
    int[] speed = {1,2,3,4};
    int[] stateX ={0,0,0,0};

    public static void main(String[] args) {
        PApplet.main("MovingBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup(){

    }

    @Override
    public void draw() {
        moveTheBallForward();
    }

    private void moveTheBallForward() {
        for(int i=0;i<4;i++){
            ellipse(stateX[i],((heightPosition[i] *HEIGHT)/5),DIAMETER,DIAMETER);
            stateX[i] += speed[i];
        }
    }

}
