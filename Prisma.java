package Areas_Geometricas;
import java.util.*;
public class Prisma {

	public static void main(String[] args) {
	
		Scanner e = new Scanner(System.in);
		
		double n1,n2,altura;
		
		System.out.println("Ingrese la longitud :");
		n1=e.nextDouble();
		
		System.out.println("Ingrese el apotema : ");
		n2=e.nextDouble();
		
		System.out.println("Digite la altura : ");
		altura=e.nextDouble();
		; 
		
		System.out.println("El volumen del prisma es : " + ((5 * n1 * n2 * altura)/2));
		
	}

}
