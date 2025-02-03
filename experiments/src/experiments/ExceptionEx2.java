package experiments;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[0]);
    } catch (Exception e) {
      System.out.println("Uma Exceção, algo está errado " + e);
    } finally {
      System.out.println("Mesmo assim o Programa é finalizado!");
    }

	}

}
