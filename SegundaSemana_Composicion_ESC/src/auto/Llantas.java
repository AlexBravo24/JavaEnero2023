package auto;

public class Llantas {

	private String marca;
	private int ancho;
	private int perfil;
	private String construccion="Radial";
	private int drin;
	private double pcarga;
	
	public Llantas() {
		
	}

	public Llantas(String marca, int ancho, int perfil, String construccion, int drin, double pcarga) {
		this.marca = marca;
		this.ancho = ancho;
		this.perfil = perfil;
		this.construccion = construccion;
		this.drin = drin;
		this.pcarga = pcarga;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getPerfil() {
		return perfil;
	}

	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}

	public String getConstruccion() {
		return construccion;
	}

	public void setConstruccion(String construccion) {
		this.construccion = construccion;
	}

	public int getDrin() {
		return drin;
	}

	public void setDrin(int drin) {
		this.drin = drin;
	}

	public double getPcarga() {
		return pcarga;
	}

	public void setPcarga(double pcarga) {
		this.pcarga = pcarga;
	}

	@Override
	public String toString() {
		return "Llantas [marca=" + marca + ", ancho=" + ancho + ", perfil=" + perfil + ", construccion=" + construccion
				+ ", drin=" + drin + ", pcarga=" + pcarga + "]";
	}
	
	
	
	
}
