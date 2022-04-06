package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class StaubAnimation {
    Timer timer;
    private boolean counter;

    public StaubAnimation() {
        timer = new Timer();
        counter = true;
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(counter){
                    Var.i_ski_staub=Var.i_ski_staub1;
                    counter=false;
                }else{
                    Var.i_ski_staub=Var.i_ski_staub2;
                    counter=true;
                }

            }
        }, 0, 100);

    }
}
