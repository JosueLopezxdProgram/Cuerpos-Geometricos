package Areas_Geometricas;

public class CasqueteEsferico {

	public static void main(String[] args) {
		
		//Casquete esferico
	
			double Area, Volumen, r, R, h;
			
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
		}
	

	 

	}