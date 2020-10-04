class UkazFor {
	public static void main(String args[]) {
		int pocet;

		for(pocet = 100; pocet > -1 ; pocet = pocet-2)
		  System.out.println("Toto je prùchod èíslo: " + pocet);

		if(pocet == 50) 
		  System.out.println("jsem v polovine");

		System.out.println("Hotovo");
	}
}