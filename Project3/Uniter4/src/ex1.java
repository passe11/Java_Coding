import javax.swing.JOptionPane;
public class ex1 {
   public static void main( String args[] ){
      // Déclaration du tableau, de String et int 
      int[] tab1  = {1, 45, 95, -12, 32};
   int[] tab2  = new int[5];
      String uneStr = " ";
      int num =0;
      // Demande pour numéros, converti-le et ajoute-le au tableau
      for (int i=0; i < tab1.length - 1; i++) {
         uneStr = JOptionPane.showInputDialog("Un numéro, SVP");
         num = Integer.parseInt(uneStr);
         tab1[i] = num;
         tab2[i] = tab1[i] * 2;
      } // fin boulce 1
      
      // boucle 5 fois. Affiche l’indice et la valeur
      for (int i=0;i < tab1.length - 1; i++) {
         System.out.println("Valeur :" +tab1[i]);
         System.out.println("indice: "+i+" valeur: "+tab2[i]);
      } // fin boucle 2
   } // fin de main
} // fin de classe


