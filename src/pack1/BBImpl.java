package pack1;
import java.awt.*;
import javax.swing.*;
import wiiremotej.*;
import wiiremotej.event.*;

public class BBImpl extends BalanceBoardAdapter{
    /*
    private BalanceBoard board;
    private static double massX;
    private static double massY;

    public BBImpl(BalanceBoard board) {
        this.board = board;
    }

    public void disconnected()
    {
        System.out.println("Board disconnected... Please Wii again.");
        System.exit(0);
    }

    public void massInputReceived(BBMassEvent evt) {
        double massTL = evt.getMass(MassConstants.TOP, MassConstants.LEFT);
        double massTR = evt.getMass(MassConstants.TOP, MassConstants.RIGHT);
        double massBL = evt.getMass(MassConstants.BOTTOM, MassConstants.LEFT);
        double massBR = evt.getMass(MassConstants.BOTTOM, MassConstants.RIGHT);

        if (evt.getTotalMass() > 3) { // if mass is too small, don't bother
            double topMass = massTL + massTR;
            double bottomMass = massBL + massBR;
            double leftMass = massTL + massBL;
            double rightMass = massTR + massBR;

            double vertRange = topMass + bottomMass;
            double horizRange = rightMass + leftMass;

            massX = (rightMass - leftMass) / horizRange;
            if (massX < 0) {
                Var.moveleft = true;
                Var.moveright = false;
            } else if (massY > 0) {
                Var.moveright = true;

                massY = -(topMass - bottomMass) / vertRange;
            } else if (massY < 0) {
                Var.movedown = true;
            } else if (massY > 0) {
                Var.moveup = true;
            } else {
                massX = 0;
                massY = 0;

                Var.moveup = false;
                Var.movedown = false;
                Var.moveright = false;
                Var.moveleft = false;
            }
        }
    }

    public void buttonInputReceived(BBButtonEvent evt)
    {
        if (evt.wasPressed()) {
            System.out.println("Disconnecting! Please Wii again.");
            System.exit(0);
        }
    }
    */
}
