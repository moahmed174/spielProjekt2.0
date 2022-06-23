package pack1;

import pack1.Var;

import java.util.Timer;
import java.util.TimerTask;

public class Explosion {


    Timer exp;
    private  int temp = 0;

    public Explosion() {
        exp = new Timer();
        exp.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (Var.collision) {
                    if (temp< 15) {
                       Var.expanimation = temp;
                        temp++;
                        System.out.println(Var.expanimation);
                    } else if (temp == 15) {
                        Var.expanimation=15;
                        temp = 0;
                        Var.collision = false;

                    }
                }
            }
        }, 0, 40);

    }
}