package programas;
//Autor: DanielRY
import java.util.Scanner;
public class P004{
	public static void main(String[] args){
		System.out.println("P004");
		System.out.println("Pedir dos números y deir si son iguales o no.");
		System.out.println("=============================================");
		System.out.println("");
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int n1=Integer.valueOf(teclado.nextLine());
		System.out.print("Introduce otro numero: ");
		int n2=Integer.valueOf(teclado.nextLine());
		teclado.close();
		if(n1==n2){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
	}
}