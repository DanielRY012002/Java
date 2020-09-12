package programas;
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=2;
		double decimal=5.85;
		double exponente=3;
		int base=5;
		double raiz=Math.sqrt(numero);
		int redondeo=Math.round((float)decimal);
		int potencia=(int)Math.pow(base,exponente);
		int maximoentero=(int)Math.floor(decimal);
		int ceil=(int)Math.ceil(decimal);
		double minimo=Math.min(decimal,3);
		double maximo=Math.max(decimal,2);
		double radianes=Math.toRadians(45);
		double grados=Math.toDegrees(radianes);
		double csc=1/Math.sin(Math.toRadians(30));
		System.out.println(raiz);
		System.out.println(redondeo);
		System.out.println(potencia);
		System.out.println(maximoentero);
		System.out.println(minimo);
		System.out.println(maximo);
		System.out.println(ceil);
		System.out.println(radianes);
		System.out.println(grados);
		System.out.println(csc);
		
	}
}