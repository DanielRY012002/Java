package programas;
//Autor: DanielRY
import java.util.Scanner;
public class P001{
	public static void main(String[] args){
		System.out.println("P001");
		System.out.println("Pedir los coeficientes de una ecuacion de 2do grado, y muestre ");
		System.out.println("sus soluciones reales. Si no existen, debe indicarlo.");
		System.out.println("===============================================================");
		System.out.println("");
		Scanner teclado=new Scanner(System.in);
		final double x1,x2;
		System.out.print("Introduzca primer coeficiente: ");
		final double a=Double.valueOf(teclado.nextLine());
		System.out.print("Introduzca segundo coeficiente: ");
		final double b=Double.valueOf(teclado.nextLine());
		System.out.print("Introduzca tercer coeficiente ");
		final double c=Double.valueOf(teclado.nextLine());
		teclado.close();
		final double d=Math.pow(b,2)-4*a*c;
		if(d<0) {
			System.out.println("No existen solucion en lo numero reales");
		}else if(d==0){
			x1=(-b+Math.sqrt(d))/(2*a);
			System.out.println("Solucion: "+x1);
		}else{
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Solucion: "+x1);
			System.out.println("Solucion: "+x2);
		}
	}
}