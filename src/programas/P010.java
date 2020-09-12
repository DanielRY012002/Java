package programas;
import java.util.Scanner;
//Autor: DanielRY
public class P010{
	public static void main(String[] args){
		System.out.println("P010");
		System.out.println("pedir tres números y mostrarlos ordenados de mayor a menor");
		System.out.println("==========================================================");
		System.out.println("");
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca primer número: ");
		int a=Integer.valueOf(teclado.nextLine());
		System.out.print("Introduzca segundo número: ");
		int b=Integer.valueOf(teclado.nextLine());
		System.out.print("Introduzca tercer número: ");
		int c=Integer.valueOf(teclado.nextLine());
		teclado.close();
		int mayor=Math.max(Math.max(a,b),Math.max(b,c));
		int menor=Math.min(Math.min(a,b),Math.min(b,c));
		int medio;
		if(a>=menor&&a<=mayor){
			medio=a;
		}else if(b>=menor&&b<=mayor){
			medio=b;
		}else{
			medio=c;
		}
		System.out.println(menor+" - "+medio+" - "+mayor);
	}
}