package associa;

import java.util.Scanner;

public class Executora {

	public static void main(String[] args) {
		Cliente j = new Cliente("João José Júnior", 123456789);
		int op;
		double valor;
		Scanner inN = new Scanner(System.in);
		do {
			System.out.println(j.getContaCorrente().getSaldo());
			System.out.println("Opção (1/2/3):");
			op = inN.nextInt();
			switch (op) {
			case 1:
				System.out.println("Valor a creditar:");
				valor = inN.nextDouble();
				if (!j.getContaCorrente().creditar(new Transacao(valor, "01/01/2011"))) {
					System.out.println("Transação não efetuada!");
				}
				break;
			case 2:
				System.out.println("Valor a debitar:");
				valor = inN.nextDouble();
				if (!j.getContaCorrente().debitar(new Transacao(valor, "01/01/2011"))) {
					System.out.println("Transação não efetuada!");
				}
				break;
			case 3:
				Transacao extrato[] = j.getContaCorrente().extrato();
				for (Transacao transacao : extrato) {
					System.out.println(transacao.getData() + " - R$ " + transacao.getValor());
				}
				break;
			}
		} while (op != 4);

	}

}
