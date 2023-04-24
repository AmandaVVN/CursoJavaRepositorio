package prueba.semana1;

public abstract class Vehiculo implements IConducible{
	
	protected String color;
	protected int kilometros, velocidad;
	protected int nRuedas;
	protected String matricula;


	//Constructor
	public Vehiculo(String color,int kilometros, int velocidad,String matricula) {
		this.color = color;
		this.kilometros = kilometros;
		this.velocidad = velocidad;
		this.matricula = matricula;
	}


	//Metodos comunes a clases herederas de Vehiculo

	@Override
	public void retroceder() {
		System.out.println("Marcha Atras");
		
	}


	@Override
	public void parar() {
		System.out.println("Parando");
	}
	

	@Override
	public void avanzar() {
		System.out.println("Avanzando");
	}


	

	//Setters y Getters
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	/**
	 * @return the kilometros
	 */
	public int getKilometros() {
		return kilometros;
	}


	/**
	 * @param kilometros the kilometros to set
	 */
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}


	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}


	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	/**
	 * @return the nRuedas
	 */
	public int getnRuedas() {
		return nRuedas;
	}


	/**
	 * @param nRuedas the nRuedas to set
	 */
	public void setnRuedas(int nRuedas) {
		this.nRuedas = nRuedas;
	}


	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

}
