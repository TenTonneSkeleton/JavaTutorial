package CodeWars.level8;

public class PowerOf2 {
    public static long[] powersOfTwo(int n){
        long[] res = new long[n+1];
        for (int i = 0; i <= n; i++) {
            res[i]=(long)Math.pow(2,i);
        }
        return res;
    }

    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3 = 4;
        System.out.println(powersOfTwo(n1));
        System.out.println(powersOfTwo(n2));
        System.out.println(powersOfTwo(n3));
    }
}

/*
import static java.util.stream.LongStream.rangeClosed;

interface Kata {
  static long[] powersOfTwo(int n) {
    return rangeClosed(0, n).map(i -> (long) Math.pow(2, i)).toArray();
  }
}
 */