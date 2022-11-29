package exxerc�ciosDoWhile;
import java.util.Scanner;
public class idade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1,ano,idade,anonasc;
		
		do {
			System.out.println("Digite o ano atual:");
			ano= in.nextInt();
			System.out.println("Digite o ano de nascimento:");
			anonasc = in.nextInt();
			idade = ano-anonasc;
			System.out.println("Sua idade �:" +idade);
		if (idade>=18){
				System.out.println("Voc� �:"+ " Maior de idade");
			}
		else {
			System.out.println("Voc� �:"+" Menor de idade");
			
		}
		

		 
		
		i++;
			
			System.out.println("Deseja continuar a execu��o? digite 1 para sim, 2 para n�o" );
			i= in.nextInt();
		}while(i!=2);
			
	
	

	}

}
