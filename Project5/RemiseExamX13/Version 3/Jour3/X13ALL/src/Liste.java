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
import java.util.Collections;  
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Liste {
    public static int compteur = 0;
    private static List<Stock> personne ;
    private static List<String> nomPersonne ;
    //static Manager x = new Manager();
    
    
    public Liste () {
personne = new ArrayList();
nomPersonne = new ArrayList();
}
String AK(){
Sort a = new Sort(nomPersonne);
}
void Add(Stock a){
personne.add(a);
}
int Index(Stock b){
int index = personne.indexOf(b);
return index;
}
Stock Get (int x){
return personne.get(x);
}
void Del(int a){
personne.remove(a);
}
    
    
    
}
