import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));

		
		int positivo = 0;
		int negativo = 0;
		int impar = 0;
		int par = 0;

		for (int i = 0; i < 5; i++) {
		
			int valor = sc.nextInt();
			
			if (valor % 2 == 0) {
				par++;
			}
			else if (valor % 2 != 0) {
				impar++;
			}
			if (valor > 0) {
				positivo++;
			}
			else if (valor < 0) {
				negativo++;
			}
		}

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");	

		sc.close();
	}
}
