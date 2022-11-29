package exerciciosLaco;
import java.util.Scanner;
public class altura {

	public static void main(String[] args) {
		double joao=1.34, pedro=1.45, i=1;
		
		while (joao<=pedro) {
			joao=joao+0.025;
			pedro=pedro+0.020;
			
			i++;
		}
		
		System.out.println("Em " +i+ " anos João será mais alto que Pedro");
		
	}

}
