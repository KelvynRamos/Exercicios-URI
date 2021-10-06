import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int numero = sc.nextInt();
	    int contador = 0;
	    
	     for(int i = numero; contador < 6; i++){
	        if(i%2 != 0){
	            System.out.println(i);
	            contador++;
	        }
	     }
	    sc.close();
	}
}
