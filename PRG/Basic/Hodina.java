public class Hodina {

	private String nazev;	

	public Hodina(String nazev) {
		this.nazev = nazev;
	}

	public String getNazev() {
		return this.nazev;
	}

	public String toString() {
		return this.getNazev();
	}
}
