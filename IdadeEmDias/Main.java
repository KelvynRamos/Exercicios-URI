import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
       
      int dias = sc.nextInt();
      
      int anos = dias / 365;
      dias = dias - (anos * 365);
      int mes = dias / 30;
      dias = dias - (mes * 30);
       
       System.out.println(anos + " ano(s)\n" 
                        + mes + " mes(es)\n"
                        + dias + " dia(s)");
       
       
       sc.close();
	}
}
