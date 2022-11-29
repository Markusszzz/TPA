package apostilaEX;
import java.util.Scanner;
public class fatorial {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i,fatorial = 1,num;
		
		System.out.println("Digite o numero que deseja saber o fatorial");
		num = in.nextInt();
		
		for(i = 1;i <= num;i++) {
			
				fatorial = fatorial*i;
				
			
			
		}
		System.out.println("O fatorial do numero digitado eh: "+(i-1)+"! = "+fatorial);
		

	}

}
