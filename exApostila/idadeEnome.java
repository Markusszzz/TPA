package apostilaEX;

import java.util.Scanner;

public class idadeEnome {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		int anoAtual,idade,anoNasc,i = 1,idadeV,idadeN;
		String nome,nomeN,nomeV;
		
		System.out.println("digite o ano atual");
		anoAtual = ler.nextInt();
	
			
		System.out.println("digite o ano de nascimento do "+ i + "° usuario");
		anoNasc =	ler.nextInt();
		System.out.println("digite o nome do "+i+ "° usuario");
		nome=ler.next();
			
		idade = (anoAtual-anoNasc);
		idadeV = idade;
		idadeN = idade;
		nomeV=nome;
		nomeN=nome;
	
		for(i = 2;i<= 3;i++) {
			System.out.println("digite o ano de nascimento do "+ i + "° usuario");
			anoNasc =	ler.nextInt();
			System.out.println("digite o nome do "+i+ "° usuario");
			nome = ler.next();
			idade = (anoAtual-anoNasc);
			if(idade < idadeN) {
				idadeN = idade;
				nomeN = nome;
			}else if(idade > idadeV) {
				idadeV = idade;
				nomeV = nome;
				
				
		}
		}
		System.out.println("O nome do mais novo(a) é " +nomeN+ " e ele(a) tem " +idadeN+ " anos" );
		System.out.println("O nome do mais velho(a) é " +nomeV+ " e ele(a) tem " +idadeV+ " anos");
		ler.close();
		}

	







}

	

