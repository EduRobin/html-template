class CarsOOP {
    public static void main(String args[]) {

        String car1 = "fabie";
        double maxRychlostFabia = 100;
        double velikostNadrzeFabia = 50;
        double spotrebaFabia = 5;
        
        System.out.println(car1 + maxRychlostFabia + velikostNadrzeFabia + spotrebaFabia +  vratMaxDojezdFabia);

        String car2 = "audi";
        double maxRychlostAudi = 200;
        double velikostNadrzeAudi = 70;
        double spotrebaAudi = 8;     
        
        System.out.println(car2 + maxRychlostAudi + velikostNadrzeAudi + spotrebaAudi + vratMaxDojezdAudi );
        
        String car3 = "bmw";
        double maxRychlostBmw = 180;
        double velikostNadrzeBmw = 60;
        double spotrebaBmw = 7;
        
        System.out.println(car3 + maxRychlostBmw + velikostNadrzeBmw + spotrebaBmw + vratMaxDojezdBmw);

        MojeAuto fabie = new MojeAuto(50, 5, 100);
        MojeAuto audi = new MojeAuto(70, 8, 200);
        MojeAuto bmw = new MojeAuto(60, 7, 180);

        System.out.println(toString());
        System.out.println(toString());
        System.out.println(toString());








    }
}


    