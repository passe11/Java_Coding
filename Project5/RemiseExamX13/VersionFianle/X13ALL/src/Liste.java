/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pasca
 */
//import exAvecEnumEtList.*;

import java.util.Collections;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Collections;
import java.util.Scanner;

public class Liste {

    public static int compteur = 0;
    private static List<Stock> personne;
      public static Scanner scan;
    //pour stocker toute les entres String
 
    //pour enregistrer chaque String individuellement 
    public static String str2 = " ";

    //static Manager x = new Manager();
    public Liste(){
        personne = new ArrayList();
        StockMaker();
        
    }

    int Add(Stock a) {

        String nomNouveau = a.GetNom();

        int compteFinale = 0;
        for (int compte = 0; (compte < personne.size()); compte++) {
            
            if (nomNouveau.compareTo(personne.get(compte).GetNom()) < 0) {
                compteFinale = compte;
                JOptionPane.showMessageDialog(null, compte);
                compte = personne.size();
            }else{
                if (compte == (personne.size()-1)){
                compteFinale = (compte + 1);
                compte = personne.size();
                }
            }
        }

        personne.add(compteFinale, a);

        return compteFinale;
    }
    
    void LireFichier()throws IOException{
    
    
    }

    int GetSize() {

        return ((personne.size()) - 1);
    }

    String Compile() {
        String str = " ";
        for (int i = 0; i < personne.size(); i++) {

            str = (str + "\n" + personne.get(i).GetNom());
        }
        return str;
    }

    int Index(Stock b) {
        int index = personne.indexOf(b);
        return index;
    }

    Stock Get(int x) {
        return personne.get(x);
    }

    void Del(int a) {
        personne.remove(a);
    }
    
    int Recherche(String motCle){
        int index = 0;
    for (int i = 0; i < personne.size();i ++){
        String nomTemp = personne.get(i).GetNom();
        JOptionPane.showMessageDialog(null, nomTemp);
        if (  nomTemp.matches(motCle) ){
             index = i ;
             JOptionPane.showMessageDialog(null, i);
             i = personne.size();
    }
    }
    return index;
    }
    
    void Supprime(int x){
    personne.remove(x);
    }
     public  String Lecture()  {
        //initialise x qui note si la lecture est un int ou autre
      
        //si la prochaine lecture est un int, stock la lecture comme un chiffre et augment de 1 la variable qui note la quantiter de chiffre
            str2 = scan.next();
            
        //renvoie a calcul si lentrer est du text ou non parce que si cest du text aka string il ny a pas de calcul
        return str2;
    }
    void StockMaker() {
        FileChooser();
    while(scan.hasNext()){
    String Nom = Lecture();
    String Num = Lecture();
    String Age = Lecture();
    String Ville = Lecture();
    String strPermis = Lecture();
    boolean permis = false ;
    if (strPermis == "true"){
    permis = true;
    }
    Add(new Stock(Nom,Num,Age,Ville,permis));
    
    }
    }
  

    public  void FileChooser()  {
        
            //initialise mon fichier et mon scanner 
            File fichier = null;
            Scanner scan1 = null;
            //essai avant dagir
            try {
                //de choisir un fichier
                JFileChooser fileChooser
                        = new JFileChooser(System.getProperty("user.dir"));
                //
                int valRetour = fileChooser.showOpenDialog(null);
// si valRetour note que cest un fichier
                if (valRetour == 0) {

                    fichier = fileChooser.getSelectedFile();

                    if (!fichier.isFile()) {
                        throw new FileNotFoundException("Pas un fichier");
                    }

                } else {
                    throw new FileNotFoundException("Problème avec FC");
                }
//Scan le fichier
                scan1 = new Scanner(fichier);
                //si il y a lerreur que xxx est arriver fait ceci
            } catch (FileNotFoundException ex) {

                System.out.println("Oops - le nom de fichier est mauvais.");

            }// fin catch
            //si il n y a pas derreur 
            finally {
//le scan devient public pour tout le monde
                scan = scan1;

            }
}

}
