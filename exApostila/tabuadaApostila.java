package apostilaEX;
import java.util.Scanner;
public class tabuadaApostila {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num,resultado,i;
		
		System.out.println("Digite o número que deseja saber a tabuada:");
		num = ler.nextInt();
		for(i=0;i<=10;i++) {
			
			resultado = i * num;
			
			System.out.println(num + "x" +i+ "= " +resultado);
					
			
		}
	}
}
