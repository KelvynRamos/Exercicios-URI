import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));

		double salario = sc.nextDouble();
		double reajuste = 0;
		
		if (salario >= 0.00 && salario <= 400.00) {
			reajuste = 0.15;
		} else if (salario >= 400.01 && salario <= 800.00) {
			reajuste = 0.12;
		} else if (salario >= 800.01 && salario <= 1200.00) {
			reajuste = 0.10;
		} else if (salario >= 1200.01 && salario <= 2000.00) {
			reajuste = 0.07;
		} else if (salario > 2000.00) {
			reajuste = 0.04;
		}
		int percentual = (int) (reajuste * 100);
		System.out.printf("Novo salario: %.2f\n", salario + (salario * reajuste));
		System.out.printf("Reajuste ganho: %.2f\n", salario * reajuste);
		System.out.println("Em percentual: " + percentual + " %");

		sc.close();
	}
}
