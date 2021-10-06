import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	    
	    double a = sc.nextDouble();
	    double b = sc.nextDouble();
	    double c = sc.nextDouble();
	    
	    if(a+b <= c || b+c <= a || c+a <= b){
	        System.out.println("NAO FORMA TRIANGULO");
	    }
	    else{
    	        if((a*a)+(b*b) == (c*c) || (c*c)+(b*b) == (a*a) || (c*c)+(a*a) == (b*b)){
    	        System.out.println("TRIANGULO RETANGULO");
    	        }
	        
    	        if((a*a)+(b*b) < (c*c) || (c*c)+(b*b) < (a*a) || (c*c)+(a*a) < (b*b)){
    	        System.out.println("TRIANGULO OBTUSANGULO");
    	        }
    	    
        	    if((a*a)+(b*b) > (c*c) && (c*c)+(b*b) > (a*a) && (c*c)+(a*a) > (b*b)){
        	        System.out.println("TRIANGULO ACUTANGULO");
        	    }
        	    
        	    if(a == b && b == c){
        	        System.out.println("TRIANGULO EQUILATERO");
        	    }
        	    
        	    if((a == b || b == c || c == a) && (a != b || b != c || c != a)){
        	        System.out.println("TRIANGULO ISOSCELES");
	            }
	    }
	   
	   sc.close();
	}
}
