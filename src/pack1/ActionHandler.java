package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Var.btn_resume) {

            Var.imSpiel=true;
            Var.imShop=false;
            Var.imOption=false;
            Var.imMenü=false;
            Var.btn_resume.setVisible(false);
            Var.btn_option.setVisible(false);
            Var.btn_shop.setVisible(false);
            Var.btn_exit.setVisible(false);

            KeyHandler.tempKeyhandler = 0;
            Aktualisierung.tempAktualisierung = 0;

            Var.window.requestFocus();


        } else if (e.getSource() == Var.btn_shop) {

            Var.imSpiel=false;
            Var.imShop=true;
            Var.imOption=false;
            Var.imMenü=false;
            Var.btn_resume.setVisible(true);
            Var.btn_option.setVisible(false);
            Var.btn_shop.setVisible(false);
            Var.btn_exit.setVisible(false);

            KeyHandler.tempKeyhandler = 1;
            Var.window.requestFocus();

        } else if (e.getSource() == Var.btn_option) {

            Var.imSpiel=false;
            Var.imShop=false;
            Var.imOption=true;
            Var.imMenü=false;
            Var.btn_resume.setVisible(true);
            Var.btn_option.setVisible(false);
            Var.btn_shop.setVisible(false);
            Var.btn_exit.setVisible(false);

            KeyHandler.tempKeyhandler = 1;

        } else if (e.getSource() == Var.btn_exit) {
            System.exit(0);
        }
    }
}