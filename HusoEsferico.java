package Areas_Geometricas;

public class HusoEsferico {

	public static void main(String[] args) {
		double Area, Volumen, r, n;
		
		r=8;
		n=45;
		Area= (Math.PI*Math.pow(r,2)*n)/90;
		Volumen = (Math.PI*Math.pow(r,3)*n)/270;

		System.out.println("1.Datos de la Esfera:");
		System.out.println("2.Radio: "+r);
		System.out.println("3.Area Total: "+Area);
		System.out.println("4.Volumen: "+Volumen);


	}

}
