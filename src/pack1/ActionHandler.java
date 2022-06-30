package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        //Resume --> Spiel
        if (e.getSource() == Var.btn_resume) {

            Var.imSpiel=true;
            Var.imShop=false;
            Var.imOption=false;
            Var.imMenü=false;
            Var.btn_resume.setVisible(false);
            Var.btn_option.setVisible(false);
            Var.btn_shop.setVisible(false);
            Var.btn_exit.setVisible(false);

            Var.btnupgrade1.setVisible(false);
            Var.btnleben.setVisible(false);

            KeyHandler.tempKeyhandler = 0;
            Aktualisierung.tempAktualisierung = 0;

            Var.window.requestFocus();


        //Shop-->shop
        } else if (e.getSource() == Var.btn_shop) {

            Var.imSpiel=false;
            Var.imShop=true;
            Var.imOption=false;
            Var.imMenü=false;
            Var.btn_resume.setVisible(true);
            Var.btn_option.setVisible(false);
            Var.btn_shop.setVisible(false);
            Var.btn_exit.setVisible(false);

            Var.btnupgrade1.setVisible(true);
            Var.btnleben.setVisible(true);

            KeyHandler.tempKeyhandler = 1;
            Var.window.requestFocus();


        //Option--> option
        } else if (e.getSource() == Var.btn_option) {

            Var.imSpiel=false;
            Var.imShop=false;
            Var.imOption=true;
            Var.imMenü=false;
            Var.btn_resume.setVisible(true);
            Var.btn_option.setVisible(false);
            Var.btn_shop.setVisible(false);
            Var.btn_exit.setVisible(false);

            KeyHandler.tempKeyhandler = 1;
            Var.window.requestFocus();


        //Exit-->close
        }  else if (e.getSource() == Var.btn_exit) {
            System.exit(0);


    //SHOPBUTTONS
        //Maxleben--> maxleben+1, leben +1
        }else if (e.getSource() == Var.btnupgrade1) {
            if(Var.collectables >= Var.up1preis) {

                Var.maxleben += 1;
                Var.leben += 1;
                Var.collectables -= Var.up1preis;
                Var.up1preis = (Var.up1preis + Var.up1preis / 2);
                Var.up1anzahl += 1;
                Var.window.requestFocus();
            }

        //Leben+1 --> leben+1
        }else if (e.getSource() == Var.btnleben) {
            if(Var.collectables >= Var.uplebenpreis&&Var.leben<Var.maxleben) {
                Var.collectables-=Var.uplebenpreis;
                Var.uplebenpreis = (Var.uplebenpreis + Var.uplebenpreis / 2);
                Var.leben+=1;
            }
            Var.window.requestFocus();
        }

    }
}