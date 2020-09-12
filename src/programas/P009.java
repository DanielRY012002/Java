package programas;
import java.util.Scanner;
//Autor: DanielRY
public class P009{
	public static void main(String[] args){
		System.out.println("P009");
		System.out.println("Pedir dos números y mostrarlos ordenados de mayor a menor.");
		System.out.println("==========================================================");
		System.out.println("");
		Scanner teclado=new Scanner(System.in);
		System.out.print("Intoduce un número: ");
		int n1=Integer.valueOf(teclado.nextLine());
		System.out.print("Intoduce otro número: ");
		int n2=Integer.valueOf(teclado.nextLine());
		teclado.close();
		System.out.println(Math.max(n1,n2)+" y "+Math.min(n1,n2));
	}

}
