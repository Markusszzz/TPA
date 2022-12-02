package exercicios;

import java.util.Scanner;
public class escolaFutebol1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int idade;
		
		System.out.println("digite a idade da crian�a");
		
		idade=in.nextInt();
		switch(idade) {
		
		case 6:
			System.out.println("Dente de leite");
			break;
			
		
		
			case 7:
				System.out.println("J�nior");
				break;
				
			case 8:
				System.out.println("J�nior max");
				break;
			
			case 9:
				System.out.println("J�nior master");
				break;
			
			case 10:
				System.out.println("Master");
				break;
				
				default:
					System.out.println("Idade Inv�lida");
		}
			
			
	
	
	
		
		
		
		

	}

}
		