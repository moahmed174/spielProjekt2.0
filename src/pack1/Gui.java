package pack1;

import javax.swing.*;

public class Gui {
    public Gui() {


        Var.window = new JFrame();
        Var.window.setSize(Var.win_screenwidth, Var.win_screenheight);
        Var.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Var.window.setLocationRelativeTo(null);
        Var.window.setLayout(null);
        Var.window.setTitle("Spiel 1");
        Var.window.requestFocus();
        Var.window.addKeyListener(new KeyHandler());
        Var.window.setVisible(true);

        Var.lb_l1 = new Label();
        Var.lb_l1.setBounds(0,0,Var.win_screenwidth,Var.win_screenheight);
        Var.lb_l1.setVisible(true);
        Var.window.add(Var.lb_l1);






    }
}
