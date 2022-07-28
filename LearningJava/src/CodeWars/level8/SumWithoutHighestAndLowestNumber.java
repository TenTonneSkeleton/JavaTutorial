package CodeWars.level8;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return 0;
        }
        int sum = 0;
        int min = numbers[0], max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println(sum);
            if (i > 0) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
        }
        return sum - max - min;
    }

    public static void main(String[] args) {
        int[] numbers1 = new int[]{};
        int[] numbers2 = new int[]{1, 1, 11, 2, 3};
        System.out.println(sum(numbers1));
        System.out.println(sum(numbers2));
    }
}

/*
import static java.util.stream.IntStream.of;
public class Kata {
  public static int sum(int[] numbers) {
    return (numbers == null || numbers.length <= 2) ? 0 : of(numbers).sum() - of(numbers).max().getAsInt() - of(numbers).min().getAsInt();
  }
}
 */