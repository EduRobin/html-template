public class MojeAuto { 
    public int nadrz;
    public int spotreba;
    public int rychlost;
    public double maxDojezd;

    public static double toString( nadrz, spotreba, rychlost, maxDojezd) {
        this.nadrz = nadrz; 
        this.spotreba = spotreba;
        this.rychlost = rychlost;
        this.maxDojezd = maxDojezd;
    }
    

    public static double dojezd( int nadrz,  int spotreba) {
        double maxDojezd = (nadrz / spotreba) * 100;
        return maxDojezd;
    }
            
        
    
}