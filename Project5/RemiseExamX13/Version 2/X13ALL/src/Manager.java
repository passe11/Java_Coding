
import java.util.Scanner;
import java.awt.event.*;

public class Manager {

    String nom, num, couleur = "bleu";
    boolean entrer = false, entrerNom = false, entrerNum = false;
    boolean permis = true;

    Manager() {

    }

    Stock Nouveau(IUG2 a) {       
                nom = a.LireNom();
                num = a.LireNum();
             
     
       
        Stock v1 = new Stock(nom, num, couleur, permis);
        return v1;
    }

    int Enleve() {
        return -1;
    }

}
