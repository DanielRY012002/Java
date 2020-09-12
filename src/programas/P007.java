package programas;
import java.util.Scanner;
//Autor: DanieRY
public class P007{
	public static void main(String[] args){
		System.out.println("P007");
		System.out.println("Pedir dos números y decir cual es el mayor");
		System.out.println("==========================================");
		System.out.println("");
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int n1=Integer.valueOf(teclado.nextLine());
		System.out.print("Intoduce otro número: ");
		int n2=Integer.valueOf(teclado.nextLine());
		teclado.close();
		System.out.println("El número mayor es: "+Math.max(n1,n2));
	}
}