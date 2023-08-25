package PráticaPackage;

import java.util.Scanner;

public class MultaClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite a velocidade registrada pelo radar");
		float vel = scn.nextFloat();
		
		if (vel <= 10) {
			System.out.println("O valor da multa será de R$50,00");
		}
		
		else if (vel <= 30) {
			System.out.println("O valor da multa será de R$100,00");
		}
		
		else { 
			System.out.println("O valor da multa será de R$200,00");
		}
	}

}
