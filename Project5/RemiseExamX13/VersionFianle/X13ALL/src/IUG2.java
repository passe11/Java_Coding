
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
import javax.swing.colorchooser.*;

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
    //JColorChooser tcc;
    

    //active pourAllin
    JTextField textNom = new JTextField(" ", 7);
    JTextField textNum = new JTextField(" ", 7);
    JTextField textVille = new JTextField(" ", 7);
    JTextField textAge = new JTextField(" ", 7);
    Checkbox box = new Checkbox("", null, true);
    //JUSTE DES PANELS VIDE pour placer les choses comme je veus
    JLabel lNom = new JLabel("Nom  :  ");
    JLabel lNum = new JLabel("Numero  :  ");
    JLabel lVille = new JLabel("Ville  :  ");
    JLabel lPermis = new JLabel("Permis :  ");
    JLabel lAge = new JLabel("Age :  ");
    //total dse carte de base


    //plein de different taille de grid qui sont ...
    BorderLayout border = new BorderLayout();
    GridLayout GridCarte1 = new GridLayout(5, 3);
    FlowLayout flow = new FlowLayout();
    GridLayout TabTop = new GridLayout(5, 3);
    
    //String command = " ";

    //plein de panel
    JPanel ranger1 = new JPanel();
    JPanel ranger2 = new JPanel();
    JPanel header = new JPanel();
    JPanel ranger3 = new JPanel();
    
    IUG a ;

    
    // le constructeur
    public IUG2(IUG a) {
        super("ALLO");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // attribue-lui le gestionnaire de GridLayout
        
        setLayout(border);
        ranger1.setLayout(flow);
        ranger2.setLayout(flow);
        header.setLayout(TabTop);
        ranger3.setLayout(flow);
        
        //carte2.setLayout(GridCarte2);
        // lie le bouton a la méthode actionListener pour savoir quoi
        // faire lorsque le bouton est clique
        bouton1.addActionListener(this);
    
        ranger1.add(lNom);
        ranger1.add(textNom);
        
        ranger1.add(lNum);
        ranger1.add(textNum);
        
        ranger2.add(lAge);
        ranger2.add(textAge);
        ranger2.add(lPermis);
        ranger2.add(box);
        header.add(ranger1);
        header.add(ranger2);
        
        add(header,border.NORTH); 
        
        ranger3.add(bouton1);
        add(ranger3,border.PAGE_END);
       
        setVisible(true);
        this.a = a ;
    }  
    
    
   
    public void actionPerformed(ActionEvent e) {
        
        String command = e.getActionCommand();
        a.Nouveau();
        
    }

    public String LireNom(){
    String str1 = textNom.getText();
    return str1;
    }
    public String LireNum(){
    String str1 = textNum.getText();
    return str1;
    }
    public boolean LirePermis(){
    boolean permis = box.getState();
    return permis;
    }
    public String LireVille(){
    String str1 = textVille.getText();
    return str1;    
    }
    public String LireAge(){
    
    String str1 = textAge.getText();
    return str1;
    }
    public void Fermer(){
    this.removeAll();
    }

    
}  // fin class0
