package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Lost {
    Timer timer;
    private int temp=0, temp1=0, temp2=0;

    public Lost() {
        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(Var.lost){
                    if(temp>=0 && temp<=55){
                        temp++;
                    }else if(temp==56){
                        System.out.println("Verloren");

                        collectablePlatzierung();
                        schneeballPlatzierung();
                        resetStats();

                    }
                }

            }
        }, 0, 15);
    }

    private void collectablePlatzierung(){
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
    private void schneeballPlatzierung(){

        for(int i=0; i<=4;i++){
            Var.schneeball_y[i]=0;
        } //Unnötig??

        for(int i=0; i<=4;i++){
            Var.schneeball_y[i]=Var.win_screenheight+100+temp2;

            temp2+=160;
        }
    }
    private void resetStats(){
        if(Var.collectables>=50){
            Var.collectables-=50;
        } else {
            Var.collectables=0;
        }

        Var.leben=Var.maxleben;
        Var.lost=false;
    }
}

