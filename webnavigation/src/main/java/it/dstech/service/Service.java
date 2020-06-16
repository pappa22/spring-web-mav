package it.dstech.service;

public class Service {
	
	public double add(double numero1,double numero2) {
		
		 return (numero1 + numero2);
		

}
	public double sott(double numero1,double numero2) {
		
		  return (numero1 - numero2);
		
}
	public double molt(double numero1,double numero2) {
		
			return (numero1 * numero2);
		
}
	public double div(double numero1,double numero2) {
		
			return numero1/numero2;
		
}
	
	public boolean check(double numero2) {
		if(numero2 != 0) {
			return true;
		}
		return false;
	}
}
