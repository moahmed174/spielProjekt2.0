package pack1;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;

public class Gui {
    public Gui() {


        Var.jfi= new JFrame();
        Var.jfi.setSize(Var.screenwidth, Var.screenheight);
        Var.jfi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Var.jfi.setLocationRelativeTo(null);
        Var.jfi.setLayout(null);
        Var.jfi.setTitle("Spiel 1");
        Var.jfi.requestFocus();
        Var.jfi.addKeyListener(new KeyHandler());
        Var.jfi.setVisible(true);

        Var.lbl1= new Label();
        Var.lbl1.setBounds(0,0,Var.screenwidth,Var.screenheight);
        Var.lbl1.setVisible(true);
        Var.jfi.add(Var.lbl1);






    }
}
