// Program na��t� znak z kl�vesnice
class VstupKlav {
	public static void main(String args[])
	   throws java.io.IOException {

		char ch;

		System.out.print("Stiskn�te kl�vesu a pot� Enter: ");

		ch = (char) System.in.read(); // na�te znak

		System.out.println("Byla zad�na kl�vesa: " + ch);
	}
}