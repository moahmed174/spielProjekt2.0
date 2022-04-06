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
    static int win_screenwidth = 800, screenheight = 600;
    static int backgroundY1 = 0,backgroundY2 = 600,  backgroundspeed =9;

    //Movement
    static int ski_x = 400, ski_y = 300;
    static int speedup = 3, speeddown= 2, speedright = 2, speedleft =2;
    static boolean moveup = false, movedown = false, moveleft = false, moveright= false;

    //Obstacles-Schneeball
    static int schneeball_x[] = new int[5], schneeball_y[] = new int[5] ;
    static int schneeball_speed[]=new int [5];
    static BufferedImage i_schneeball;

    //Collectables-Jägermeister
    static int jaegermeister_x[] = new int[5], jaegermeister_y[] = new int[5] ;
    static int jaegermeister_speed []=new int [5];
    static BufferedImage i_jaegermeister;

    //Drawing
    static Label lb_l1;
    static BufferedImage i_b1, i_b2;
    static BufferedImage i_ski, i_ski_straight, i_ski_left, i_ski_right;
    static BufferedImage i_ski_staub, i_ski_staub1, i_ski_staub2;

    public Var(){
        loadImages();
        giveRndSpeed();
    }

    private void loadImages(){
        try { //Background

            i_b1 = ImageIO.read(new File("rsc/back1.png"));
            i_b2 = ImageIO.read(new File("rsc/back1.png"));
            //ski_direction
            i_ski_straight = ImageIO.read(new File("rsc/ski_straight.png"));
            i_ski_left = ImageIO.read(new File("rsc/ski_left.png"));
            i_ski_right = ImageIO.read(new File("rsc/ski_right.png"));
            i_ski=i_ski_straight;
            //Ski_staub
            i_ski_staub1=ImageIO.read(new File("rsc/ski_staub.png"));
            i_ski_staub2=ImageIO.read(new File("rsc/ski_staub2.png"));
            i_ski_staub=i_ski_staub1;
            //Schneeball
            i_schneeball = ImageIO.read(new File("rsc/obstacle_schneekugel.png"));
            //Jägermeister
            i_jaegermeister = ImageIO.read(new File("rsc/jaegermeister.jpg"));


        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Bilder konnten nicht geladen werden. ");
        }
    }
    private void giveRndSpeed(){
        Random rnd = new Random();

        //Obstacle - Schneeballspeed
        for(int i=0;i<=4;i++){
            //rnd.nextInt((max - min) + 1) + min
            // --> random speed für die 5 Schneebälle zwischen min<=speed<=max
            schneeball_speed[i]=rnd.nextInt((4 - 3) + 1) + 3;
        }

        //Schneeball - Jägermeisterspeed
        for(int i=0;i<=4;i++){
            //rnd.nextInt((max - min) + 1) + min
            // --> random speed für die 5 Jägermeister zwischen min<=speed<=max
            jaegermeister_speed[i]=rnd.nextInt((4 - 3) + 1) + 3;
        }
    }
}
