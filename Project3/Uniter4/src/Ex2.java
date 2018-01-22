import javax.swing.JOptionPane;
public class Ex2 {
   public static void main( String args[] )
   {
      // déclare 1 tableaux de String
      String[] lesNoms  = new String[5];
      String nom;
      
      // place le nom dans le tableau
      for (int i=0; i<5; i++) {
         nom = JOptionPane.showInputDialog("Un nom svp");
         lesNoms[i] = nom;
      }
      
      // Affiche le tableau
      for (int i=0; i<5; i++) {
         System.out.println("indice: "+i+" tablo: "+ lesNoms[i]);
      }
   } // fin de main
} // fin de Ex2Tableau 