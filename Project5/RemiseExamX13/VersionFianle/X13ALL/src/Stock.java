import java.awt.*;



public class Stock {

    String nom,age,ville = "textField";
    String num = "textField";

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
       String x = ("nom : "+nom+"\n"+" numero : "+"\n+"+num+"+\n"+"  permis:"+strPermis );
       return x;
    }

    String GetNom(){
    return nom;
    }

}


