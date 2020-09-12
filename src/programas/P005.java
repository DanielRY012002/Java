package programas;
import java.util.Scanner;
//Autor: DanielRY
public class P005{
	public static void main(String[] args){
		System.out.println("P005");
		System.out.println("Pedir un número e ndicar si es positivo, negativo o neutro");
		System.out.println("==========================================================");
		System.out.println("");
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num=Integer.valueOf(teclado.nextLine());
		teclado.close();
		if(num>0){
			System.out.println("Positivo");
		}else if(num==0){
			System.out.println("Neutro");
		}else{
			System.out.println("Negativo");
		}
	}
}