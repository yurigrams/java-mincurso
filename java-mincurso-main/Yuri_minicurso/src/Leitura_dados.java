import java.util.Scanner;

public class Leitura_dados {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int inteiro;
		double duplo;
		short idade;
		float salario;
		long numero;
		
		// int 
		System.out.println("Digite um numero inteiro: ");
		inteiro = ler.nextInt(); 
		
		//long
		System.out.println("Digite um numero inteiro: ");
		numero = ler.nextLong();
		
		//float
		System.out.println("Digite um salario: ");
		salario = ler.nextFloat();
		
		// short
		System.out.println("Digite um numero idade: ");
		idade = ler.nextShort();
		
		// double
		System.out.println("Digite um numero Real: ");
		duplo = ler.nextDouble();
		
		//Show
		System.out.println("Valor lido: "+inteiro);
		
		
		System.out.println("Valor lido: "+duplo);
		
		
		System.out.println("Valor lido: "+idade);
		
		
		System.out.println("Valor lido: "+salario);
		
		
		System.out.println("Valor lido: "+numero);		
	}

}
