package CodeWars.level8;

public class BeginnerSeries {
    public static int paperWork(int n, int m){
        return (n>0 & m>0) ? n*m : 0;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int m1 = 5;
        System.out.println(paperWork(n1,m1));
    }
}
