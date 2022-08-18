package CodeWars.level8;

//Sum of differences in array
//В порядке убывания: [10, 2, 1]
//Сумма: (10 - 2) + (2 - 1) = 8 + 1 = 9
//Если массив пуст или содержит только один элемент, результат должен быть 0

import java.util.Arrays;
import java.util.Collections;

public class SortReverseArrays {

    public static int sumOfDifferences(int[] arr) {
        Integer[] result = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i]=arr[i];
        }
        Arrays.sort(result, Collections.reverseOrder());
        System.out.println(Arrays.toString(result));
        return 0;
    }

    public static void main(String[] args) {
        int[] var1 = new int[]{1, 2, 10};
        int[] var2 = new int[]{-3, -2, -1};
        int[] var3 = new int[]{-17, 17};
        System.out.println(sumOfDifferences(var1));
        System.out.println(sumOfDifferences(var2));
        System.out.println(sumOfDifferences(var3));
    }
}
