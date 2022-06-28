package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
    Timer movement;

    public PlayerMovement() {

        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(Var.imSpiel) {


                    if (Var.moveup == true) {
                        if (Var.ski_y > 0) {
                            Var.ski_y -= Var.speedup;
                            Var.i_ski = Var.i_ski_straight;
                        }

                    } else if (Var.movedown == true) {
                        if (Var.ski_y <= 490) {
                            Var.ski_y += Var.speeddown;
                            Var.i_ski = Var.i_ski_straight;
                        }
                    }

                    if (Var.moveleft == true) {
                        if (Var.ski_x > 0) {
                            Var.ski_x -= Var.speedleft;
                            Var.i_ski = Var.i_ski_left;
                        }

                    } else if (Var.moveright == true) {
                        if (Var.ski_x <= 730) {
                            Var.ski_x += Var.speedright;
                            Var.i_ski = Var.i_ski_right;
                        }
                    }
                }
            }
        }, 0, 9);
    }
}
