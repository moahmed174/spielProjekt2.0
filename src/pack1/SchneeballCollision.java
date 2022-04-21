package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class SchneeballCollision {
    Timer timer;
    private int temp=0;

    public SchneeballCollision() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                for (int i=0; i<=4; i++){
                    if(temp==0){

                        if(Var.ski_x>=Var.schneeball_x[i]-Var.i_ski_w &&  Var.ski_x<=Var.schneeball_x[i]+Var.i_schneeball_w&&
                                Var.ski_y>=Var.schneeball_x[i]-Var.i_ski_h&& Var.ski_x<=Var.schneeball_x[i]+Var.i_schneeball_h){

                            Var.collision=true;
                            Var.schneeball_y[i]=Var.win_screenheight+100;

                            if(Var.leben == 1){
                                Var.leben--;
                                Var.lost=true;
                            }
                            else{
                                Var.leben--;
                                //Var.lost=false;
                            }
                            temp++;
                        }
                    }
                }
                if(temp>=66){
                    temp=0;
                }
                else{
                    temp++;
                }
            }
        },0, 15);
    }
}
