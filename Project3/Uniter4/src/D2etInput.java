/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pasca
 */
import javax.swing.JOptionPane;

public class D2etInput {

    static String uneStr = " ";
    static int num = 0;
    static int[][] tab2D = null;
    static String xStr = " ";
    static String yStr = " ";
    static int x, y;

    public static void EcrireTableau() {
    
            for (int i = 0; i < tab2D.length; i++) {
                for (int k = 0; k < tab2D[0].length; k++) {
                    boolean numero =true ;
                    do {
                        try {
                    uneStr = JOptionPane.showInputDialog("Un numéro, SVP");
                    num = (int)(Math.random()*10) ;
                    tab2D[i][k] = num;   
                    numero = false;
                        }catch(NumberFormatException ex){
                            numero = true;
                        }
                    }while(numero == true);
                    

                } // fin boulce
            }
        } //fin methode

    public static void LireTableau() {
        for (int rang = 0; rang < tab2D.length; rang++) {
            for (int col = 0; col < tab2D[0].length; col++) {
                System.out.print(tab2D[rang][col] + "  ");
            }
            System.out.println();
        }
    }

    public static void TailleTableau() {
        boolean valX = true;
        do {
            try {

                xStr = JOptionPane.showInputDialog("nom constante x");
                x = Integer.parseInt(xStr);
                valX = false;
            } catch (NumberFormatException ex) {
                 valX = true;
            } 
        } while (valX == true);

        boolean valY = true;
        do {
            try {
                yStr = JOptionPane.showInputDialog("nom constante y");
                y = Integer.parseInt(yStr);
                valY = false ;
            } catch (NumberFormatException exx) {
               valY = true; 
            } 
        } while (valY == true);
    }
    public static void CreerTableau (){
    tab2D = new int[x][y];
    
    }

    public static void main(String args[]) {
        TailleTableau();
        CreerTableau();
        EcrireTableau();
        LireTableau();

    }
}
