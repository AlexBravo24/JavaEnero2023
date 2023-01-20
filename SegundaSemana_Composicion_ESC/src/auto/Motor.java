package auto;

public class Motor {
	
	private double version;
	private int cilindros;
	private double diametro;
	private double compresion;
	private double rpm;
	
	public Motor() {
		
	}

	public Motor(double version, int cilindros, double diametro, double compresion, double rpm) {
		this.version = version;
		this.cilindros = cilindros;
		this.diametro = diametro;
		this.compresion = compresion;
		this.rpm = rpm;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getCompresion() {
		return compresion;
	}

	public void setCompresion(double compresion) {
		this.compresion = compresion;
	}

	public double getRpm() {
		return rpm;
	}

	public void setRpm(double rpm) {
		this.rpm = rpm;
	}

	@Override
	public String toString() {
		return "Motor [version=" + version + ", cilindros=" + cilindros + ", diametro=" + diametro + ", compresion="
				+ compresion + ", rpm=" + rpm + "]";
	}
	
	
	
	
	
	

}
