
public class continentes {
	private String Europa = "Europa";  
	private String America = "America";
	private String Asia = "Asia";
	private String Oceania = "Oceania";
	private String Africa = "Africa";
	
	public continentes() {}

	public continentes(String europa, String america, String asia, String oceania, String africa) {
		Europa = europa;
		America = america;
		Asia = asia;
		Oceania = oceania;
		Africa = africa;
	}

	public String getEuropa() {
		return Europa;
	}

	public void setEuropa(String europa) {
		Europa = europa;
	}

	public String getAmerica() {
		return America;
	}

	public void setAmerica(String america) {
		America = america;
	}

	public String getAsia() {
		return Asia;
	}

	public void setAsia(String asia) {
		Asia = asia;
	}

	public String getOceania() {
		return Oceania;
	}

	public void setOceania(String oceania) {
		Oceania = oceania;
	}

	public String getAfrica() {
		return Africa;
	}

	public void setAfrica(String africa) {
		Africa = africa;
	}

	@Override
	public String toString() {
		return "contienentes [Europa=" + Europa + ", America=" + America + ", Asia=" + Asia + ", Oceania=" + Oceania
				+ ", Africa=" + Africa + "]";
	}
	
	
	
}
