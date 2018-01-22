import java.util.ArrayList; 
import java.util.Collections;   
public class Sort {
  private ArrayList<String> arrayList;       
  public Sort(ArrayList<String> arrayList) {
    this.arrayList = arrayList;     
  }       
  public ArrayList<String> getArrayList() {         
    return this.arrayList;     
  }       
  public ArrayList<String> sortAscending() {         
    Collections.sort(this.arrayList);         
    return this.arrayList;     
  }       
  public ArrayList<String> sortDescending() {         
    Collections.sort(this.arrayList, Collections.reverseOrder());         
    return this.arrayList;     
  } 
}