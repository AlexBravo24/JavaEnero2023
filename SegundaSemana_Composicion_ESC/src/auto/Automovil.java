package auto;

public class Automovil {
	
	private String marca;
	private String modelo;
	private double precio;
	private String color;
	
	private Frenos frenos;
	private Autoestereo autoestereo;
	private Llantas llantas;
	private Motor motor;
	
	public Automovil(){
		
	}

	
	public Automovil(String marca, String modelo, double precio, String color, Frenos frenos, Autoestereo autoestereo,
			Llantas llantas, Motor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
		this.frenos = frenos;
		this.autoestereo = autoestereo;
		this.llantas = llantas;
		this.motor = motor;
	}


	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}


	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}


	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}


	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}


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
	 * @return the frenos
	 */
	public Frenos getFrenos() {
		return frenos;
	}


	/**
	 * @param frenos the frenos to set
	 */
	public void setFrenos(Frenos frenos) {
		this.frenos = frenos;
	}


	/**
	 * @return the autoestereo
	 */
	public Autoestereo getAutoestereo() {
		return autoestereo;
	}


	/**
	 * @param autoestereo the autoestereo to set
	 */
	public void setAutoestereo(Autoestereo autoestereo) {
		this.autoestereo = autoestereo;
	}


	/**
	 * @return the llantas
	 */
	public Llantas getLlantas() {
		return llantas;
	}


	/**
	 * @param llantas the llantas to set
	 */
	public void setLlantas(Llantas llantas) {
		this.llantas = llantas;
	}


	/**
	 * @return the motor
	 */
	public Motor getMotor() {
		return motor;
	}


	/**
	 * @param motor the motor to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
				+ ", frenos=" + frenos + ", autoestereo=" + autoestereo + ", llantas=" + llantas + ", motor=" + motor
				+ "]";
	}


	
	
	

}
