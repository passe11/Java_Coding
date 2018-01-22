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
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Liste {
    public static int compteur = 0;
    private static List<Stock> personne ;
    static Manager x = new Manager();
    
    
    public Liste () {
personne = new ArrayList();
}
void Add(Stock a){
personne.add(a);
}    
    
    
    
}
