/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CECCE
 */
public class Manager2 {
    String nom,num,couleur = " ";
    boolean entrer = false ,permis = true;
      Liste liste = new Liste();

class Manager {

}

void Nouveau (IUG2 a){
    
      
        
                nom = a.LireNom();
                num = a.LireNum();
               
            
      
liste.Add (new Stock(nom,num,couleur,true));
}
void Enleve(){
liste.Del();
}
Stock Get(int a){
return liste.Get(a);
}


}