import java.awt.*;



public class Stock {

    String nom,age,ville = "textField";
    String num = "textField";
    Color couleur ;
    boolean permis;

    Stock(String nomme, String numme,String agee, String villee, boolean permise) {
    num = numme ;
    nom = nomme ;
    age = agee;
    ville = villee ;
    permis = permise;
    }

    String Assemble() {
       String strPermis = String.valueOf(permis);
       String x = ("nom : "+nom+" numero : "+num+"  permis:"+strPermis );
       return x;
    }
    Color GetColor(){
    return couleur;    
    }

}


