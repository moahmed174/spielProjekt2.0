package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Aktualisierung {

    Timer aktual;
    static int tempAktualisierung = 0;
    public Aktualisierung() {
        aktual = new Timer();
        aktual.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if(Var.imMenü) {
                    if(tempAktualisierung ==0) {
                        Var.btn_resume.requestFocus();
                        Var.btn_option.requestFocus();
                        Var.btn_shop.requestFocus();
                        Var.btn_exit.requestFocus();
                        tempAktualisierung++;
                    }else if(tempAktualisierung==1) {
                        Var.window.requestFocus();
                    }


                }
            }
        }, 0, 50);
    }

}
