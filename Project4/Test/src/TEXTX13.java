
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class TEXTX13 {

    static Scanner scan;
    static int joueur = 0;          // identifie le joueur courant
    static boolean debug = true;   // debugging
    static int totalJoueur1 = 0;    // total de pts pour J1
    static int totalJoueur2 = 0;    // total de pts pour J2
    static String joueur1Str = "";  // nom de J1 et J2
    static String joueur2Str = "";
    static Scanner user = new Scanner(System.in);
    static int valeurGagnante = 20;  // valeur pour gagner (100, test avec 20)
    static boolean premierEcrit = true;
    static File fichierEcrit = null;

    // array utiliser avec le showOptionDialog
    static String[] JouePasseOptions = {"Roule", "Passe"};

    /**
     * ************************************************
     * Description: Imprimer du debugging Arguments: la String ï¿½ imprimer
     * Retour : aucune
   **************************************************
     */
    public static void Debogue(String s) {
        if (debug) {
            System.out.println(s);
        }
    }

    public static void Scannner() throws IOException {

        scan = new Scanner(FileChooser());
                //si il y a lerreur que xxx est arriver fait ceci

    }

    public static void Ecrire(int ecriture, int pts) throws IOException {
        if (premierEcrit == true) {
            fichierEcrit = FileChooser();
            premierEcrit = false;
        }
        PrintWriter sortie = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(fichierEcrit, true)));
        String uneStr = NomDuJoueur();
        switch (ecriture) {
            case 1:
                sortie.println("   ***" + joueur1Str + " as " + totalJoueur1 + " pts et " + joueur2Str
                        + " en as " + totalJoueur2);
                break;
            case 2:
                sortie.println(uneStr + " a " + pts + "  -> Totals sont: " + joueur1Str + " = "
                        + totalJoueur1 + " et " + joueur2Str + " = " + totalJoueur2);
                break;
            case 3:
                sortie.println("\nFÃ©licitations " + uneStr
                        + ": tu as gagnÃ©!!!!!!");
                break;
            case 4:
                sortie.println("*****" + NomDuJoueur()
                        + " as perdu ses points*****\n");
                break;
            case 5:
                sortie.println("------" + NomDuJoueur()
                        + " Passe------\n");
                break;
        }
        sortie.close();

    }

    public static File FileChooser() throws IOException {
        {
            //initialise mon fichier et mon scanner 
            File fichier = null;
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
                    throw new FileNotFoundException("ProblÃ¨me avec FC");
                }
//Scan le fichier

            } catch (FileNotFoundException ex) {

                System.out.println("Oops - le nom de fichier est mauvais.");

            }// fin catch
            //si il n y a pas derreur 
            finally {
//le scan devient public pour tout le monde
                return fichier;

            }
        }
    }

    /**
     * ************************************************
     * Description: Demande aux usager pour leur nom Arguments: String, lequel
     * des joueurs pour le nom Retour : void, mise ï¿½ï¿½ jour des noms
   **************************************************
     */
    public static void DemandeNom() throws IOException {
        int nom = 1;
        boolean finLoopNom = false;

        Scannner();
        do {
            if (scan.hasNext()) {

                switch (nom) {
                    case 1:
                        joueur1Str = scan.next();
                        nom++;
                        break;
                    case 2:
                        joueur2Str = scan.next();
                        finLoopNom = true;
                        break;
                    default:
                        
                        break;

                }
            }
        } while (finLoopNom == false);

    } // fin DemandeNom

    /**
     * ************************************************
     * Description: Decide si roule ou passe Arguments: bool, indique que c'est
     * premier tour Retour : bool, indique vraie opur veut rouler
   **************************************************
     */
    public static boolean DecideRouler(boolean premierTour) {
        int choix = 0;

        Debogue("Entre dans DecideRouler");

        // Si c'est le premier tour, on ne demande pas de rouler ou non
        if (!premierTour) {
            // decide de rouler ou de passer
            if (TuVeuxRouler() == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return true; // par defaut, le premier tour, tu roules
        }
    } //fin DecideRouler

    /**
     * ************************************************
     * Description: Pose la question, assure que entre seulement R ou P
     * Arguments: aucune Retour : int, le choix de rouler(0) ou passer (1)
   **************************************************
     */
    public static int TuVeuxRouler() {
        char unChar = ' ';
        String decision = "";
        boolean ok = false;
        int choix = 99;

      // continue a poser la question tant que pas rouler ou passer
        // doit avoir boucle pour empecher de cliquer le X.
        while (!ok) {
            choix = JOptionPane.showOptionDialog(null, NomDuJoueur()
                    + ", veux-tu rouler ou passer?",
                    "Le Cochon", JOptionPane.WARNING_MESSAGE,
                    JOptionPane.DEFAULT_OPTION,
                    null, JouePasseOptions, JouePasseOptions[0]);

            Debogue("  choix=" + choix);
            if (choix == 0) {
                ok = true;
            } else {
                if (choix == 1) {
                    ok = true;
                } else {
                    ok = false;
                }
            }
        } // fin boucle 
        return choix;
    } // fin TuVeuxRouler

    /**
     * ************************************************
     * Description: Utiliser random() pour simuler rouler du dÇ¸ Arguments:
     * aucun Retour : int, la valeur de 1 - 6
   **************************************************
     */
    public static int RouleLeDai() {
        int valeur = (int) (Math.random() * 6) + 1;
        JOptionPane.showMessageDialog(null, NomDuJoueur() + " tu as roulÃ©: " + valeur);
        return valeur;
    } // fin RouleLeDer

    /**
     * ************************************************
     * Description: Affiche les totals et les pts ï¿½ï¿½ ce pts du pgm
     * Arguments: int - les pts rouler pour ce tour Retour : void
   **************************************************
     */
    public static void AfficheTotals(int pts) throws IOException {
        String uneStr = "";

        uneStr = NomDuJoueur();
        Ecrire(2, pts);
        JOptionPane.showMessageDialog(null,
                uneStr + " a " + pts + "  -> Totals sont: " + joueur1Str + " = "
                + totalJoueur1 + " et " + joueur2Str + " = " + totalJoueur2);
    }

    /**
     * ************************************************
     * Description: On ajoute les pts du tour au total Arguments: int, nombre de
     * pts rouler ce tour Retour : void
   **************************************************
     */
    public static void AJourPoint(int pts) throws IOException {
        Debogue("Entre dans AJourPoint avec pts= " + pts);
        if (joueur == 0) {
            totalJoueur1 += pts;
        } else {
            totalJoueur2 += pts;
        }

        Debogue("   ***" + joueur1Str + " as " + totalJoueur1 + " pts et " + joueur2Str
                + " en as " + totalJoueur2);
        Ecrire(1, 2);
    } // fin AJourPoint

    /**
     * ************************************************
     * Description: DÇ¸termine si gagant Arguments: int, pts pour ce tour
     * (ï¿½ï¿½ Ç¦tre ajouter temp. aux totals) Retour : int, -1 si pas gagnant,
     * autrement le # du gagnant
   **************************************************
     */
    public static int AsTuGagner(int pts) {
        Debogue("Entre dans AsTuGagner avec pts= " + pts);
        int temp = 0;
        if (joueur == 0) {
            temp = totalJoueur1 + pts;
        } else {
            temp = totalJoueur2 + pts;
        }

        Debogue("  ***J1=" + totalJoueur1 + "  J2=" + totalJoueur2 + "  pts=" + pts
                + "  temp=" + temp);

      // si on a un gagnant, retourne-le
        // autrement, retourne -1
        if (temp > valeurGagnante) {
            return joueur;
        } else {
            return -1;
        }

    } // AsTuGagner

    /**
     * ************************************************
     * Description: Switch entre joueur 0 et joueur 1 Arguments: rien Retour :
     * rien
   **************************************************
     */
    public static void ChangeDeJoueur() {
        Debogue("Avant change joueur: " + joueur);
        joueur = (++joueur) % 2;
        Debogue("AprÃ¨s change joueur: " + joueur);
    }

    /**
     * ************************************************
     * Description: Affiche fÇ¸licitations que qqun a gagner Arguments: aucun
     * Retour : void
   **************************************************
     */
    public static void Felicitations() throws IOException {
        //String gagnant = "";
        Debogue("Entre dans Felicitations");

        //gagnant = NomDuJoueur();
        JOptionPane.showMessageDialog(null, "\nFÃ©licitations " + NomDuJoueur()
                + ": tu as gagnÃ©!!!!!!\n\n");
        Ecrire(3, 3);

    }

    /**
     * ************************************************
     * Description: DÇ¸termine le nom du joueur car le int global Arguments:
     * aucun Retour : String, le nom
   **************************************************
     */
    public static String NomDuJoueur() {
        String uneStr = "";
        if (joueur == 0) {
            uneStr = joueur1Str;
        } else {
            uneStr = joueur2Str;
        }
        return uneStr;
    } // fin NomDuJoueur

    /**
     * ************************************************
     * Description: met ï¿½ï¿½ jour et passe le joueur Arguments: les pts
     * intermÇ¸diaire Retour : void
   **************************************************
     */
    public static void ProchainJoueur(int pts) throws IOException {

        // si les pts sont 0, c'est que tu as roulÇ¸ le 1. Autrement, tu as passÇ¸
        if (pts == 0) {
            JOptionPane.showMessageDialog(null, "*****" + NomDuJoueur()
                    + " as perdu ses points*****\n");
            Ecrire(4, 0);
        } else {
            JOptionPane.showMessageDialog(null, "------" + NomDuJoueur()
                    + " Passe------\n");
            Ecrire(5, 0);
        }
        AJourPoint(pts);
        ChangeDeJoueur();

    } // fin ProchainJoueur

    /**
     * ************************************************
     * Description: boucle du jeu pour un joueur Arguments: aucun Retour :
     * retour le numï¿½ro du gagant
   **************************************************
     */
    public static int BoucleCentrale() throws IOException {
        // -1 indique pas de gagnant, 0,1 indique le # du gagant
        int unGagnant = -1;

        // contrï¿½ï¿½le la boucle interne, peut continuer ï¿½ï¿½ rouler le dÇ¸
        boolean continueTonTour = true;

        // indique que premier tour, donc ne veux pas demander de rouler ou passer
        boolean premierTour = true;

        // valeur du dÇ¸
        int valeur = 0;

        // pts temporaire, pour ce tour
        int ptsTemp = 0;

        // pendant que c'est le tour d'un joueur, vas-y
        while (continueTonTour) {

         // si pas premier tour, demande de rouler ou passer
            // si roule, on simule le rouler du dÇ¸ et on analyse le rÇ¸sultat
            // autrement, si passe, on calcule les pts et passe de joueur
            if (DecideRouler(premierTour)) {
                premierTour = false;
                valeur = RouleLeDai();

            // tu perds tes points pour cette ronde
                // tu sort de la boucle et on change de joueur
                if (valeur == 1) {
                    ptsTemp = 0;
                    continueTonTour = false;
                    premierTour = true;
                    ProchainJoueur(ptsTemp);
                } else {
               // ajoute la valeur de dÇ¸, affiche les totals
                    // vÇ¸rifie pour gagnant et continue ton tour!
                    ptsTemp += valeur;
                    AfficheTotals(ptsTemp);

                    unGagnant = AsTuGagner(ptsTemp);
                    if (unGagnant >= 0) {
                  // si gange, sort d'icitte
                        // la valeur de unGagant sera 0 ou 1, indiquant le gagnant
                        continueTonTour = false;
                    }
                } // if valeur

            } else { // on passe
                // passe ton tour, donc accumule tes pts et change de joueurs
                premierTour = true;
                continueTonTour = false;
                ProchainJoueur(ptsTemp);
                ptsTemp = 0;
            } // if DecideRouler
        } // fin boucle continueTonTou

        return unGagnant;
    } // fin BoucleCentrale

    public static void main(String[] args) throws IOException {

        // demande le nom des 2 joueurs
        DemandeNom();

        do {  // avons-nous un gagnant?
            // on boucle jusqu'au point d'avoir un gagnant
        } while (BoucleCentrale() < 0);
        // way to go...
        Felicitations();
    } // fin main
} // fin classe
