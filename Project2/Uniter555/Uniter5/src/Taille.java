
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CECCE
 */
class Taille {
 String tailleStr ;
    int tailleTableau;
     Taille (){
 } //fin constructeur
    
     int TailleTableau() {
        boolean nombreValide = true;
        do {
            try {
                tailleStr = JOptionPane.showInputDialog("nom constante y");
                tailleTableau = Integer.parseInt(tailleStr);
                if ((tailleTableau <= 1000000000 )&&(tailleTableau >= 2)){
                nombreValide = false;
                }
            } catch (NumberFormatException exx) {
                nombreValide = true;
            }
        } while (nombreValide == true);
        return tailleTableau;
    }
     }   
