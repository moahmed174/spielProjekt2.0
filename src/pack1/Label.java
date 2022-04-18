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
        repaint();
    }

    private void getSki(Graphics g){
        //Staub
        g.drawImage(Var.i_ski_staub, Var.ski_x+7, Var.ski_y-5, 34, 19, null);

        //Ski
        g.drawImage(Var.i_ski,Var.ski_x, Var.ski_y, 48, 74, null);
    }
    private void getCollectable(Graphics g){
        //Collectable - Bier
        for(int i=0;i<=4;i++) {
            g.drawImage(Var.i_bier, Var.col_x1[i], Var.col_y1[i], 25, 70, null);
        }
        //RedBull
        g.drawImage(Var.i_redbull, Var.col_x2[0], Var.col_y2[0], 25, 70, null);
        g.drawImage(Var.i_redbull, Var.col_x2[1], Var.col_y2[1], 25, 70, null);
        //Jägermeister
        g.drawImage(Var.i_jaegermeister, Var.col_x3, Var.col_y3, 30, 70, null);

    }
    private void getObstacle(Graphics g){
        //Obstacle - Schneeball
        for(int i=0;i<=4;i++) {
            g.drawImage(Var.i_schneeball[i], Var.schneeball_x[i], Var.schneeball_y[i], 70, 70, null);
        }
    }
    private void getBackground(Graphics g){
        //Background
        g.drawImage(Var.i_b1,0,Var.backgroundY1,800,600,null);
        g.drawImage(Var.i_b2,0,Var.backgroundY2,800,600,null);

    }




}

