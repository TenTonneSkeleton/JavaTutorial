package CodeWars.level8;

public class BeginnerSeries4 {
    public static int cockroachSpeed(double x){
        return (int)(x*100000/3600);
    }

    public static void main(String[] args) {
        double x1 = 1.08, x2 = 1.09, x3 = 0;
        System.out.println(cockroachSpeed(x1));
        System.out.println(cockroachSpeed(x2));
        System.out.println(cockroachSpeed(x3));


    }

}
