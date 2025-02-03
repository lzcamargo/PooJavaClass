package exerc2;
import java.util.InputMismatchException;

public class Executora {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		//calculadora.somar(0000000000, -1);
		
		try {
			calculadora.subtrair(1, 1);
			} catch (ArithmeticException ae) {
					System.out.println("Entrada Incorreta, Saída negativa ...." + ae);
		}
		
		try {
			calculadora.multiplicar(1.00f, 2);
			} catch (InputMismatchException ie) {
					System.out.println("Entrada Incorreta ...." + ie);
		}
		try {
			calculadora.dividir(2, 0);
		} catch (InputMismatchException ie) {
			System.out.println("Não se permite divisão por zero  ...." + ie);
		}
		
	}

}
