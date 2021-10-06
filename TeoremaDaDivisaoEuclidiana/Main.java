import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int primeiroNumero = sc.nextInt();
		 int segundoNumero = sc.nextInt();
		 int resto = primeiroNumero % segundoNumero;
		 int quociente = primeiroNumero / segundoNumero;
		 if(resto < 0){
		     resto += Math.abs(segundoNumero);
		     quociente = (primeiroNumero - resto) / segundoNumero;
		 }

        System.out.print(quociente + " " + resto);
        
         sc.close();
	}
}
