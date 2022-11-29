import java.util.Scanner;
public class maiorEmenorVetor {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
			int i, a[], b[],maior = 0,menor = 0;
		
			final int TAM = 10;
			a = new int [TAM];
			for(i=0; i<TAM; i++) {
				System.out.println("digite o " +(i+1)+ ".o elemento do vetor");
				a[i]= in.nextInt();
				menor = a[i];
				maior = a[i];
			}
			if(i==TAM) {
				for(i=0; i<TAM; i++) {
					if(a[i]<menor) {
						menor = a[i];
					
				}else if(a[i]>maior) {
					maior = a[i];
					
				}
			}
				for(i=0; i<TAM; i++) {
					if (i==0) {
						System.out.print("VETOR = ["+a[i]+" ");

					}else if (i==(TAM-1)) {
						System.out.println(a[i]+"]");
					}else {
						System.out.print(a[i]+" ");
					}
				}
				System.out.println();
				System.out.println("o maior numero do vetor eh: "+maior);
				System.out.println("o menor numero do vetor eh: "+menor);
			}
	}
	
}
			
			
		
			
					
	

	

