
public class paises {
	private String Suramerica ;  
	private String NorteAmerica ;
	private String CentroAmerica;
	
	public paises() {}

	public paises(String suramerica, String norteAmerica, String centroAmerica) {
		super();
		Suramerica = suramerica;
		NorteAmerica = norteAmerica;
		CentroAmerica = centroAmerica;
	}

	public String getSuramerica() {
		return Suramerica;
	}

	public void setSuramerica(String suramerica) {
		Suramerica = suramerica;
	}

	public String getNorteAmerica() {
		return NorteAmerica;
	}

	public void setNorteAmerica(String norteAmerica) {
		NorteAmerica = norteAmerica;
	}

	public String getCentroAmerica() {
		return CentroAmerica;
	}

	public void setCentroAmerica(String centroAmerica) {
		CentroAmerica = centroAmerica;
	}

	@Override
	public String toString() {
		return "paises [Suramerica=" + Suramerica + ", NorteAmerica=" + NorteAmerica + ", CentroAmerica="
				+ CentroAmerica + "]";
	}
	
	

}
