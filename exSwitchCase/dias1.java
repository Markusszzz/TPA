package exercicios;

import java.util.Scanner;

public class dias1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int mes;
		
		System.out.println("Digite o Mes:");
		
		mes=in.nextInt();
		switch(mes) {
		
		case 1:
			System.out.println("Janeiro tem 31 dias");
			break;
			
			
		case 2:
			System.out.println("Fevereiro tem 28 dias");
			break;
			
			
		case 3:
			System.out.println("Março tem 31 dias");
			break;
			
		case 4:
			System.out.println("Abril tem 30 dias");
			break;
			
		case 5:
			System.out.println("Maio tem 31 dias");
			break;
			
			
		case 6:
			System.out.println("Junho tem 30 dias");
			break;
			
		case 7:
			System.out.println("Julho tem 31 dias");
			break;
			
		case 8:
			System.out.println("Agosto tem 31 dias");
			break;
			
		case 9:
			System.out.println("Setembro tem 30 dias");
			break;
			
		case 10:
			System.out.println("Outubro tem 31 dias");
			break;
			
		case 11:
			System.out.println("Novembro tem 30 dias");
			break;
			
		case 12:
			System.out.println("Dezembro tem 31 dias");
			break;
			
		default:
			System.out.println("Mes Invalido");


		}

	}
}