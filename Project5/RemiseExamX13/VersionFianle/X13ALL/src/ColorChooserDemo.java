import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;

import java.awt.event.ActionListener;
 
/* ColorChooserDemo.java requires no other files. */
public class ColorChooserDemo extends JPanel
                              implements ChangeListener  {
 
    JColorChooser tcc;
    BorderLayout border = new BorderLayout();
    JButton bouton1 = new JButton("Comfirmer");
    JLabel banner = new JLabel("Choisi ta Couleur",JLabel.CENTER);
    JPanel bannerPanel = new JPanel(new BorderLayout());
    JPanel bannerPanel2= new JPanel(new BorderLayout());
    
    
    JTextField textNom = new JTextField(" ", 7);
    JTextField textNum = new JTextField(" ", 7);
    //JUSTE DES PANELS VIDE pour placer les choses comme je veus
    JLabel lNom = new JLabel("Nom  :  ");
    JLabel lNum = new JLabel("Numero  :  ");
    JLabel lPermis = new JLabel("Permis  :  ");
    //total dse carte de base
    GridLayout flow = new GridLayout(3,2);
    JPanel ranger1 = new JPanel();
    JPanel ranger2 = new JPanel();
    Checkbox box = new Checkbox("", null, true);
    IUG a ;
    public ColorChooserDemo() {
        super(new GridLayout());
     
        //Set up the banner at the top of the window
        ranger1.setLayout(flow);
        
      
        banner.setOpaque(true);
        banner.setFont(new Font("", Font.BOLD, 24));
        banner.setPreferredSize(new Dimension(100, 65));
 
        
        bannerPanel.add(banner, BorderLayout.NORTH);
 
        //Set up color chooser for setting text color
        tcc = new JColorChooser(banner.getForeground());
        tcc.getSelectionModel().addChangeListener(this);
     
        tcc.setBorder(BorderFactory.createTitledBorder(
                                             "Choisi Couleur "));
//        bouton1.addComponentListener(l);
         bannerPanel.add(tcc, BorderLayout.CENTER);
        add(bannerPanel, BorderLayout.NORTH);
        
        ranger1.add(lNom);
       
        
        ranger1.add(textNom);
        
        
        ranger1.add(lNum);
        
        ranger1.add(textNum);
        
        ranger1.add(lPermis);
        ranger1.add(box);
        
        lNom.setFont(new Font("", Font.BOLD, 24));
        lNum.setFont(new Font("", Font.BOLD, 24));
        lPermis.setFont(new Font("", Font.BOLD, 24));
       
        
        
        bannerPanel2.add(ranger1, BorderLayout.CENTER);
        //bannerPanel2.add(ranger2, BorderLayout.CENTER);
        bannerPanel2.add(bouton1, BorderLayout.PAGE_END);
        //bouton1.addActionListener(this);
        add(bannerPanel2);
    }
 
    public void stateChanged(ChangeEvent e) {
        Color newColor = tcc.getColor();
        banner.setForeground(newColor);
    }
 
      public String LireNom(){
    String str1 = textNom.getText();
    JOptionPane.showMessageDialog(this,str1);
    return str1;
    }
    public String LireNum(){
    String str1 = textNum.getText();
    JOptionPane.showMessageDialog(this,str1);
    return str1;
    }
    public Color LireCouleur(){
    Color newColor = tcc.getColor();
    return newColor;
    }
    public boolean LirePermis(){
    boolean permis = box.getState();
    return permis;
    }
       
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
     void createAndShowGUI() {
      
        //Create and set up the window.
        JFrame frame = new JFrame("ColorChooserDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new ColorChooserDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
       
 
    public void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
