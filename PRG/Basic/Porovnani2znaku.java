class Porovnani2znaku {
	public static void main(String args[])
	  throws java.io.IOException {

		char A;
		char B;

		System.out.print("stiskni  klavesu");

		A = (char) System.in.read();

		System.out.print("stiskni 2.klávesu");

		B = (char) System.in.read();
		
		if(A == B) System.out.println("Shoda");
		else System.out.println(" Rozdíl 1");
	}
}
	 