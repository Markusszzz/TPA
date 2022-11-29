package exerc�ciosFOR;
import java.util.Scanner;
public class NovoEvelho {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int i, anoNasc, ano, idade;
		
		for(i=1; i<=10; i++){
			
			System.out.println("Digite o ano atual:");
			ano= in.nextInt();
			System.out.println("Digite o ano de nascimento:");
			anonAsc = in.nextInt();
			idade = ano-anoNasc;
			System.out.println("Sua idade é:" +idade);
			
			if(idade=>idade) {
				System.out.println("O mais velho é aquele que tem"+idade " anos");
			}else {
				System.out.println("O mais novo tem" +idade " anos");
			}
		}

	}

}
