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
			System.out.println("Entre com o "+(i+1)+".o pre?o:");
			a[i]= in.nextDouble();
			
		
		}
		  for(i=0; i<TAM; i++) {
              if(i==0) {
                  System.out.print("PRE?OS = ["+a[i]+" ");
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
		 System.out.println("O pre?o mais caro ?: " +precoM);
		 System.out.println("A m?dia dos pre?os ?: "+mediaP);
		 System.out.println("A soma dos pre?os ? : "  +somaP);
		 if(somaP<=saldo) {
			 System.out.println("ir? conseguir comprar");
		 }else {
			 System.out.println(" n?o ir? conseguir comprar");
		 }
		 
			
			
		
		
	}

}
