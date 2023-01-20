import java.util.Date;

public class ticket {
	
	private int folioOperacion;
	private Date fechaHora;
	private String numcuenta;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	public ticket () {}

	public ticket(int folioOperacion, Date fechaHora, String numcuenta, double saldo, String sucursal, int idCajero) {
		this.folioOperacion = folioOperacion;
		this.fechaHora = fechaHora;
		this.numcuenta = numcuenta;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}

	public int getFolioOperacion() {
		return folioOperacion;
	}

	public void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getNumcuenta() {
		return numcuenta;
	}

	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	@Override
	public String toString() {
		return "ticket [folioOperacion=" + folioOperacion + ", fechaHora=" + fechaHora + ", numcuenta=" + numcuenta
				+ ", saldo=" + saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	
	
	
}
