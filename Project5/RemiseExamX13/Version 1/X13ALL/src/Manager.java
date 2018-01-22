
import java.util.Scanner;
import java.awt.event.*;

public class Manager{

    String nom, num,couleur = "bleu";
    boolean entrer = false,entrerNom = false,entrerNum = false;
    boolean permis = true;


    Manager() {

    }

    Stock Nouveau() {
        IUG2 a = new IUG2();
        while(entrer == false){
        if(a.Entrer("OK")){
        nom = a.LireNom();
        num = a.LireNum();
        entrer = true;
        }
        }
        Stock v1 = new Stock(nom, num, couleur, permis);
        return v1;
    }
  
}
