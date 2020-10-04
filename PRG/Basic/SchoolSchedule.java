import java.util.Scanner;

public class SchoolSchedule {
	private Den[] rozvrh;
	private String[] zacatky;

	public SchoolSchedule() {
		this.rozvrh = new Den[5];
		this.zacatky = new String[4];
		zacatky[0] = "8:00";
		zacatky[1] = "9:00";
		zacatky[2] = "10:00";
	}

	public void create() {
		String[] dny = new String[5];
		dny[0] = "PO";
		dny[1] = "UT";
		dny[2] = "ST";
		dny[3] = "CT";
		dny[4] = "PA";

		Scanner s = new java.util.Scanner(System.in);
		
		for(int i = 0; i < rozvrh.length; i++) {
			System.out.print("Pocet hodin v " +  dny[i].toString() + ": ");
			int pocHod = Integer.parseInt(s.nextLine());
			
			vypisZacatky(this.zacatky);
			String zacatekDne = vyberZacatek(this.zacatky);
			Den d = new Den(dny[i].toString(), pocHod, zacatekDne);
			
			for(int j = 0; j < pocHod; j++) {
				System.out.print("Nazev " + (j + 1) + ". hodiny: ");
				String nazevHodiny = s.nextLine();
				
				
				Hodina h = new Hodina(nazevHodiny);
				
				d.addHodina(h);
			}
			this.rozvrh[i] = d;
		}
		
	}
	private String upravZacatek(String[] casy, Den d, int sirkaSloupecku) {
		String result = "";
		for(String cas : casy) {
			if(cas != null) {
				if(cas.equals(d.getZacatek())) {
					return result;
				}
			}
			result += this.zarovnejString("", sirkaSloupecku);
		}
		return result;
	}
	private String vyberZacatek(String[] zacatky) {
		Scanner s = new Scanner(System.in);
		System.out.print("Jaky zacatek chces?(index): ");
		int i = Integer.parseInt(s.nextLine());

		return zacatky[i - 1];
	}
	private String zarovnejString(String input, int l) {
		int delka = (l - input.toString().length())/2;
		String vypln = "";
		for(int i = 0; i < delka; i++) {
			vypln += " ";
		}
		return vypln + input + vypln;
	}
	private void vypisZacatky(String[] zacatky) {
		for(int i =0; i < zacatky.length ; i++) {
			if(zacatky[i] != null)
			System.out.print((i + 1) + ":" + zacatky[i].toString() + ", ");
		}
	}
	private int nejdelsiHodinaNazev() {
		int result = 0;
		for(Den d : this.rozvrh) {
			for(Hodina h : d.getHodiny()) {
				if(h.getNazev().toString().length() > result) result = h.getNazev().toString().length();
			}  
	}
	private void vypisCasy(String[] casy, int pocet, int sirkaSloupecku) {
		String[] temp = casy[0].toString().split(":"); // Split mi udela pole na zaklade znaku v zavorce
		int cas = Integer.parseInt(temp[0]);
		System.out.print(this.zarovnejString("", 5));
		for(int i =0; i < pocet; i++) {
			System.out.print(this.zarovnejString(cas + ":00", sirkaSloupecku) + "|");
			cas++;
		}
		System.out.println();
	}
	public void write() {
		int sirkaSloupecku = this.nejdelsiHodinaNazev() + 2;
		this.vypisCasy(this.zacatky, this.zacatky.length, sirkaSloupecku);
		for(Den d : this.rozvrh) {
			System.out.print(this.zarovnejString(d.getNazev(), 4) + ":" + upravZacatek(this.zacatky, d, sirkaSloupecku));
			for(Hodina h : d.getHodiny()) {
				System.out.print(zarovnejString(h.getNazev(), sirkaSloupecku) + "|");
			}
			System.out.println();
		}
	}
}