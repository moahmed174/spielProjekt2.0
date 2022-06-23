package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Var.btn_resume) {
        } else if (e.getSource() == Var.btn_shop) {
        } else if (e.getSource() == Var.btn_option) {

        } else if (e.getSource() == Var.btn_exit) {
            System.out.println(0);
        }
    }
}