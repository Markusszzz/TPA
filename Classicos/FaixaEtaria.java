 import java.util.Scanner;
public class FaixaEtaria {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int faixaUm = 0, faixaDois = 0, faixaTres = 0, faixaQuatro = 0, faixaCinco = 0;
		
		for (int i = 1; i <= 15; i++) {
			
			System.out.println("Informe a idade da " + i + "� pessoa:");
			int idade = in.nextInt();
			
			if (idade <= 15) {
				faixaUm += + 1;
			} else if (idade <= 30){
				faixaDois += 1;
			} else if (idade <= 45) {
				faixaTres += 1;
			} else if (idade <= 60) {
				faixaQuatro += 1;
			} else {
				faixaCinco += 1;
			}
		}
		
		System.out.println("1� Faixa Et�ria tem " +faixaUm+ " pessoas que representam: " + (100 * faixaUm / 15) + "%");
		System.out.println("2� Faixa Et�riatem " +faixaDois+ " pessoas que representam: " + (100 * faixaDois / 15) + "%");
		System.out.println("3� Faixa Et�ria tem " +faixaTres+ " pessoas que representam: " + (100 * faixaTres / 15) + "%");
		System.out.println("4� Faixa Et�ria tem " +faixaQuatro+ " pessoas que representam: " + (100 * faixaQuatro / 15) + "%");
		System.out.println("5� Faixa Et�ria tem " +faixaCinco+ " pessoas que representam: " + (100 * faixaCinco / 15) + "%");
	}

}

