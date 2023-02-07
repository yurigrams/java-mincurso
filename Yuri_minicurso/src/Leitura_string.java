import java.util.Scanner;

public class Leitura_string {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String palavra;
		String texto;
		
		//Ler uma palavra
		System.out.println("Digite uma palavra: ");
		palavra = ler.next();
		
		//Ler um texto
		ler.nextLine();
		System.out.println("Digite um texto: ");
		texto = ler.nextLine();
		
		//Mostrar valores lidos
		
		System.out.println("Palavra: "+palavra);
		System.out.println("Texto: "+texto);

	}

}
