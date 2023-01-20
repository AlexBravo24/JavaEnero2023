
public abstract class objeto {
	private String marca;
	private String modelo;
	
	public objeto() {}

	public objeto(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "objeto [marca=" + marca + ", modelo=" + modelo + "]";
	}

	
	public abstract void sumar();
	
	public abstract void restar();
	
	public abstract void multiplicar();
	
	public abstract void dividir();
}
