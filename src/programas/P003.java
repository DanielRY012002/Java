package programas;
//Autor: DanielRY
import java.util.Scanner;
public class P003{
	public static void main(String[] args){
		System.out.println("P003");
		System.out.println("Pedir el radio de una circunferencia y calcular su longitud");
		System.out.println("===========================================================");
		System.out.println("");
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce el radio de la circunferencia: ");
		double r=Double.valueOf(teclado.nextLine());
		teclado.close();
		double l=2*Math.PI*r;
		System.out.println("Longitud de la circunferencia de radio "+r+" es: "+l);
	}
}