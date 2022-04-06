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

        getBackground(g);
        getCollectable(g);
        getObstacle(g);
        getSki(g);
    }

    private void getSki(Graphics g){
        //Staub
        g.drawImage(Var.i_ski_staub, Var.ski_x +25, Var.ski_y, 34, 19, null);

        //Ski
        g.drawImage(Var.i_ski,Var.ski_x, Var.ski_y, 80, 80, null);
        repaint();
    }
    private void getCollectable(Graphics g){
        //Collectable - Jaegermeister
        for(int i=0;i<=4;i++) {
            g.drawImage(Var.i_jaegermeister, Var.jaegermeister_x[i], Var.jaegermeister_y[i], 25, 40, null);
        }
    }
    private void getObstacle(Graphics g){
        //Obstacle - Schneeball
        for(int i=0;i<=4;i++) {
            g.drawImage(Var.i_schneeball, Var.schneeball_x[i], Var.schneeball_y[i], 70, 70, null);
        }
    }
    private void getBackground(Graphics g){
        //Background
        g.drawImage(Var.i_b1,0,Var.backgroundY1,800,600,null);
        g.drawImage(Var.i_b2,0,Var.backgroundY2,800,600,null);

    }




}

