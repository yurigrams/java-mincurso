
public class OperadoresLogicos {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		if (a<=10 || b<=10) {
			System.out.println("o numero a ou b é menor que 10");
		}
		if (a<=10 && b<=10) {
			System.out.println("o numero a ou b é menor que 10");
		}
		if (!(a<=10 || b<=20)) {
			System.out.println("o numero a ou b é menor que 10");
		}
	}

}
