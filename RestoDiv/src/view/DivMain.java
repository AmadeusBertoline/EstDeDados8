package view;

import controller.DivController;
import java.util.Scanner;

public class DivMain {

	public static void main(String[] args) {

		int divd, divis, res;

		DivController div = new DivController();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dividendo: ");
		divd = scanner.nextInt();

		System.out.println("Divisor: ");
		divis = scanner.nextInt();

		res = div.Divisao(divd, divis);

		System.out.println("Resto da divisão: " + res);

		scanner.close();

	}

}
