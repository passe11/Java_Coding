
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
public class Stock {

    double odoDebut, odoFin, litres;
    String Coule, nomme;

    Stock(double debut, double fin, double lit, String nom, String couleur) {
        odoDebut = debut;
        odoFin = fin;
        litres = lit;
        Coule = couleur;
        nomme = nom;
    }

    double Calcul() {
        Convertion mlg = new Convertion();

        return ((100 * mlg.ConvertirLitre(litres)) / mlg.Convertirkm(odoFin - odoDebut));
    }

    String NomCoule() {
        String mix = (Coule + "   " + nomme);

        return mix;
    }
}
