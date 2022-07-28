package CodeWars.level8;

public class Divisible {
    public static boolean isDivisible(long n, long x, long y) {
        return (n % x == 0 && n % y == 0) ? true : false;
    }

    public static void main(String[] args) {
            long n1 = 3, n2 = 12, n4 = 12, n3 = 100,
                x1 = 1, x2 = 2, x3 = 5, x4 = 7,
                y1 = 3, y2 = 6, y3 = 3, y4 = 5;
        System.out.println(isDivisible(n1,x1,y1));
        System.out.println(isDivisible(n2,x2,y2));
        System.out.println(isDivisible(n3,x3,y3));
        System.out.println(isDivisible(n4,x4,y4));
    }
}

/*
public class DivisibleNb {
  public static Boolean isDivisible(long n, long x, long y) {
      return (n%x ==0) && (n%y ==0);
  }
}
 */
