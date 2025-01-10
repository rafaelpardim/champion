package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeao:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		sc.nextLine();
		System.out.println();
		Champion A = new Champion(name, life, attack, armor);
			
		System.out.println("Digite os dados do segundo campeao:");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
	    armor = sc.nextInt();
	    System.out.println();
		Champion B = new Champion(name, life, attack, armor);
		
		System.out.print("Quantos turnos voce deseja executar ?");
		int turns = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= turns; i++) {
			if (A.getLife() == 0 || B.getLife() == 0 ) {
				break;
			}
			A.takeDamage(B);
			B.takeDamage(A);
			
			System.out.println("Resultado turno: " + i + ":");
			System.out.println();
			System.out.println(A.status());
			System.out.println(B.status());
			System.out.println();		
		}
		System.out.println("FIM DO COMBATE");
		
		sc.close();

	}

}
