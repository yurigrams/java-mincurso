import java.util.Scanner;

public class ExercicioIFelse {

	public static void main(String[] args) {
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual sua idade? ");
		idade = ler.nextInt();
		
		if (idade>=18) {
			System.out.println(idade+" Maior de idade");
			System.out.println("Tchau!!");
		}else {
			System.out.println(idade+" Menor de idade ");
		}
		

	}

}
