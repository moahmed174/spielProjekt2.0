package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    static int tempKeyhandler = 0;


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.moveup = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Var.movedown = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Var.moveright = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Var.moveleft = true;
        }


        if (tempKeyhandler == 0) {
            //Menü
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                Var.imSpiel = false;
                Var.imMenü = true;
                Var.imShop = false;
                Var.imOption = false;
                Var.btn_resume.setVisible(true);
                Var.btn_shop.setVisible(true);
                Var.btn_option.setVisible(true);
                Var.btn_exit.setVisible(true);
                tempKeyhandler--;
            } else if (tempKeyhandler == 1) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    Var.imSpiel = true;
                    Var.imMenü = false;
                    Var.imShop = false;
                    Var.imOption = false;
                    Var.btn_resume.setVisible(false);
                    Var.btn_shop.setVisible(false);
                    Var.btn_option.setVisible(false);
                    Var.btn_exit.setVisible(false);

                    Var.btnupgrade1.setVisible(false);
                    Var.btnleben.setVisible(false);

                    tempKeyhandler--;
                    Aktualisierung.tempAktualisierung = 0;

                }

            }

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.moveup = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Var.movedown = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Var.moveright = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Var.moveleft = false;
        }
    }
}
