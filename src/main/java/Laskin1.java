public class Laskin1 {
    public double laskeEtaisyys(double x1,double y1, double x2, double y2){
        double d = (y2-y1) * (y2-y1) + (x2-x1) * (x2-x1);
        return Math.sqrt(d);
    }
}
