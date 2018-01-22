
import javax.swing.JOptionPane;

public class Exersice {

    static String tailleStr = " ";
    static int num = 0;
    static int[] tab1D = null;
    static int[] tab11D = new int[2];
    static int tailleTableau;
    static int num1 = 0;
    static int compte = 0;
    static boolean conditionPair = true;
    static boolean boutPair = true;
    static boolean peutImporte = false;

    public static void Swap(int i, int n) {
        if (i == 0) {
            num1 = tab1D[i];
        }
        tab1D[i] = tab1D[n];
        if (n == (tab1D.length - 1)) {
            tab1D[n] = num1;
        }

    }

    public static void RotationGauche() {

        for (int i = 0, n = 1; n < tab1D.length; i++, n++) {
            //System.out.print("  i    " +tab1D[i]+"    n  "+ tab1D[n]);
            Swap(i, n);
        }
        LireTableau(true);
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

    public static void LireTableau(boolean changement) {
        if (changement == false) {
            System.out.print("Tableau avant changement exercise" + compte+ "   ");
        } else {
            System.out.print("Tableau après changement exercise" + compte+ "   ");
        }
        
        for (int i = 0; i < tab1D.length; i++) {
            System.out.print(+tab1D[i] + "  ,");

        }
        
    }
    public static boolean ConditionTaille (int tableau){
   
    if (Pair(tableau) || (peutImporte)){
        if ((tableau >=2)&&(tableau <=20)){
    return true;
    }
    else {
    return false;
    }
    
    }else {
    return false;
    }
    }
    
    public static void TailleTableau() {
        boolean nombreValide = true;
        do {
            try {
                tailleStr = JOptionPane.showInputDialog("Exersice   " + compte + "Quelle est la taille du tableau   ");
                tailleTableau = Integer.parseInt(tailleStr);
                if (ConditionTaille (tailleTableau)) {
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
    public static void BoutPair(){
    if (Pair(tab1D [0] )&&(Pair(tab1D.length - 1))){
     System.out.println("Les bouts du tableau pour exersice " + compte+ " sont paire   ");
    }else{
    System.out.println("Les bouts du tableau pour exersice " + compte+ " sont impaire  ");
    }
    }
    public static void Compteur(int exersice) {
        compte = exersice;
       
        
        
        TailleTableau();
        CreerTableau();
        EcrireTableau();
        LireTableau(false);
        switch (compte){
            case 1: Milieux();
               break;
            case 2: BoutPair();
               break;
            //case 3: UnouTrois();
            //break;
            case 4: RotationGauche();
            break;
        
        }
        
        
        
    }
    public static void UnouTrois(){
    
     for (int i = 0; i < tab1D.length; i++) {
            System.out.print(+tab1D[i] + "  ,");

        }
    
    
    
    }
    public static void Milieux (){
        int mid1 = ((tab1D.length - 1) / 2);
        int mid2 = (mid1 + 1);
        tab11D[0] = tab1D[mid1];
        tab11D[1] = tab1D[mid2];
        
        for (int i = 0; i < 2; i++) {
            System.out.print(" Le milieux est ");
            System.out.println(+tab11D[i] + "  ,");

        }
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
public static boolean Pair (int nombre){
if ((nombre % 2 == 0)&& (conditionPair == true)||(nombre % 2 != 0  )&&(conditionPair == false)){
    return true;

}else{return false ;
}
}
    public static void main(String args[]) {
        conditionPair = true;
        Compteur(1);
        peutImporte = true;
        Compteur(2);
        Compteur(4);

    }
}
