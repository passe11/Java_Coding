

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
    //active pourAllin
    JTextField textJ = new JTextField(" ", 7);
    //JUSTE DES PANELS VIDE pour placer les choses comme je veus
    
    //total dse carte de base

    Manager x = new Manager();
    //plein de different taille de grid qui sont ...
    
    GridLayout GridCarte1 = new GridLayout(3, 1);
    FlowLayout flow = new FlowLayout();

    //plein de panel
    JPanel ranger1 = new JPanel();
    JPanel ranger2 = new JPanel();
    JPanel ranger3 = new JPanel();

       Liste liste = new Liste();
    
    // le constructeur
    public IUG() {
        super("ExBoutonLabelText2");
        setSize(480, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // attribue-lui le gestionnaire de GridLayout
        setLayout(GridCarte1);
        ranger1.setLayout(flow);
        ranger2.setLayout(flow);
        

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
     
        add(ranger1);

       

        add(ranger2);
       
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
    }
    
        public void Plus (){
        liste.Add(x.Nouveau());       
    }
    public void Affiche(String str1){
    textJ.setText (str1);
    repaint();
    }
    public static void main(String[] arguments) {
    IUG inter = new IUG();
    } 
}  // fin class0
