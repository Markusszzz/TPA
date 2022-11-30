import java.util.Scanner;
public class ProdutoELucro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System. in);
		int i=1;
		double produto,preçoV,lucroM;
		
		
		do {
			System.out.println("Digite o preço do produto: ");
			produto= in.nextDouble();
			System.out.println("digite a margem de lucro: ");
			lucroM= in.nextInt();
			lucroM = (lucroM/produto)*100;
			System.out.println("a margem de lucro e : "+lucroM+ " % ");
			preçoV = lucroM + produto;
			System.out.println(" o preço do produto e: "+preçoV);
		
			
		i++;
		
			
			System.out.println("Deseja continuar a execu��o? digite 1 para sim, 2 para n�o" );
			i= in.nextInt();
		}while(i!=2);
	}

}
