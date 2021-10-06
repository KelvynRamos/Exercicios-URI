import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
       
       int segundos = sc.nextInt();
       
       int horas = segundos / 3600;
       segundos = segundos - (horas * 3600);
       int minutos = segundos / 60;
       segundos = segundos - (minutos * 60);
       
       System.out.println(horas+":"+minutos+":"+segundos);
       
       
       sc.close();
	}
}
