package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class Label extends JLabel {
    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (Var.imSpiel) {

            //Background
            g.drawImage(Var.i_b1, 0, Var.backgroundY1, 800, 600, null);
            g.drawImage(Var.i_b2, 0, Var.backgroundY2, 800, 600, null);

            //Collectable - Bier
            for (int i = 0; i <= 4; i++) {
                g.drawImage(Var.i_bier, Var.bier_x[i], Var.bier_y[i], 25, 70, null);
            }
            //RedBull
            for (int i = 0; i <= 1; i++) {
                g.drawImage(Var.i_redbull, Var.redbull_x[0], Var.redbull_y[0], 25, 70, null);
                g.drawImage(Var.i_redbull, Var.redbull_x[1], Var.redbull_y[1], 25, 70, null);
            }
            //Jägermeister
            for (int i = 0; i <= 4; i++) {
                g.drawImage(Var.i_jaegermeister, Var.jaeger_x, Var.jaeger_y, 30, 70, null);
            }

            //Obstacle - Schneeball
            for (int i = 0; i <= 4; i++) {
                g.drawImage(Var.i_schneeball[i], Var.schneeball_x[i], Var.schneeball_y[i], 70, 70, null);
            }
            //Staub
            g.drawImage(Var.i_ski_staub, Var.ski_x + 7, Var.ski_y - 5, 34, 19, null);

            //Ski
            g.drawImage(Var.i_ski, Var.ski_x, Var.ski_y, 48, 74, null);


            if (Var.lost) {
                g.setColor(new Color(230, 0, 0));
                g.setFont(new Font("Arial", Font.BOLD, 35));
                g.drawString("Collectables: " + Var.collectables, 310, 200);
                g.setColor(new Color(100,100,100,128));
                g.fillRect(0,0,Var.win_screenwidth,Var.win_screenheight);
                repaint();

            } else {
                g.setColor(new Color(6, 96, 2));
                g.setFont(new Font("Arial", Font.BOLD, 35));
                g.drawString("Collectables: " + Var.collectables, 20, 50);
                g.drawImage(Var.ileben, 600, 500, 50, 50, null);
                g.setFont(new Font("Arial", Font.BOLD, 55));
                g.drawString("" + Var.leben, 670, 545);
                g.setFont(new Font("Arial", Font.BOLD, 25));
                g.drawString("/ " + Var.maxleben, 730, 545);

                repaint();
            }

            if (Var.collision) {
                if (Var.expanimation > 1 && Var.expanimation <= 4) {
                    g.setColor(new Color(230, 0, 0, 45));
                    g.fillRect(0, 0, Var.win_screenwidth, Var.win_screenheight);
                } else if (Var.expanimation >= 6 && Var.expanimation <= 9) {
                    g.setColor(new Color(230, 0, 0, 45));
                    g.fillRect(0, 0, Var.win_screenwidth, Var.win_screenheight);
                }
            }
            repaint();

        } else if (Var.imMenü || Var.imOption || Var.imShop) {

            g.drawImage(Var.i_b1, 0, Var.backgroundY1, 800, 600, null);
            g.drawImage(Var.i_b2, 0, Var.backgroundY2, 800, 600, null);

            g.drawImage(Var.i_ski_staub, Var.ski_x + 7, Var.ski_y - 5, 34, 19, null);

            g.drawImage(Var.i_ski, Var.ski_x, Var.ski_y, 48, 74, null);

            for (int i = 0; i <= 4; i++) {
                g.drawImage(Var.i_schneeball[i], Var.schneeball_x[i], Var.schneeball_y[i], 70, 70, null);
            }

            g.setColor(new Color(100, 100, 100, 128));
            g.fillRect(0, 0, Var.win_screenwidth, Var.win_screenheight);

            if (Var.lost) {
                g.setColor(new Color(230, 0, 0));
                g.setFont(new Font("Arial", Font.BOLD, 35));
                g.drawString("Collectable:" + Var.collectables, 310, 200);
                repaint();

        } if (Var.imShop)

            g.setColor(new Color(197, 58, 58));
            g.setFont(new Font("Arial", Font.BOLD, 35));
            g.drawString("Collectable:" + Var.collectables, 310, 180);

            g.drawString("max. Leben",75,390);

            g.drawString("St." + Var.up1anzahl, 550, 390);

            g.drawString(Var.up1preis + "C", 310, 390);
            g.drawString(Var.uplebenpreis+"C", 700, 185);
            g.drawString("Leben +1", 525, 235);


            repaint();


            }


        }



    }



