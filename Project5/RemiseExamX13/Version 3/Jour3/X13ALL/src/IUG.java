

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

 import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author pasca
 */
public class IUG extends JFrame implements ActionListener {

    //**************************************************
    // tout ce qui est GUI
    //**************************************************   
    //clique pour nouvelle carte
    JButton bouton1 = new JButton("Plus");
    JButton bouton2 = new JButton("Moins");
    JButton bouton3 = new JButton("Recherche");
    JButton bouton4 = new JButton("Organis");
    JButton bouton5 = new JButton("Prochain");
    JButton bouton6 = new JButton("Precedent");
    //active pourAllin
    JTextField textJ1 = new JTextField(" ", 7);
    JTextField textJ = new JTextField(" ", 7);
    JTextField textJ2 = new JTextField(" ", 7);
   
    //JUSTE DES PANELS VIDE pour placer les choses comme je veus
    
    //total dse carte de base

     Liste liste = new Liste();

    int compteur = 0;
    //plein de different taille de grid qui sont ...
    
    BorderLayout border = new BorderLayout();
     BorderLayout border2 = new BorderLayout();
    GridLayout GridFill = new GridLayout(1, 1);
    
    FlowLayout flow = new FlowLayout();

    //plein de panel
    JPanel ranger1 = new JPanel();
    JPanel ranger2 = new JPanel();
    
    JPanel ranger3 = new JPanel();

     
    
    // le constructeur
    public IUG() {
        super("ExBoutonLabelText2");
        setSize(480, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // attribue-lui le gestionnaire de GridLayout
        setLayout(border2);
        ranger1.setLayout(flow);
        ranger2.setLayout(border);
        ranger3.setLayout(flow);

        //carte2.setLayout(GridCarte2);
        // lie le bouton a la méthode actionListener pour savoir quoi
        // faire lorsque le bouton est clique
        bouton1.addActionListener(this);
        bouton2.addActionListener(this);
        bouton3.addActionListener(this);
        bouton4.addActionListener(this);

        ranger1.add(bouton1);
        ranger1.add(bouton2);
        ranger1.add(bouton3);
        ranger1.add(bouton4);
     
        add(ranger1,border.NORTH);

        ranger2.add(textJ1,border.NORTH);
        ranger2.add(textJ,border.CENTER);
        ranger2.add(textJ2,border.SOUTH);
        add(ranger2,border.CENTER);
      
        ranger3.add(bouton5);
        ranger3.add(bouton6);
        add(ranger3,border.SOUTH);
       
        setVisible(true);
    }  
   
    public void actionPerformed(ActionEvent e) {
    
      String command = e.getActionCommand();
        if (command == "Plus"){
        Plus();
               }
        if (command == "Moins"){
        //Moins();
        }
        if (command == "Prochain"){
        compteur ++;
        //Affiche();
        }
        if (command == "Precedent"){
        compteur --;
       // Affiche();
        }
    }
    
        public void Plus (){
            IUG2 b = new IUG2(this);
           // IMG a = new IMG();
           // a.SendIMG(this);
          //  b.createAndShowGUI(this);
    }
        void Nouveau (IUG2 a){
            
        
               String  nom = a.LireNom();
               JOptionPane.showMessageDialog(this,nom);
               String num = a.LireNum();
               String age = a.LireAge();
               String ville = a.LireVille();
               JOptionPane.showMessageDialog(this,num);
               //Color couleur = a.LireCouleur();
               boolean permis = a.LirePermis();
               a.Fermer();
               
liste.Add (new Stock(nom,num,age,ville,permis));
textJ.setText(liste.AK());
textJ.repaint();
}
        public void Moins (){
       // x.Enleve();       
    }
        
    public void Affiche(int x){
    Stock a = liste.Get(x);
   
    
    textJ1.setBackground(a.GetColor());
    textJ2.setBackground(a.GetColor());
    textJ.setText(a.Assemble());
    textJ.repaint();
    }
    
    public static void main(String[] arguments) {
    IUG inter = new IUG();
    } 
}  // fin class0
