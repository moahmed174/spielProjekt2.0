package pack1;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Var {



    static JFrame jfi;
    static int screenwidth = 800, screenheight = 600;
    static int backgroundY1 = 0,backgroundY2 = 600,  backgroundspeed =9;
    static int x = 400, y = 300;
    static  boolean moveup = false, movedown = false, moveleft = false, moveright= false;
    public static Label lbl1;

    static BufferedImage ib1,ib2;
    static BufferedImage ski;


    public Var(){
        try { //Background

            ib1 = ImageIO.read(new File("rsc/Background.png"));
            ib2 = ImageIO.read(new File("rsc/Background.png"));
            //Ski
            ski =ImageIO.read(new File("rsc/skiGerade.png"));


        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Bilder konnten nicht geladen werden. ");
        }


    }
}
