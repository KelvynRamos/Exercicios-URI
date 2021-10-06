import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));

		int cachorro = 1;
		int xSalada = 2;
		int xBacon = 3;
		int torrada = 4;
		int refrigerante = 5;

		int codigo = sc.nextInt();
		int qtd = sc.nextInt();

		if (codigo == 1) {
			System.out.printf("Total: R$ %.2f\n", 4.00*qtd);

		} else if (codigo == 2) {
			System.out.printf("Total: R$ %.2f\n", 4.50*qtd);
		} else if (codigo == 3) {
			System.out.printf("Total: R$ %.2f\n", 5.00*qtd);
		} else if (codigo == 4) {
			System.out.printf("Total: R$ %.2f\n", 2.00*qtd);
		}
		else if (codigo == 5) {
			System.out.printf("Total: R$ %.2f\n", 1.50*qtd);
		}
	}
}
