
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
public class IUG2 extends JFrame implements ActionListener {

    //**************************************************
    // tout ce qui est GUI
    //**************************************************   
    //clique pour nouvelle carte
    JButton bouton1 = new JButton("OK");
    

    //active pourAllin
    JTextField textNom = new JTextField(" ", 7);
    JTextField textNum = new JTextField(" ", 7);
    //JUSTE DES PANELS VIDE pour placer les choses comme je veus
    JLabel lNom = new JLabel("Nom  :  ");
    JLabel lNum = new JLabel("Numero  :  ");
    //total dse carte de base


    //plein de different taille de grid qui sont ...
    
    GridLayout GridCarte1 = new GridLayout(3, 3);
    FlowLayout flow = new FlowLayout();
    String command = " ";

    //plein de panel
    JPanel ranger1 = new JPanel();
    JPanel ranger2 = new JPanel();
    JPanel ranger3 = new JPanel();
    

    
    // le constructeur
    public IUG2() {
        super("ALLO");
        setSize(480, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // attribue-lui le gestionnaire de GridLayout
        setLayout(GridCarte1);
        ranger1.setLayout(flow);
        ranger2.setLayout(flow);
        ranger3.setLayout(flow);
        

        //carte2.setLayout(GridCarte2);
        // lie le bouton a la méthode actionListener pour savoir quoi
        // faire lorsque le bouton est clique
        bouton1.addActionListener(this);
        
        
        ranger1.add(lNom);
        ranger1.add(textNom);
        
        add(ranger1);

        ranger1.add(lNum);
        ranger1.add(textNum);
        add(ranger2); 
        
        ranger3.add(bouton1);
        add(ranger3);
       
        setVisible(true);
    }  
   
    public void actionPerformed(ActionEvent e) {
         command = e.getActionCommand();
        
    }
    public boolean Entrer(String str1){
    if (str1 == command){
        return true;
    } else {  
     return false;   
    }
    }
    
    public String LireNom(){
    String str1 = textNom.getText();
    return str1;
    }
    public String LireNum(){
    String str1 = textNum.getText();
    return str1;
    }
    
}  // fin class0
