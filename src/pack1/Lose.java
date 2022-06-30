package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Lose {
    Timer timer;
    private int temp=0, temp1=0, temp2=0;

    public Lose() {
        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(Var.lost){
                    if(temp>=0 && temp<=150){
                        temp++;
                    }else //if(temp==56){
                        {
                        //Menü
                        Var.imSpiel=false;
                        Var.imOption=false;
                        Var.imShop=false;
                        Var.imMenü=true;
                        Var.btn_resume.setVisible(true);
                        Var.btn_option.setVisible(false);
                        Var.btn_shop.setVisible(false);
                        Var.btn_exit.setVisible(false);
                        Var.btnupgrade1.setVisible(false);
                        Var.btnleben.setVisible(false);
                        KeyHandler.tempKeyhandler++;
                        Var.btn_resume.requestFocus();
                        Var.window.requestFocus();
                        Var.maxleben=3;
                        Var.up1preis =15;
                        Var.uplebenpreis =5 ;

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
            Var.bier_x[i]=20+temp1;
            Var.bier_y[i]=Var.win_screenheight+200+temp1;

            temp1 += 160;
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
            Var.schneeball_y[i]=Var.win_screenheight+100+temp2;

            temp2+=160;

        }
    }
    private void resetStats(){
        temp=0;
        temp1=0;
        temp2=0;

        Var.collectables=0;
        if(Var.score>=Var.highscore) {
            Var.highscore = Var.score;
        }
        Var.score=0;

        Var.leben=Var.maxleben;
        Var.lost=false;
    }
}

