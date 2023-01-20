package auto;

public class Frenos {
	
	private String fabricante;
	private String tipo;
	private String material;
	private double duracionkm;
	
	public Frenos () {
		
	}

	public Frenos(String fabricante, String tipo, String material, double duracionkm) {
		this.fabricante = fabricante;
		this.tipo = tipo;
		this.material = material;
		this.duracionkm = duracionkm;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getDuracionkm() {
		return duracionkm;
	}

	public void setDuracionkm(double duracionkm) {
		this.duracionkm = duracionkm;
	}

	@Override
	public String toString() {
		return "Frenos [fabricante=" + fabricante + ", tipo=" + tipo + ", material=" + material + ", duracionkm="
				+ duracionkm + "]";
	}
	
	
	
	
	

}
