import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int termo,n1=1,n2=0;

		System.out.println("Digite o termo:");
		termo = ler.nextInt();
		System.out.println("A sequência de fibonacci com o termo desejado é: ");
		System.out.println(n1);
		
		for(int i=1; i<termo; i++){
		    n1=n1+n2;
		    n2=n1-n2;
		    System.out.println(n1);
		    
		}

	}

}


