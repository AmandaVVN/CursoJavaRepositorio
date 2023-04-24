package prueba.semana1;

public class Coche extends Vehiculo{

	//Constructor
	public Coche(String color, String matricula, int kilometros, int velocidad) {
		super(color,kilometros,velocidad,matricula);
		this.nRuedas = 4;
	}

	
	@Override
	public void conducir() {
		System.out.println("Conduciendo un coche");
		
	}
}
