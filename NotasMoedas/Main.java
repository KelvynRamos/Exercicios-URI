import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
       
       String entrada = sc.nextLine();
       String valor[] = entrada.split("[.]");
       int moeda100 = Integer.parseInt(valor[0]);
       int moeda001 = Integer.parseInt(valor[1]);
       
       int nota100 = moeda100 / 100;
       moeda100 = moeda100 - (nota100 * 100);
       
        int nota50 = moeda100 / 50;
       moeda100 = moeda100 - (nota50 * 50);
       
        int nota20 = moeda100 / 20;
       moeda100 = moeda100 - (nota20 * 20);
       
        int nota10 = moeda100 / 10;
       moeda100 = moeda100 - (nota10 * 10);
       
        int nota5 = moeda100 / 5;
       moeda100 = moeda100 - (nota5 * 5);
       
        int nota2 = moeda100 / 2;
       moeda100 = moeda100 - (nota2 * 2);

       int moeda050 = moeda001 / 50;
       moeda001 = moeda001 - (moeda050 * 50);
       
       int moeda025 = moeda001 / 25;
       moeda001 = moeda001 - (moeda025 * 25);
       
       int moeda010 = moeda001 / 10;
       moeda001 = moeda001 - (moeda010 * 10);
       
       int moeda005 = moeda001 / 5;
       moeda001 = moeda001 - (moeda005 * 5);
       System.out.print("NOTAS:\n"
        + nota100 + " nota(s) de R$ 100.00\n"
        + nota50 + " nota(s) de R$ 50.00\n"
        + nota20 + " nota(s) de R$ 20.00\n"
        + nota10 + " nota(s) de R$ 10.00\n"
        + nota5 + " nota(s) de R$ 5.00\n"
        + nota2 + " nota(s) de R$ 2.00\n"
        + "MOEDAS:\n"
        + moeda100 + " moeda(s) de R$ 1.00\n"
        + moeda050 + " moeda(s) de R$ 0.50\n"
        + moeda025 + " moeda(s) de R$ 0.25\n"
        + moeda010 + " moeda(s) de R$ 0.10\n"
        + moeda005 + " moeda(s) de R$ 0.05\n"
        + moeda001 + " moeda(s) de R$ 0.01\n");
       
       sc.close();
	}
}
