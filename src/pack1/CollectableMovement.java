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
        //Position Bier
        for(int i=0;i<=4;i++){
            Var.col_x1[i]=20+temp;
            Var.col_y1[i]=Var.win_screenheight+200+temp;

            temp += 160;
        }
        //Position Redbull
        Var.col_x2[0]=Var.win_screenwidth/3;
        Var.col_x2[1]=Var.win_screenwidth*2/3;
        Var.col_y2[0]=Var.win_screenheight+1000;
        Var.col_y2[1]=Var.win_screenheight+1500;

        //Position Jägermeister
        Var.col_x3 = 375;
        Var.col_y3 = Var.win_screenheight+4000;

    }
    private void getMovement(){

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                //Bier
                for(int i=0;i<=4;i++){
                    Var.col_y1[i]-=Var.col_speed1[i];

                    //Rand
                    if(Var.col_y1[i]<=-100){
                        Var.col_y1[i]=Var.win_screenheight+350;
                    }
                }

                //Redbull
                for(int i=0;i<=1;i++){
                    Var.col_y2[i]-=Var.col_speed2[i];

                    if(Var.col_y2[i]<=-100){
                        Var.col_y1[i]=Var.win_screenheight+1500;
                    }
                }

                //Jägermeister
                Var.col_y3-=Var.col_speed3;

                if(Var.col_y3<=-100){
                    Var.col_y3=Var.win_screenheight+4000;
                }
            }
        },0,9);
    }

}
