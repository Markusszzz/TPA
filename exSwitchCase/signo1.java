package exerciciosSwitchCase;
import java.util.Scanner;
public class signo1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dia ,mes;
		
		System.out.println("digite o mes de seu aniversario");
		mes= in.nextInt();
		System.out.println("Digite o dia do seu aniversario");
		dia= in.nextInt();
		switch(mes) {
		case 1:
			if(dia>=1 && dia<=20) {
			  System.out.println("Capricornio");
			  if (dia>=21 && dia<=31)
					System.out.println("Leão");
			  break;
			}
		case 2:
			if(dia>=1 && dia<=19) {
			  System.out.println("Aquario");
			  if (dia>=20 && dia<=28)
					System.out.println("Leão");
			  break;
			}
		case 3:
			if(dia>=1 && dia<=20) {
			  System.out.println("Peixes");
			if (dia>=21 && dia <=31)
				System.out.println("Aries");
			}
			break;
		case 4:
			if(dia>=1 && dia<=20) {
			  System.out.println("Aries");
			if (dia>=21 && dia<=20)
				System.out.println("Touro");
			}
			break;
		case 5:
			if(dia>=1 && dia<=21) {
			  System.out.println("Touro");
			  if (dia>=22 && dia<=31)
					System.out.println("Gemeos");
			}
		case 6:
			if(dia>=1 && dia<=20) {
			  System.out.println("Gemeos");
			  if (dia>=21&& dia<=30)
					System.out.println("Cancer");
			}
			break;
		case 7:
			if(dia<=1 && dia<=21) {
			  System.out.println("Cancer");
			  if (dia>=22 && dia<=31)
					System.out.println("Leão");
			  break;
		   }	
		case 8:
			if(dia>=1 && dia<=22) {
			  System.out.println("Leão");
			  if (dia>=23 && dia<=31)
					System.out.println("Virgem");
			  break;
			
			}
			case 9:
				if(dia>=1 && dia<=22) {
				  System.out.println("Virgem");
				  if (dia>=23 && dia<=31)
						System.out.println("Libra");
				  break;
				  
		
				}
				case 10:
					if(dia>=1 && dia<=21) {
					  System.out.println("Leão");
					  if (dia>=22 && dia<=31)
							System.out.println("Virgem");
					  break;
					}
				case 11:
					if(dia>=1 && dia<=21) {
					  System.out.println("Escorpião");
					  if (dia>=22 && dia<=30)
							System.out.println("Sagitario");
					  break;
					}
				case 12:
					if(dia>=1 && dia<=21) {
					  System.out.println("Sagitario");
					  if (dia>=22 && dia<=31)
							System.out.println("Capricornio");
					  break;
					}
		}
	}
}
