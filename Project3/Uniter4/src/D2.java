public class D2 { 
   public static void main (String args[]) {
      int[][] tab2D = { {1, 2, 3, 4, 5, 6},
         {10, 11, 12, 13, 14, 15},
         {100, 101, 102, 103, 104, 105} };
         
      for (int rang=0; rang<tab2D.length ;rang++){
         for (int col=0; col<tab2D[0].length; col++) {
            System.out.print(tab2D[rang][col]+"  ");
         }
         System.out.println();
      }
   }
}
