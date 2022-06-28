package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class CollectableCollision {
    Timer timer;
    private int temp=0;

    public CollectableCollision() {
        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                //Bier - col_x1[5]
                for (int i=0; i<=4; i++){
                    if(Var.ski_x+Var.i_bier_w>=Var.bier_x[i] && Var.ski_x-Var.i_bier_w<=Var.bier_x[i]&&
                            Var.ski_y+Var.i_ski_h>=Var.bier_y[i]&& Var.ski_y-Var.i_bier_h<=Var.bier_y[i]){

                        Var.collectables++;
                        Var.bier_y[i]=Var.win_screenheight+200;
                    }
                }
                //Redbull - col_x2[2]
                for (int i=0; i<=1; i++){
                    if(Var.ski_x+Var.i_redbull_w>=Var.redbull_x[i] && Var.ski_x-Var.i_redbull_w<=Var.redbull_x[i]&&
                            Var.ski_y+Var.i_ski_h>=Var.redbull_y[i]&& Var.ski_y-Var.i_redbull_h<=Var.redbull_y[i]){

                        Var.collectables+=5;
                        Var.redbull_y[i]=Var.win_screenheight+1500;
                    }
                }

                //Jägermeister - col_x3
                if(Var.ski_x+Var.i_jaeger_w>=Var.jaeger_x && Var.ski_x-Var.i_jaeger_w<=Var.jaeger_x&&
                        Var.ski_y+Var.i_ski_h>=Var.jaeger_y&& Var.ski_y-Var.i_jaeger_h<=Var.jaeger_y){

                    Var.collectables+=10;
                    Var.jaeger_y =Var.win_screenheight+4000;
                }
            }
        },0, 15);
    }
}
