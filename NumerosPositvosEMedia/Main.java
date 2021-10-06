import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    double numero = 0.0;
	    double soma = 0.0;
	    int contador = 0;
	    
	     for(int i = 0; i < 6; i++){
	         numero = sc.nextDouble();
	         
	        if(numero > 0){
	            soma += numero;
	            contador++;
	        }
	     }
	     System.out.println(contador + " valores positivos");
	     System.out.printf("%.1f", soma / contador);
	    sc.close();
	}
}
