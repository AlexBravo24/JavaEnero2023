package auto;

public class Autoestereo {
	
	private String marca;
	private String pantalla;
	private String radio;
	private boolean bluetooth;
	private boolean aux;
	
	public Autoestereo() {
		
	}

	public Autoestereo(String marca, String pantalla, String radio, boolean bluetooth, boolean aux) {
		this.marca = marca;
		this.pantalla = pantalla;
		this.radio = radio;
		this.bluetooth = bluetooth;
		this.aux = aux;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public boolean isAux() {
		return aux;
	}

	public void setAux(boolean aux) {
		this.aux = aux;
	}

	@Override
	public String toString() {
		return "Autoestereo [marca=" + marca + ", pantalla=" + pantalla + ", radio=" + radio + ", bluetooth="
				+ bluetooth + ", aux=" + aux + "]";
	}
	
	

}
