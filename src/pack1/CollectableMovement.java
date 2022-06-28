package pack1;

import   java.util.Timer;
import java.util.TimerTask;

public class CollectableMovement {

    Timer timer;
    private int temp=0;

    public CollectableMovement(){

        getStartPos();
        getMovement();
    }

    private void getStartPos(){
        //Position Bier
        for(int i=0;i<=4;i++){
            Var.bier_x[i]=20+temp;
            Var.bier_y[i]=Var.win_screenheight+200+temp;

            temp += 160;
        }
        //Position Redbull
        Var.redbull_x[0]=Var.win_screenwidth/3;
        Var.redbull_x[1]=Var.win_screenwidth*2/3;
        Var.redbull_y[0]=Var.win_screenheight+1000;
        Var.redbull_y[1]=Var.win_screenheight+1500;

        //Position Jägermeister
        Var.jaeger_x = 375;
        Var.jaeger_y = Var.win_screenheight+4000;

    }
    private void getMovement() {

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {



                    //Bier
                    for (int i = 0; i <= 4; i++) {
                        Var.bier_y[i] -= Var.bier_speed[i];

                        //Rand
                        if (Var.bier_y[i] <= -100) {
                            Var.bier_y[i] = Var.win_screenheight + 350;
                        }
                    }

                    //Redbull
                    for (int i = 0; i <= 1; i++) {
                        Var.redbull_y[i] -= Var.redbull_speed[i];

                        if (Var.redbull_y[i] <= -100) {
                            Var.redbull_y[i] = Var.win_screenheight + 1500;
                        }
                    }

                    //Jägermeister
                    Var.jaeger_y -= Var.jaeger_speed;

                    if (Var.jaeger_y <= -100) {
                        Var.jaeger_y = Var.win_screenheight + 4000;
                    }


                }


        }, 0, 9);
    }


}
