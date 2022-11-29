package exerciciosLaco;
import java.util.Scanner;
public class tabuada {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int i=0;
			
		int n,result;
		System.out.println("Digite o valor desejado:");
		n=in.nextInt();
		while (i<=10) {
			result= n*i;
			
			System.out.println(n+"x"+i+"="+result);
			i=i+1;
		}
	}
}
