package CodeWars.level8;

public class SumOfPositive {
    public static int sum(int[] arr){
        int s=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                s+=arr[i];
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
    }
}

/* Variant 1
import java.util.Arrays;
public class Positive{
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }
}
 */

/* Variant 2
import java.util.stream.IntStream;

public class Positive{

  public static int sum(int[] arr) {
    return IntStream.of(arr).filter(x -> x > 0).sum();
  }

}
 */
