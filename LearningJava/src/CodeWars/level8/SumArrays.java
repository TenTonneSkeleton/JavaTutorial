package CodeWars.level8;
import java.util.Arrays;

public class SumArrays {
    public static double sum(double[] numbers) {
        double s=0;
        if (numbers==null || numbers.length == 0) return 0;
        for (double element: numbers) {
            s+=element;
        }
        return s;
    }

    public static void main(String[] args) {
        double[] num1 = new double[]{};
        double[] num2 = new double[]{-2.398};
        double[] num3 = new double[]{1, 2, 3};
        double[] num4 = new double[]{1.1, 2.2, 3.3};
        double[] num5 = new double[]{1, 5.2, 4, 0, -1};
        double[] num6 = new double[]{30, 89, 100, 101};
        System.out.println(sum(num1));
        System.out.println(sum(num2));
        System.out.println(sum(num3));
        System.out.println(sum(num4));
        System.out.println(sum(num5));
        System.out.println(sum(num6));
    }
}


/*
import java.util.Arrays;

public class SumArray {

  public static double sum(double[] numbers) {
    return Arrays.stream(numbers).sum();
  }
}
 */
