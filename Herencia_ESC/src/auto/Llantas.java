package auto;

public class Llantas extends Automovil{

	private String marcall;
	private int ancho;
	private int perfil;
	
	public Llantas() {
		
	}

	public Llantas(String marca, String modelo, double precio, String color, String marcall, int ancho, int perfil) {
		super(marca, modelo, precio, color);
		this.marcall = marcall;
		this.ancho = ancho;
		this.perfil = perfil;
	}

	/**
	 * @return the marcall
	 */
	public String getMarcall() {
		return marcall;
	}

	/**
	 * @param marcall the marcall to set
	 */
	public void setMarcall(String marcall) {
		this.marcall = marcall;
	}

	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the perfil
	 */
	public int getPerfil() {
		return perfil;
	}

	/**
	 * @param perfil the perfil to set
	 */
	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Llantas [marcall=" + marcall + ", ancho=" + ancho + ", perfil=" + perfil + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getPrecio()=" + getPrecio() + ", getColor()=" + getColor() + "]";
	}

	
	
	
	

	



}
