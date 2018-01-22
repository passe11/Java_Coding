import java.util.Scanner ;
import javax.swing.JOptionPane;

class Ex1 {
   
   static Stock[]tabValeur = null;
   static int[][] tab2D = null;

   

    public static void CreerTableau() {
        Taille tail = new Taille();
        int nombreVoiture = tail.TailleTableau();  
        tabValeur = new Stock[nombreVoiture];
    }
    
        public static void LireTableau() {
       for (int i=0;i < tabValeur.length ; i++) {
         tabValeur[i].Calcul();
         tabValeur[i].NomCoule();
            
        }
    }
 

  public static void main( String[] args ) {
   
    CreerTableau();
    Entrer ent = new Entrer( );
    
    for (int i=0; i < tabValeur.length ; i++) { 
         tabValeur[i] = ent.Get();
       
      } // fin boulce 1
 
    
    
    
    Affichage output = new Affichage  ();
    output.AfficheConsommation(11);
     
  }
}