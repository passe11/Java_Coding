class Auto {
   // vble – attributs
   double odoDebut, odoFin, litres;
   String nome,coulome;
   // constructeur
 // il accepte les valeurs d'ailleurs
 Auto (double debut, double fin, double lit,String nom,String couleur) {
      
       odoDebut = debut;
       odoFin   = fin;
       litres   = lit;
 } //fin constructeur
  // méthodes// méthodes
 double calculeConsommation () {
    Convertion mlg = new Convertion();
    double miles = mlg.Convertirkm (odoFin - odoDebut);
    
    return ((100 * mlg.ConvertirLitre(litres)) / mlg.Convertirkm (odoFin - odoDebut)); 
    
 }

} 