
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CECCE
 */
public class Entrer {
    double debut,fin,litres;
    Scanner scan = new Scanner(System.in); 
 Entrer () {
     
       
 }   
    
    
Stock Get(){
    

    debut  = DemandeDouble("La lecture pour commencer: ");
    fin    = DemandeDouble("La lecture Ã  la fin: " );
    litres = DemandeDouble("Nombre de litres: " );
    System.out.println("NomVoiture");
    String nomVoiture = scan.next();
    System.out.println("Couleur");
    String Couleur = scan.next();
    
     Stock v1 = new Stock( debut, fin, litres,nomVoiture,Couleur);
     return v1;
}
double DemandeDouble(String tmp) {
      double dbl = 0.0;
      System.out.println(tmp);
      dbl = scan.nextDouble();
      return dbl;
   } //fin DemandeDouble
}
