package Areas_Geometricas;
import java.util.Scanner;
public class AreaTroncocCono {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rMe,rMA,g;
		
		System.out.println("Ingrese el radio menor :");
		rMe=s.nextInt();
		
		System.out.println("Ingrese el radio mayor :");
		rMA=s.nextInt();
		
		System.out.println("Ingrese la generatiz :");
		g=s.nextInt();
		System.out.println("El are del tronco de cono es : " + (Math.PI *(g *(rMe + rMA) + (rMe*rMe) + (rMA*rMA))));
	}

}
