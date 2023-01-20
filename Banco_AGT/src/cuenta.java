
public class cuenta {
	
	//atributos que posee una cuenta de banco
	private String numcuenta;
	private double Saldo;
	private String nip;
	private double Min;
	private double Max;
	private String tipoCuenta;
	
	
	public cuenta() {}


	public cuenta(String numcuenta, double saldo, String nip, double min, double max, String tipoCuenta) {
		this.numcuenta = numcuenta;
		this.Saldo = saldo;
		this.nip = nip;
		this.Min = min;
		this.Max = max;
		this.tipoCuenta = tipoCuenta;
	}


	public String getNumcuenta() {
		return numcuenta;
	}


	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}


	public double getSaldo() {
		return Saldo;
	}


	public void setSaldo(double saldo) {
		this.Saldo = saldo;
	}


	public String getNip() {
		return nip;
	}


	public void setNip(String nip) {
		this.nip = nip;
	}


	public double getMin() {
		return Min;
	}


	public void setMin(double min) {
		this.Min = min;
	}


	public double getMax() {
		return Max;
	}


	public void setMax(double max) {
		this.Max = max;
	}


	public String getTipoCuenta() {
		return tipoCuenta;
	}


	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}


	@Override
	public String toString() {
		return "cuenta [numcuenta=" + numcuenta + ", saldo=" + Saldo + ", nip=" + nip + ", min=" + Min + ", max=" + Max
				+ ", tipoCuenta=" + tipoCuenta + "]";
	}


	
}
