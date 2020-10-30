package imc;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite seu peso: ");
		double weight = scan.nextDouble();
		System.out.print("Digite sua altura: ");
		double height = scan.nextDouble();

		Imc imc = new Imc(weight, height);

		System.out.println(imc);

		scan.close();

	}

}
