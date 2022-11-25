package Areas_Geometricas;
import java.util.*;
public class Cilindro {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		double r,h,atotal,tvolumen;
		
		System.out.println("Ingrese el radio del cilindro :");
		r=sc.nextDouble();
		
		System.out.println("Ingrese la altura del cllidro : ");
		h=sc.nextDouble();
		
		atotal=(2)*(3.1416)*(r)*(h+r);
		tvolumen= (3.1416)*(r*r)*(h);
		
		System.out.println("El area del cilindro es : " +String.format("%.2f",atotal ));
		System.out.println("El volumen del cilindro es :  : "+String.format("%.2f",tvolumen));
		
	
	}

}
