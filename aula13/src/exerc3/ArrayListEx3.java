package exerc3;
import java.security.DrbgParameters.NextBytes;
import java.util.*;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(66);
		numeros.add(13);
		numeros.add(11);
		numeros.add(5);
		numeros.add(79);
		numeros.add(95);
		numeros.add(84);

		Iterator<Integer> iterator = numeros.iterator();
		while (iterator.hasNext()) {
			System.out.println("Numeros " + iterator.next());
		}
		
		for (int i = 0; i < numeros.size(); i++) {
		  if (numeros.get(i) % 2 == 0) {
		    numeros.remove(i);
		  }
		}
    System.out.println("Numeros impares " + numeros);
	
 }

}
