public class Stock {

    String nom = "textField";
    String num = "textField";
    String couleur = "textField";
    boolean permis;

    Stock(String nomme, String numme, String colorer, boolean permise) {
    num = numme ;
    nom = nomme ;
    couleur = colorer ;
    permis = permise;
    }

    String Assemble() {
       String strPermis = "a";
       return ("nom : "+nom+" numero : "+num+" couleur : "+ couleur+"  permis: "+strPermis );
    }

   /* String NomCoule() {
        String mix = (Coule + "   " + nomme);

        return mix;
    }*/
}


