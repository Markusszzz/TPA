package apostilaEX;
import java.util.Scanner;
public class INSS {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i;
		double salario,desc;
		
		for(i=1;i<=4;i++) {
			System.out.println("digite o salario ");
			salario=ler.nextDouble();
			if(salario<2000) {
				desc= salario/100*8.5;
				System.out.println("o desconto do inss: "+desc);
			}
			else {
				desc =salario/100*11;
				System.out.println("o desconto do inss: "+desc);
			}
		}
	}

}
