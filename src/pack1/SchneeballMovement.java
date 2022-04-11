package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class SchneeballMovement {

    Timer timer;
    private int temp=0;

    public SchneeballMovement(){
        getStartPos();
        getMovement();
        //getRotation();
    }

    private void getStartPos(){
        //Position
        for(int i=0;i<=4;i++){
            Var.schneeball_x[i]=20+temp;
            Var.schneeball_y[i]=Var.win_screenheight+100+temp;

            temp += 160;
        }
    }
    private void getMovement(){

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                for(int i=0;i<=4;i++){
                    //Bewegung von Schneeball
                    Var.schneeball_y[i]-=Var.schneeball_speed[i];

                    //Rand
                    if(Var.schneeball_y[i]<=-100){
                        Var.schneeball_y[i]=Var.win_screenheight+100;
                    }
                }

            }
        },0,9);
    }


    /**private void getRotation(){
        //Drehung
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Var.i_schneeball=rotate(Var.i_schneeball, 10);
            }
        }, 0,100);
    }*/

    /**public static BufferedImage rotate(BufferedImage bimg, double angle) {

        int w = bimg.getWidth();
        int h = bimg.getHeight();

        BufferedImage rotated = new BufferedImage(w, h, bimg.getType());
        Graphics2D graphic = rotated.createGraphics();
        graphic.rotate(Math.toRadians(angle), w/2, h/2);
        graphic.drawImage(bimg, null, 0, 0);
        graphic.dispose();
        return rotated;
    }*/

}
