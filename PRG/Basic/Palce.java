class Palce {
	public static void main(String args[]) {
		long KrychlovePalce;
		long PalcuNaMili;

		PalcuNaMili = 5280 * 12;

		KrychlovePalce = PalcuNaMili * PalcuNaMili * PalcuNaMili;

		System.out.println("Jedna krychlov� m�le obsahuje " + KrychlovePalce + 
				   " Krychlov�ch palc�.");
	}
}