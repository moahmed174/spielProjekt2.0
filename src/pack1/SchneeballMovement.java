package pack1;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class SchneeballMovement {

    Timer timer;
    private int temp=0;
    private int temp2=0;

    public SchneeballMovement(){
        getStartPos();
        getMovement();
        getRotation();
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


    private void getRotation(){
        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for(int i=0; i<=7;i++){
                    if(i<=6){
                        Var.i_schneeball[i]=Var.i_schneeball[i+1];
                    } else{
                        try{
                            Var.i_schneeball[i]=ImageIO.read(new File("rsc/obstacle_schneekugel_"+Integer.toString(temp2)+".png"));
                        }catch (IOException e){
                         e.printStackTrace();
                         System.out.println("Bilder konnten nicht geladen werden. ");
                        }
                        temp2++;
                        if(temp2>=8){
                            temp2=0;
                        }
                    }

                }
            }
        }, 0,100);
    }
}
