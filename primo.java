import java.util.Scanner;
public class primo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int primo = 0;
		
		System.out.println("Digite um número:");
		int n = in.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			if (n % i == 0) {
				primo += 1;
			}
		}
		if (primo == 2) {
			System.out.println(n + " é primo.");
		} else {
			System.out.println(n + " não é primo.");
		}
	}

}

