package Vetor;

import java.util.Scanner;

public class VetorQuadrado {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a[], b[];
		
		a = b = new int [10];
		
		for (int i = 0; i < 10; i++) {
			a[i] = in.nextInt();
			b[i] = a[i] * a[i];
			
			if (i == 0) {
				System.out.print("[" + b[i] + ", ");
			} else if (i == 9) {
				System.out.println("]");
			} else {
				System.out.println(b[i] + " ");
			}
		}
		in.close();
	}

}
