import java.util.Scanner;
public class idadeEaltura {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int anoAtual,idade,anoNasc,i = 1,idadeV,idadeN,a;
		double media = 0,somaaltura = 0,alt;
		
		System.out.println("digite o ano atual");
		anoAtual = ler.nextInt();
			
	System.out.println("digite o ano de nascimento do "+ i + "� usuario");
		anoNasc =	ler.nextInt();
		
		idade = (anoAtual-anoNasc);
		idadeV = idade;
		idadeN = idade;
	
		for(i = 2;i<= 10;i++) {
			System.out.println("digite o ano de nascimento do "+ i + "� usuario");
			anoNasc =	ler.nextInt();
			idade = (anoAtual-anoNasc);
			if(idade < idadeN) {
				idadeN = idade;
			}else if(idade > idadeV) {
				idadeV = idade;
			}
			
			}
		for(a = 1; a<=10; a++) {
			System.out.println("Digite a altura do "+ a + "� usuario");
			alt= ler.nextDouble();
			somaaltura = (somaaltura+alt);
			media = somaaltura/a;
			
			
			
		}
		System.out.println(" o mais novo tem : "+ idadeN + " anos" );
		System.out.println("o mais velho tem : "+idadeV +" anos");
		System.out.printf("A m�dia de altura �: %2f%" +media);
		
		ler.close();
		}

	






	}




