package PráticaPackage;

import java.util.Scanner;

public class FaixaEt {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite a idade");
		int age = scn.nextInt();
		
		if (age <= 12) {
			System.out.println("Pertence a faixa etaria de Criança.");
		}
		
		else if (age >= 13 && age <= 17) {
			System.out.println("Pertence a faixa etaria de Adolescente.");
		}
		
		else if (age >= 18 && age <= 59) {
			System.out.println("Pertence a faixa etaria de Adulto.");
		} 
		
		else {
			System.out.println("Você é um velhote.");
		}
		

	}

}
