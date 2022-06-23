package pack1;

import wiiremotej.BalanceBoard;
import wiiremotej.WiiRemoteJ;

public class Main {
    public static void main(String[] args) {
        new Gui();
        new Var();
        new KeyHandler();
        new Label();
        new Background();
        new PlayerMovement();
        new SchneeballMovement();
        new CollectableMovement();
        new StaubAnimation();
        new SchneeballCollision();
        new CollectableCollision();
        new Lost();
        new Explosion();
        //connectingBalanceBoard();

    }

    /*
    public static void connectingBalanceBoard(){
        //basic console logging options...
        WiiRemoteJ.setConsoleLoggingAll();
        //WiiRemoteJ.setConsoleLoggingOff();

        try
        {
            //Find and connect to a Balance Board
            BalanceBoard board = null;

            while (board == null) {
                try {
                    board = WiiRemoteJ.findBalanceBoard();
                }
                catch(Exception e) {
                    board = null;
                    e.printStackTrace();
                    System.out.println("Failed to connect board. Trying again.");
                }
            }

            board.addBalanceBoardListener(new BBImpl(board));
            board.setLEDIlluminated(true);

            final BalanceBoard boardF = board;
            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable(){public void run(){boardF.disconnect();}}));
        }
        catch(Exception e){e.printStackTrace();}
    }
    */
}
