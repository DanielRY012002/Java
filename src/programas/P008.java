package programas;
import java.util.Scanner;
//Autor: DanielRY
public class P008{
	public static void main(String[] args){
		System.out.println("P008");
		System.out.println("Pedir dos números y decir cual es el mayor o si son iguales");
		System.out.println("===========================================================");
		System.out.println("");
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce u número: ");
		int n1=Integer.valueOf(teclado.nextLine());
		System.out.print("Introduce otro número: ");
		int n2=Integer.valueOf(teclado.nextLine());
		teclado.close();
		if(n1==n2){
			System.out.println("Son iguales");
		}else{
			System.out.println("El numero mayor es "+Math.max(n1,n2));
		}
	}
}