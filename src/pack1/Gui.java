package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

        Var.btn_resume=new JButton();
        Var.btn_resume.setText("Resume");
        Var.btn_resume.setBounds(30,50,725,50 );
        Var.btn_resume.setVisible(false);
        Var.btn_resume.addActionListener(new ActionHandler() );
        Var.btn_resume.setBackground(Color.black);
        Var.btn_resume.setFont(new Font("Arial", Font.BOLD,40));
        Var.btn_resume.setForeground(Color.WHITE);
        Var.btn_resume.setBorder(null);
        Var.btn_resume.setFocusPainted(false);
        Var.btn_resume.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Var.btn_resume.setBackground(new Color(0,250,115));
                Var.btn_resume.setForeground(Color.black);
            } public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                Var.btn_resume.setBackground(new Color(0,250,115));
                Var.btn_resume.setForeground(Color.black);
            }
        });

        Var.btn_shop=new JButton();
        Var.btn_shop.setText("Upgrade");
        Var.btn_shop.setBounds(30,150,725,50 );
        Var.btn_shop.setVisible(false);
        Var.btn_shop.addActionListener(new ActionHandler() );
        Var.btn_shop.setBackground(Color.black);
        Var.btn_shop.setFont(new Font("Arial", Font.BOLD,40));
        Var.btn_shop.setForeground(Color.WHITE);
        Var.btn_shop.setBorder(null);
        Var.btn_shop.setFocusPainted(false);
        Var.btn_shop.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Var.btn_shop.setBackground(new Color(0,250,115));
                Var.btn_shop.setForeground(Color.black);
            } public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                Var.btn_shop.setBackground(new Color(0,250,115));
                Var.btn_shop.setForeground(Color.black);
            }
        });

        Var.btn_option=new JButton();
        Var.btn_option.setText("Upgrade");
        Var.btn_option.setBounds(30,250,725,50 );
        Var.btn_option.setVisible(false);
        Var.btn_option.addActionListener(new ActionHandler() );
        Var.btn_option.setBackground(Color.black);
        Var.btn_option.setFont(new Font("Arial", Font.BOLD,40));
        Var.btn_option.setForeground(Color.WHITE);
        Var.btn_option.setBorder(null);
        Var.btn_option.setFocusPainted(false);
        Var.btn_option.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Var.btn_option.setBackground(new Color(0,250,115));
                Var.btn_option.setForeground(Color.black);
            } public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                Var.btn_option.setBackground(new Color(0,250,115));
                Var.btn_option.setForeground(Color.black);
            }
        });

        Var.btn_exit=new JButton();
        Var.btn_exit.setText("Exit");
        Var.btn_exit.setBounds(30,350,725,50 );
        Var.btn_exit.setVisible(false);
        Var.btn_exit.addActionListener(new ActionHandler() );
        Var.btn_exit.setBackground(Color.black);
        Var.btn_exit.setFont(new Font("Arial", Font.BOLD,40));
        Var.btn_exit.setForeground(Color.WHITE);
        Var.btn_exit.setBorder(null);
        Var.btn_exit.setFocusPainted(false);
        Var.btn_exit.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Var.btn_exit.setBackground(new Color(0,250,115));
                Var.btn_exit.setForeground(Color.black);
            } public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                Var.btn_exit.setBackground(new Color(0,250,115));
                Var.btn_exit.setForeground(Color.black);
            }
        });






    }
}
