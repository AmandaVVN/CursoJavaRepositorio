package prueba.semana1;

public class PCoche {

	public static void main(String[] args) {

		//Instanciar clases
		Coche coche1 = new Coche("Rojo","2356JMF",15000,180);
		Moto moto1 = new Moto("Azul","2256JMF",15000,180);
		
		
		moto1.conducir();
		coche1.conducir();

	}

}
