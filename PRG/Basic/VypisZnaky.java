class VypisZnaky {
	public static void main(String args[]) 
	  throws java.io.IOExpection {

	  char a;
	  
	  System.out.print("Stiskn�te kl�vesu a pot� enter: ");

	  a = (char) System.in.read();

	  for(int x = 0; x < 11; x++) {
	    System.out.println("Toto je pr�choz� ��slo: " + a);
	    a++;
	  }
	  System.out.println("Toto jsou tv� p�smena");
	}
}