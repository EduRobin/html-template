class Palce {
	public static void main(String args[]) {
		long KrychlovePalce;
		long PalcuNaMili;

		PalcuNaMili = 5280 * 12;

		KrychlovePalce = PalcuNaMili * PalcuNaMili * PalcuNaMili;

		System.out.println("Jedna krychlová míle obsahuje " + KrychlovePalce + 
				   " Krychlových palcù.");
	}
}