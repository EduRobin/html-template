//Toto je ukázka příkazu switch.
class UkazSwitch {
    public static void main(String args[]) {
        int i;

        for(i=0; i<10; i++)
            switch(i) {
                case 0:
                    System.out.println("Promenna i se rovna nule.");
                    break;
                case 1:
                    System.out.println("Promenna i se rovna jedne.");
                    break;
                case 2:
                    System.out.println("Promenna i se rovna dvema.");
                    break;
                case 3:
                    System.out.println("Promenna i se rovna trem.");
                    break;
                case 4:
                    System.out.println("Promenna i se rovna ctyrem.");
                    break;
                default:
                    System.out.println("Promenna i je vetsi nebo rovna peti.");
            }
    }
}