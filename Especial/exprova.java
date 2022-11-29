package prova;
import java.util.Scanner;
public class exprova {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 5;
		int i;
		double precoM = 0,mediaP = 0,somaP = 0,a[],saldo=150;
		
		a= new double[TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+".o preço:");
			a[i]= in.nextDouble();
			
		
		}
		  for(i=0; i<TAM; i++) {
              if(i==0) {
                  System.out.print("PREÇOS = ["+a[i]+" ");
              }else if (i==(TAM-1)) {
                  System.out.println(a[i]+"]");
              }else {
                  System.out.print(a[i]+" ");
          }
      }
		  for(i=0; i<TAM; i++) {
				 somaP = somaP+a[i];
				
				 mediaP= somaP/TAM;
				
				 if(a[i]>precoM) {
					 precoM = a[i];
				 }
		
		 }
		 System.out.println();
		 System.out.println("O preço mais caro é: " +precoM);
		 System.out.println("A média dos preços é: "+mediaP);
		 System.out.println("A soma dos preços é : "  +somaP);
		 if(somaP<=saldo) {
			 System.out.println("irá conseguir comprar");
		 }else {
			 System.out.println(" não irá conseguir comprar");
		 }
		 
			
			
		
		
	}

}
