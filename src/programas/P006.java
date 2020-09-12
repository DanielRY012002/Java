package programas;
import java.util.Scanner;
//Autor: DanielRY
public class P006{
	public static void main(String[] args){
		System.out.println("P006");
		System.out.println("Pedir dos números y deir si uno es múltiplo del otro");
		System.out.println("====================================================");
		System.out.println("");
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int n1=Integer.valueOf(teclado.nextLine());
		System.out.print("introduce otro número: ");
		int n2=Integer.valueOf(teclado.nextLine());
		teclado.close();
		if(n1%n2==0){
			System.out.println("El número "+n1+" es multiplo de "+n2);
		}else{
			System.out.println("El número "+n1+" no es multiplo de "+n2);
		}
	}
}