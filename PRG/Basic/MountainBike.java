class Bicycle {
}

class MountainBike extends Bicycle {
    public static void main(String args[]) {
        MountainBike kolo = new MountainBike();

        if(kolo instanceof Bicycle) {
            MountainBike myBike = (MountainBike)kolo;
            System.out.println("Kolo je typu mountain"); 
            
        }else 
            System.out.println("kolo neni typu mountain");
    }
}
