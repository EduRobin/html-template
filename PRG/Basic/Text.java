class Text {
    public static void main(String args[])  {
        char znak = 'c';
        String slovo1 = "Ahoj";  // A= 0 ;H= 1 ;O= 2 ;J= 3

        System.out.println(slovo1.charAt(1)); // zobrazí písmeno 1
        System.out.println(slovo1.concat(" Jirko"));
        System.out.println(slovo1.equals("Ahoj"));
        System.out.println(slovo1.equalsIgnoreCase("AhOj"));
        System.out.println(slovo1.substring(1,3)); // zobrazí písmena od 1 do 3
        System.out.println(slovo1.substring(1,3).concat("ra")); //vypíše to pismena od 1 do 3 a přída připonu ra
        System.out.println(slovo1.length()); //dýlka solva
        System.out.println(slovo1.replace('o','x')); //změní písmeno o na x
        System.out.println(slovo1.toLowerCase()); // převede slovo na malý písmena
        System.out.println(slovo1.toUpperCase()); // převede slovo na velký písmena
        
        System.out.println(slovo1.trim()); // ořeže mezery
        System.out.println(slovo1.indexOf('o')); // vrátí pozici znaku ve slově 
    }
} 
