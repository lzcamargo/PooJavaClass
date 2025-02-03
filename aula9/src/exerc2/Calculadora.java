package exerc2;

import java.util.InputMismatchException;

public class Calculadora {
	
	public void somar(int num1, int num2) {
		try {
			if (num1 < 0 || num2 < 0) throw new InputMismatchException();
			System.out.println("Soma de " + num1 + " e " + num2 + " é: " + (num1 + num2));
		} catch (InputMismatchException ie) {
			System.out.println("Entrada Incorreta com Número negativo...." + ie.getMessage());
			
		}
	}	
	
	public void subtrair(int num1, int num2) {
		if ((num1 - num2) < 0) throw new ArithmeticException(); 
			System.out.println("Subtração de " + num1 + " e " + num2 + " é: " + (num1 - num2));
	}
	
	public void multiplicar(float num1, int num2) {
		String tipVarNum1 = ((Object) num1).getClass().getSimpleName();
		String tipVarNum2 = ((Object) num2).getClass().getSimpleName();

		if (!tipVarNum1.contains("Float") || (!tipVarNum2.contains("Integer" ))) throw new InputMismatchException();
		System.out.println("Multiplicação de " + num1 + " e " + num2 + " é: " + (num1 * num2));
	
	}
	
	public void dividir(int num1, int num2) {
		if (num2 == 0) throw new InputMismatchException();
		System.out.println("Multiplicação de " + num1 + " e " + num2 + " é: " + (num1 / num2));
	}
	
}
