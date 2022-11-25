package Areas_Geometricas;
import java.util.*;
public class Switch_CuerposGeometricos {
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	int op=0;
	
	
	
	System.out.println("Eliga un caso usuario :");
	System.out.println("1.Area tronco del cono");
	System.out.println("2.Cono");
	System.out.println("3.Casquete esferico");
	System.out.println("4.Octaedro");
	System.out.println("5.Huso esferico");
	System.out.println("6.prisma");
	System.out.println("7.Tetaedro");
	System.out.println("8.Piramide");
	System.out.println("9.Tronco de piramede");
	System.out.println("10.Zona esferica");
	System.out.println("11.Icosaedro");
	System.out.println("12.Esfera");
	System.out.println("13.Hexaedro");
	System.out.println("14.Docaedro");
	System.out.println("15.Cilindro");
	System.out.println("16.Salir del programa");
	op=sc.nextInt();
	switch(op) {
	case 1:
    int rMe,rMA,g;
		
		System.out.println("Ingrese el radio menor :");
		rMe=sc.nextInt();
		
		System.out.println("Ingrese el radio mayor :");
		rMA=sc.nextInt();
		
		System.out.println("Ingrese la generatiz :");
		g=sc.nextInt();
		System.out.println("El are del tronco de cono es : " + (Math.PI *(g *(rMe + rMA) + (rMe*rMe) + (rMA*rMA))));
		break;
		
	case 2:
		int r;
		double areaTotal, Volumen, h, areaLateral, a, g1;
		
		
		h=10;
		r=4;
		g1= Math.sqrt(Math.pow(h,2)+Math.pow(r,2));
		a=Math.PI*r;
		areaLateral= a*g1;

		areaTotal= a*(g1+r);
		
		Volumen = Math.PI*(Math.pow(r,2))*h/3;
		
		
		System.out.println("1.Datos del Cono:");
		System.out.println("2.Radio: "+r);
		System.out.println("3.Altura: "+h);
		System.out.println("4.Generatriz: "+g1);
		System.out.println("5.Area Lateral: "+areaLateral);
		System.out.println("6.Area Total: "+areaTotal);
		System.out.println("7.Volumen: "+Volumen);
		break;
	
	case 3:
		double Area, Volumen2, r2, R, h2;
		
		R=2;
		r=17;
		h=5;
		Area= 2*Math.PI*(R*h);
		Volumen = Math.PI*Math.pow(h,2)*((3*R)-h)/3;

		System.out.println("1.Datos de la Casquete Esferico:");
		System.out.println("2.Radio: "+r);
		System.out.println("3.Radio Mayor: "+R);
		System.out.println("4.Altura: "+h);
		System.out.println("5.Area Total: "+String.format("%.2f",Area));
		System.out.println("6.Volumen: "+ String.format("%.2f",Volumen));
		break;
	
	case 4:
   double A, Volume, arista;
		
		arista=11;
		Area= 2*Math.pow(arista,2)*Math.sqrt(3);
		Volumen = Math.pow(arista,3)*Math.sqrt(2)/3;
		
		System.out.println("1.Datos de la Octaedro:");
		System.out.println("2.Area Total: "+ String.format("%.2f", Area));
		System.out.println("3.Volumen: "+ String.format("%.2f", Volumen));

   
		break;
	
	case 5:
    double Area1, volumen, r1, n;
		
		r1=8;
		n=45;
		Area1= (Math.PI*Math.pow(r1,2)*n)/90;
		volumen = (Math.PI*Math.pow(r1,3)*n)/270;

		System.out.println("1.Datos de la Esfera:");
		System.out.println("2.Radio: "+r1);
		System.out.println("3.Area Total: "+Area1);
		System.out.println("4.Volumen: "+volumen);
		break;
	
		
	case 6:
	double n1,n2,altura;
		
		System.out.println("Ingrese la longitud :");
		n1=sc.nextDouble();
		
		System.out.println("Ingrese el apotema : ");
		n2=sc.nextDouble();
		
		System.out.println("Digite la altura : ");
		altura=sc.nextDouble();
		; 
		
		System.out.println("El volumen del prisma es : " + ((5 * n1 * n2 * altura)/2));
		break;
	
	case 7:
    double area, volume1, Arista, H;
		
		arista=20;
		H=arista*Math.sqrt(6)/3;
		Area= Math.pow(arista,2)*Math.sqrt(3);
		Volumen = Math.pow(arista,3)*Math.sqrt(2)/12;
		
		System.out.println("1.Datos de la Tetraedro:");
		System.out.println("2.Altura: "+H);
		System.out.println("3.Area Total: "+Area);
		System.out.println("4.Volumen: "+Volumen);
		break;
	
	case 8:
		break;
	
	case 9:
		break;
	
	case 10:
		break;
	
	case 11:
		break;
	case 12:
		r1=5;
		double Area5= 4*Math.PI*(Math.pow(r1,2));
		volumen = (Math.PI*Math.pow(r1,3))*4/3;

		System.out.println("1.Datos de la Esfera:");
		System.out.println("2.Radio: "+r1);
		System.out.println("3.Area Total: "+Area5);
		System.out.println("4.Volumen: "+volumen);
		break;
	
	case 13:
		int arista1=15;
		double D=arista1*Math.sqrt(3);
		Area5= 6*Math.pow(arista1,2);
		volumen = Math.pow(arista1,3);
		
		System.out.println("1.Datos de la Hexaedro:");
		System.out.println("2.Diametro: "+D);
		System.out.println("3.Area Total: "+Area5);
		System.out.println("4.Volumen: "+volumen);
		break;
	
	case 14:
		int Arista2;
		System.out.println("Digite la arista :");
		arista=sc.nextInt();
		double Ar= 3*Math.pow(arista,2)*Math.sqrt(25+10*Math.sqrt(5));
		volumen = (15+7*(Math.sqrt(5)))*Math.pow(arista,3)*1/4;
		
		System.out.println("1.Datos de la Dodecaedro:");
		System.out.println("2.Area Total: "+Ar);
		System.out.println("3.Volumen: "+volumen);
		break;
	
	case 15:
    double Radio,h1,atotal,tvolumen;
		
		System.out.println("Ingrese el radio del cilindro :");
		R=sc.nextDouble();
		
		System.out.println("Ingrese la altura del cllidro : ");
		h1=sc.nextDouble();
		
		atotal=(2)*(3.1416)*(R)*(h1+R);
		tvolumen= (3.1416)*(R*R)*(h1);
		
		System.out.println("El area del cilindro es : " +String.format("%.2f",atotal ));
		System.out.println("El volumen del cilindro es :  : "+String.format("%.2f",tvolumen));
		break;
	
	case 16:
		System.out.println("--------------ha Salido del programa correctamente usuario--------");
		default:
	
	}
	
	}
}
