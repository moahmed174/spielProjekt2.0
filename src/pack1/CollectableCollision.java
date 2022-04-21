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
                    if (Var.ski_x >= Var.col_x1[i] - Var.i_ski_w && Var.ski_x <= Var.col_x1[i] + Var.i_bier_w &&
                            Var.ski_y >= Var.col_x1[i] - Var.i_ski_h && Var.ski_x <= Var.col_x1[i] + Var.i_bier_h){

                        Var.collectables++;
                        Var.col_y1[i]=Var.win_screenheight+200;
                    }
                }
                //Redbull - col_x2[2]
                for (int i=0; i<=1; i++){
                    if (Var.ski_x >= Var.col_x2[i] - Var.i_ski_w && Var.ski_x <= Var.col_x2[i] + Var.i_redbull_w &&
                            Var.ski_y >= Var.col_x2[i] - Var.i_ski_h && Var.ski_x <= Var.col_x2[i] + Var.i_redbull_h){

                        Var.collectables+=5;
                        Var.col_y1[i]=Var.win_screenheight+1500;
                    }
                }

                //Jägermeister - col_x3
                if (Var.ski_x >= Var.col_x3 - Var.i_ski_w && Var.ski_x <= Var.col_x3 + Var.i_jaegermeister_w &&
                        Var.ski_y >= Var.col_x3 - Var.i_ski_h && Var.ski_x <= Var.col_x3 + Var.i_jaegermeister_h){

                    Var.collectables+=10;
                    Var.col_y3=Var.win_screenheight+4000;
                }
            }
        },0, 15);
    }
}
