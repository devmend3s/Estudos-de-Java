import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("Digite um numero: ");
		number = input.nextInt();
		
		if(number % 2 == 0) {
			System.out.print("Par");
		}
		else {
			System.out.print("Impar");
		}
		input.close();
		
	}
}