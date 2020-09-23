
public class OperacionesContables {

	public static double suma2(double a,double b) {
		double resultado =a+b;
		return resultado;
	}
	public static double resta2(double n1,double n2) {
		double resultado = n1-n2;
		return resultado;
	}
	public static double impuestoiva(double cantidad) {
		double resultado = cantidad *0.12 ;
		return resultado;
	}
	//1
	public static double precioNeto(double cantidad) {
		double resultado = cantidad /1.12 ;
		return resultado;
	}
	//2
	public static double IvaPequeñoContribuyente(double cantidad) {
		double resultado = cantidad *0.05;//5%
		return resultado;
	}
	//3
	public static double MoradeImpuestodeInmuebles(double cantidad) {
		double resultado = cantidad *0.20;//20%
		return resultado;
	}
	//4
	public static double Rentadeutilidadeslucrativas(double cantidad) {
		double resultado = cantidad*0.25 ;//25%
		return resultado;
	}
	//5
	public static double RentaISR(double cantidad) {
		double resultado = cantidad*0.07 ;//7%
		return resultado;	
	}
	//6
	public static double Horasdurniasimple(double cantidad) {
		double resultado1 = cantidad/30/8*1.5 ;
		return resultado1 * 13 ;	
	}
	//7
	public static double Horasmixtasimple(double cantidad) {
		double resultado = cantidad/30/7*1.5;
		return resultado * 9;		
	}
	//8
	public static double Horasnocturnasimple(double cantidad) {
		double resultado = cantidad/30/6*1.5 ;
		return resultado *6;
	}
}
