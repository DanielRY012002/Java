package programas;
//Autor: DanielRY
import java.util.Scanner;
public class P002{
	public static void main(String[] args){
		System.out.println("P002");
		System.out.println("Pedir el radio de un circulo y calcular su área");
		System.out.println("===============================================");
		System.out.println("");
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce el radio del circulo: ");
		final double r=Double.valueOf(teclado.nextLine());
		teclado.close();
		final double a=Math.PI*Math.pow(r,2);
		System.out.println("El area de la circunferencia de radio "+r+" es: "+a);
	}
}