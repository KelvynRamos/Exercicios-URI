import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
	    double a = sc.nextDouble();
	    double b = sc.nextDouble();
	    double c = sc.nextDouble();
	    
	    if (a + b > c && a + c > b && b + c > a){
	       System.out.printf("Perimetro = %.1f\n", a+b+c);
	    }
	    else{
	        System.out.printf("Area = %.1f\n", ((a+b)/2)*c);
	    }
	    
		sc.close();
	}
}
