package prueba.semana1;

public class Moto extends Vehiculo{

	//Constructor
	public Moto(String color, String matricula, int kilometros, int velocidad) {
		super(color, kilometros, velocidad, matricula);
		this.nRuedas = 2;
	}


	
	@Override
	public void conducir() {

			System.out.println("Conduciendo una moto");
	}
	
}
