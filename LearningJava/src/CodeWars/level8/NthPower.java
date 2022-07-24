package CodeWars.level8;

public class NthPower {
    public static int nthPower(int[] array, int n) {
        if (array.length-1<n) {
            return -1;
        } else {
            return (int) Math.pow(array[n], n);
        }
    }
    public static void main(String[] args) {
        int[] array = {3,1,2};
        int n = 3;
        System.out.println(nthPower(array,n));
    }
}

/*
public class Kata {
  public static int nthPower(int[] array, int n) {
    return n >= array.length ? -1 : (int) Math.pow(array[n], n);
  }
}
 */