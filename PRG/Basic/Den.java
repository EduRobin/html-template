public class Den {

	private Hodina[] hodiny;
	private int i;
	private String nazev;
	private String zacatek;

	public Den(String nazev, int pocetHodin, String zacatek) {
		this.nazev = nazev;
		this.i = 0;
		this.hodiny = new Hodina[pocetHodin];
		this.zacatek = zacatek;
	}
	public String getNazev() {
		return this.nazev;
	}
	public void addHodina(Hodina h) {
		this.hodiny[i] = h;  
		this.i++;
	}
	public Hodina[] getHodiny() {
		return this.hodiny;
	}
	public String getZacatek() {
		return this.zacatek;
	}
	public String toString() {
		String result = "";
		for(int j = 0; j < this.hodiny.length; j++) {
			if(this.hodiny[j] != null)
				if(j < this.hodiny.length)
					result += this.hodiny[j].toString() + ", ";
				else
					result += this.hodiny[j].toString();
		}
		return result;
	}
}

//
    