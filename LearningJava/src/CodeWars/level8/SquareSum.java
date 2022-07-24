package CodeWars.level8;

public class SquareSum {
    public static int squareSum(int[] n){
        int s = 0;
        for (int i:n){
            s+=i*i;
        }
        return s;
    }
}
/* Variant 1
  public static int squareSum(int[] xs) {
    return Arrays.stream(xs).map(x -> x * x).sum();
  }
 */