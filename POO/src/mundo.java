
public class mundo {
	private continentes continentes;
	private paises paises;
	
	
	public mundo() {}


	public mundo(continentes continentes, paises paises) {
		super();
		this.continentes = continentes;
		this.paises = paises;
	}


	public continentes getContinentes() {
		return continentes;
	}


	public void setContinentes(continentes continentes) {
		this.continentes = continentes;
	}


	public paises getPaises() {
		return paises;
	}


	public void setPaises(paises paises) {
		this.paises = paises;
	}


	@Override
	public String toString() {
		return "mundo [continentes=" + continentes + ", paises=" + paises + "]";
	}
	
	
	
}
