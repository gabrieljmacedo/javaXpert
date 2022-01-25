package jokenpo;

import java.util.Scanner;
import java.util.Random;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int valorUsuario, valorAleatorioPc;
		
		System.out.println("----------------------------");
		System.out.println("J O K E N P O");
		System.out.println("----------------------------");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("----------------------------");
		
		/* Caso usu�rio ganhe soma, caso perca subtrai
		 * U1 C2 Computador ganha = -1
		 * U1 C3 Usu�rio ganha = 4
		 * U2 C1 Usu�rio ganha = 3
		 * U2 C3 Computador ganha = 1
		 * U3 C1 Computador ganha 2
		 * U3 C2 Usu�rio ganha 5
		*/
		
		System.out.println("Jogador, escolha sua op��o: ");
		valorUsuario = sc.nextInt();
		
		if (valorUsuario >= 4){
			System.out.println("Digite um n�mero v�lido entre as op��es apresentadas!");
		} else {
				
		//Escolha do computador
		valorAleatorioPc = random.nextInt(3) + 1; //Gerando um n�mero em 1 e 3
							
		//Resultado das escolhas do computador	
		switch(valorAleatorioPc) {
		case 1:
			System.out.println("Computador escolheu pedra!");
			break;
		case 2:
			System.out.println("Computador escolheu papel!");
			break;
		case 3:
			System.out.println("Computador escolheu tesoura!");
		}
		
		//Resultado das escolhas do usu�rio
		switch(valorUsuario) {
		case 1:
			System.out.println("Voc� escolheu pedra!");
			break;
		case 2:
			System.out.println("Voc� escolheu papel!");
			break;
		case 3:
			System.out.println("Voc� escolheu tesoura!");
			break;
		}
		
		//Regra do resultado das escolhas do usu�rio
		 if (valorUsuario == valorAleatorioPc) {
		 	System.out.println("Empate!");
		} else if (((valorUsuario + valorAleatorioPc) == 3 || (valorUsuario + valorAleatorioPc == 4) || (valorUsuario + valorAleatorioPc == 5))) {
			System.out.println("Voc� ganhou esta!");
		} else {
			System.out.println("Computador foi o vencedor!");
		} 
		
		sc.close();
		}
	}
}