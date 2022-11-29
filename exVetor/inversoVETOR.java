import java.util.Scanner;
public class inversoVETOR {
	
	

		public static void main(String[] args) {
			final int TAM = 10;
			int i,p, a[], b[];
			Scanner in = new Scanner(System.in);
			
			a= new int[TAM];
			b= new int[TAM];
			p = 9;
			
			for(i=0; i<TAM; i++) {
				System.out.println("digite o " +(i+1)+ ".o elemento do vetor");
				a[i]= in.nextInt();
				b[p]= a[i];
				p--;
			}
			System.out.print("\nVetor A [ ");
			
			for(i=0; i<TAM; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.print(" ] ");
			
			System.out.print("\nVetor B [ ");
			for(i=0; i<TAM; i++) {
				System.out.print(b[i]+" ");
			}
			System.out.print(" ] ");
			
		}

	}


