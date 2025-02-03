package demonstra;
import java.util.*;

public class DesempenhoList {

	public static void main(String[] args) {
		final int MAX = 20000;
    long tInicio = System.currentTimeMillis();
    List<Integer> lista = new LinkedList<Integer>();
    //List<Integer> lista = new ArrayList<Integer>();
    
    for (int i = 0; i < MAX; i++) {
      lista.add(i);
    }

//    for (int i = 0; i < MAX; i++) {
	//    lista.contains(i);
	    //lista.get(i);
    	
	//  }
    
  //  for (int i = 19999; i >=0; i--) {
   
    //    	lista.remove(i);
    	//  }
	  
    long tFim = System.currentTimeMillis();
	  System.out.println("Tempo total: " + (tFim - tInicio));
  }
}
