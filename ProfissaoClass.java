package PráticaPackage;

import java.util.Scanner;

public class ProfissaoClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o código da profissão.");
		int cod = scn.nextInt();
		
		switch(cod) {
		case 1: System.out.println("Seu cargo é de Matemático."); break;
		case 2: System.out.println("Seu cargo é de Analista de Sistemas"); break;
		case 3: System.out.println("Seu cargo é de Físico"); break;
		case 4: System.out.println("Seu cargo é de Arquiteto."); break;
		case 5: System.out.println("Seu cargo é de Piloto de aeronaves");
		default:
		}
	}

}
