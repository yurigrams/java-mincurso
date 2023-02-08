import java.util.Scanner;

public class OoeadoresRelacionais {

	public static void main(String[] args) {
		int n1, n2;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero 01");
		n1 = ler.nextInt();
		System.out.println("Digite o numero 02");
		n2 = ler.nextInt();
		
		System.out.println("Igualdade "+ (n1==n2));
		System.out.println("Maior igual "+ (n1>=n2));
		System.out.println("Menor igual "+ (n1<=n2));
		System.out.println("Maior "+ (n1>n2));
		System.out.println("Menor "+ (n1<n2));
		System.out.println("Diferente  "+ (n1!=n2));
		
		//Comparar String
		
		String nome1 = "paulo";
		String nome2 = "Pedro";
		System.out.println("Comparar strings: "+(nome1.equals(nome2)));
		
		
		
		
	}

}
