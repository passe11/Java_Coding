
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFileChooser;

//C pas mal self explinatory
    public class FileChoser{
    //Scanner utiliser par toute les methode pour lire le fichier choisi avec la methode file chooser
    public static Scanner scan;
    //pour stocker toute les entres String
 
    //pour enregistrer chaque String individuellement 
    public static String str2 = " ";
    
    FileChoser(Liste a) {
    FileChooser();
    StockMaker(a);
    
    }
    //Cette methode soccupe des Calcul , entre autre le total des chiffre la moyenne val max val min et d appeller la methode qui lit le fichier

    public  String Lecture()  {
        //initialise x qui note si la lecture est un int ou autre
      
        //si la prochaine lecture est un int, stock la lecture comme un chiffre et augment de 1 la variable qui note la quantiter de chiffre
            str2 = scan.next();
            
        //renvoie a calcul si lentrer est du text ou non parce que si cest du text aka string il ny a pas de calcul
        return str2;
    }
    void StockMaker(Liste liste) {
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
    liste.Add(new Stock(Nom,Num,Age,Ville,permis));
    
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
        


