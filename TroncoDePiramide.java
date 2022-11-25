package Areas_Geometricas;
import java.util.*;
public class TroncoDePiramide {
public static void main(String[] args) {
	

	Scanner s = new Scanner(System.in);
	
	double Al,At,h,apotema,volumen;
	double PB,Pb,AB,Ab;
	
	System.out.println("Digite la altura  : ");
	h=s.nextDouble();
	
	System.out.println("Digite el apotema :");
	apotema=s.nextDouble();
	
	System.out.println("Digite  PB");
	PB=s.nextDouble();
	
	System.out.println("Digite Pb : ");
	Pb=s.nextDouble();
	
	System.out.println("Digite AB :");
	AB=s.nextDouble();
	System.out.println("Digite Ab :");
	Ab=s.nextDouble();
	
	Al=(PB+Pb/2)*apotema;
	At=Al + AB + Ab;

	volumen=(1/3)*(h)*(AB + Ab + Math.sqrt(AB*Ab));
			
	
       System.out.println("El area trapecio  del tronco es : " + Al);
       System.out.println("El area total del tronco es : " + At);
       System.out.println("El volumen del tronco es : " + volumen);
 
   }
}
