
import javax.swing.JOptionPane;

public class Etape1 {

    static String tailleStr = " ";
    static int num = 0;
    static int[] tab1D = null;
    static int tailleTableau;
    
    public static void Swap(int i , int n){
    
    int num1 = tab1D[n];
    tab1D[n] = tab1D[i];
    tab1D[i] = num1;
    }
    public static void Organiser() {
    for (int y=0 ; y < tab1D.length ; y++) {
    for (int i=0 ,n = 1; n < tab1D.length ; i++, n ++) {
        //System.out.print("  i    " +tab1D[i]+"    n  "+ tab1D[n]);
    if (tab1D[i] > tab1D[n]) {
    Swap (i,n);    
    }     
    }
    }
    }

    public static void EcrireTableau() {
        boolean unique = true;
        for (int i = 0; i < tab1D.length; i++) {

            boolean numeroRepeter = true;

            do {
                try {
                    num = (int) (Math.random() * tailleTableau + 1);
                    if (Unique(num) == true) {
                        tab1D[i] = num;
                        unique = true;
                    } else {
                        unique = false;
                    }
                } catch (NumberFormatException ex) {

                }
            } while (unique == false);

        }
    } //fin methode

    public static void LireTableau() {
       for (int i=0;i < tab1D.length ; i++) {
         System.out.print( +tab1D[i]+"  ,");
            
        }
    }

    public static void TailleTableau() {
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
    }

    public static void CreerTableau() {
        tab1D = new int[tailleTableau];

    }

    public static boolean Unique(int num) {
        int i = 0;
        boolean unique = true;
        while (i < tab1D.length) {
            if (num == tab1D[i]) {
                unique = false;

            }
            i++;
        }
        return unique;
    }

    public static void main(String args[]) {
        TailleTableau();
        CreerTableau();
        EcrireTableau();
        Organiser();
        LireTableau();

    }
}
