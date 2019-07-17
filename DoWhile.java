import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int liczba;
		
		do {
			System.out.println("Wprowadz liczbe: ");
			liczba= scan.nextInt();
		}
		while (liczba != 5);
		
		System.out.println("jest 5!!");
		scan.close();
	}
}
