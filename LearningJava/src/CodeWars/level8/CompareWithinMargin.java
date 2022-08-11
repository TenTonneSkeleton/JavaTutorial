package CodeWars.level8;

public class CompareWithinMargin {

    public static int closeCompare(double a, double b) {
        return Double.compare(a, b);
        //        if (a<b){return -1;} else if (a>b){return 1;} else {return 0;}
    }

    public static int closeCompare(double a, double b, double margin) {
        return 0; // TODO
    }

    public static void main(String[] args) {
        double a1=4,a2=5,a3=6,a4=-6,a5=2,a6=8.1,a7=1.99;
        double b1=5,b2=5,b3=5,b4=-5,b5=3,b6=3,b7=3;
        double margin5=3, margin6=3, margin=3;
        System.out.println(closeCompare(a1,b1));
        System.out.println(closeCompare(a2,b2));
        System.out.println(closeCompare(a3,b3));
        System.out.println(closeCompare(a4,b4));


    }
}
