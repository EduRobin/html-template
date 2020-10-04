class VypisZnaky {
	public static void main(String args[]) 
	  throws java.io.IOExpection {

	  char a;
	  
	  System.out.print("Stisknìte klávesu a poté enter: ");

	  a = (char) System.in.read();

	  for(int x = 0; x < 11; x++) {
	    System.out.println("Toto je prùchozí èíslo: " + a);
	    a++;
	  }
	  System.out.println("Toto jsou tvá písmena");
	}
}