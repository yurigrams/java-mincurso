import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		int num;
		int soma;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		num = ler.nextInt();
		
		
		//condicional simples
		if(num > 10) {
			System.out.println("Numero é maior que 10 ");
			soma = num+2;
			System.out.println("Soma "+soma);
		}// fim do if
		
		  System.out.println("Continua programa!!! ");
		  
		  

	}

}
