import java.util.Scanner;

public class ExemploCondicionalComposto {

	public static void main(String[] args) {
		
		int n;
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite um numero inteiro: ");
		n = ler.nextInt();
				
		//verificar se o numero é negativo, zero ou positivo
				
		if (n<0) {
			System.out.println("Numero é negativo!!");
		}else if(n == 0 ) {
			System.out.println("ZERO!!!");
		}else {
			System.out.println("Numero positivo!!!");
		}

	}

}
