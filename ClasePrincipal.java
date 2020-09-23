
public class ClasePrincipal {

	public static void main(String[] args) {
		
		OperacionesContables  operacion =new OperacionesContables ();
		
		System.out.println(operacion.suma2(4,6));
		System.out.println(operacion.impuestoiva(200));
		
		System.out.println(operacion.precioNeto(40));
		System.out.println(operacion.IvaPequeñoContribuyente(79));
		System.out.println(operacion.MoradeImpuestodeInmuebles(25));
		System.out.println(operacion.Rentadeutilidadeslucrativas(31));
		System.out.println(operacion.RentaISR(150));
		System.out.println(operacion.Horasdurniasimple(3200));
		System.out.println(operacion.Horasmixtasimple(3700));
		System.out.println(operacion.Horasnocturnasimple(3200));
     
	}

}
