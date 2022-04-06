package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class CollectableMovement {

    Timer timer;
    private int temp=0;

    public CollectableMovement(){
        getStartPos();
        getMovement();
    }

    private void getStartPos(){
        //Position Jägermeister
        for(int i=0;i<=4;i++){
            Var.jaegermeister_x[i]=20+temp;
            Var.jaegermeister_y[i]=-200-temp;

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
                    Var.jaegermeister_y[i]+=Var.jaegermeister_speed[i];

                    //Rand
                    if(Var.jaegermeister_y[i]>=Var.screenheight){
                        Var.jaegermeister_y[i]=-350;
                    }
                }

            }
        },0,9);
    }

}
