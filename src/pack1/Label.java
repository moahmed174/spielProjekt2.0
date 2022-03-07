package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class Label extends JLabel {

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(Var.ib1,0,Var.backgroundY1,800,600,null);
        g.drawImage(Var.ib2,0,Var.backgroundY2,800,600,null);

        g.drawImage(Var.ski,Var.x, Var.y, 50, 90, null);


        repaint();
    }




}

