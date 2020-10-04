// Program naèítá znak z klávesnice
class VstupKlav {
	public static void main(String args[])
	   throws java.io.IOException {

		char ch;

		System.out.print("Stisknìte klávesu a poté Enter: ");

		ch = (char) System.in.read(); // naète znak

		System.out.println("Byla zadána klávesa: " + ch);
	}
}