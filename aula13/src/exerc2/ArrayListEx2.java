package exerc2;
import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<String> estudantes = new ArrayList<String>();
    estudantes.add("João");
    estudantes.add("Maria");
    estudantes.add("José");
    estudantes.add("Asdrubal");
    
    estudantes.add(0, "Lucas");
    estudantes.add(1, "Ana");
    
    estudantes.remove(3);

    System.out.println("Estudantes  são: " + estudantes);
    System.out.println("Há " + estudantes.size() + " estudantes");


	}

}
