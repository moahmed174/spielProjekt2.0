package pack1;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;


public class Var {

    //Window
    static JFrame window;
    static int win_screenwidth = 800, win_screenheight = 600;
    static int backgroundY1 = 0,backgroundY2 = 600,  backgroundspeed =9;

    //Game mechanics
    static boolean collision = false, lost = false;

    //Anzeige
    static int collectables=0, leben =2, maxleben=2;

    //Buttons - Control
    static JButton btn_resume, btn_shop, btn_option, btn_exit;
    static JButton btn_mute;

    //Movement
    static int ski_x = 400, ski_y = 300;
    static int speedup = 3, speeddown= 2, speedright = 2, speedleft =2;
    static boolean moveup = false, movedown = false, moveleft = false, moveright= false;


    //Drawing
    static Label lb_l1;
    static BufferedImage i_b1, i_b2;
    static BufferedImage i_ski, i_ski_straight, i_ski_left, i_ski_right;
    static BufferedImage i_ski_staub, i_ski_staub1, i_ski_staub2;
    static int i_ski_w, i_ski_h;

    //Obstacles-Schneeball
    static int schneeball_x[] = new int[5], schneeball_y[] = new int[5] ;
    static int schneeball_speed[]=new int [5];
    static BufferedImage i_schneeball[]=new BufferedImage[8];
    static int i_schneeball_w, i_schneeball_h;

    //Collectables
    static BufferedImage i_bier;
    static int i_bier_w, i_bier_h;
    static int col_x1[] = new int[5], col_y1[] = new int[5] ;
    static int col_speed1[]=new int [5];
    static BufferedImage i_redbull;
    static int i_redbull_w, i_redbull_h;
    static int col_x2[] = new int[2], col_y2[] = new int[2] ;
    static int col_speed2[]=new int [2];
    static BufferedImage i_jaegermeister;
    static int i_jaegermeister_w, i_jaegermeister_h;
    static int col_x3, col_y3;
    static int col_speed3;



    public Var(){
        loadImages();
        giveRndSpeed();
    }

    private void loadImages(){
        try { //Background

            i_b1 = ImageIO.read(new File("rsc/win_background.png"));
            i_b2 = ImageIO.read(new File("rsc/win_background.png"));
            //ski_direction
            i_ski_straight = ImageIO.read(new File("rsc/ski_straight.png"));
            i_ski_left = ImageIO.read(new File("rsc/ski_left.png"));
            i_ski_right = ImageIO.read(new File("rsc/ski_right.png"));
            i_ski=i_ski_straight;
            i_ski_w=i_ski_straight.getWidth();
            i_ski_h=i_ski_straight.getHeight();
            //Ski_staub
            i_ski_staub1=ImageIO.read(new File("rsc/ski_staub.png"));
            i_ski_staub2=ImageIO.read(new File("rsc/ski_staub2.png"));
            i_ski_staub=i_ski_staub1;
            //Schneeball
            for(int i=0;i<=7;i++) {
                i_schneeball[i] = ImageIO.read(new File("rsc/obstacle_schneekugel_"+Integer.toString(i)+".png"));
            }
            i_schneeball_w = i_schneeball[0].getWidth();
            i_schneeball_h = i_schneeball[0].getHeight();
            //Collectables
            i_bier = ImageIO.read(new File("rsc/collectable_wieselburger.png"));
            i_bier_w = i_bier.getWidth();
            i_bier_h = i_bier.getHeight();
            i_jaegermeister = ImageIO.read(new File("rsc/collectable_jaegermeister.png"));
            i_jaegermeister_w = i_jaegermeister.getWidth();
            i_jaegermeister_h = i_jaegermeister.getHeight();
            i_redbull = ImageIO.read(new File("rsc/collectable_redbull.png"));
            i_redbull_w = i_redbull.getWidth();
            i_redbull_h = i_redbull.getHeight();

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Bilder konnten nicht geladen werden. ");
        }
    }

    private void giveRndSpeed(){

        //Obstacle - Schneeballspeed
        for(int i=0;i<=4;i++){
            //rnd.nextInt((max - min) + 1) + min
            // --> random speed für die 5 Schneebälle zwischen min<=speed<=max
            schneeball_speed[i]=generateRandom(4,3);
        }

        //Collectable - Bier
        for(int i=0;i<=4;i++){
            col_speed1[i]=generateRandom(4,2);
        }
        //Collectable - Redbull
        for(int i=0;i<=1;i++){
            col_speed2[i]=generateRandom(5,4);
        }
        //Collectable - Jägermeister
        col_speed3 = 6;
    }

    private int generateRandom(int max, int min){
        Random rnd = new Random();
        return rnd.nextInt((max - min) + 1) + min;
    }
}
