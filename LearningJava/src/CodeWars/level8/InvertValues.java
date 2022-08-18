package CodeWars.level8;

import java.util.Arrays;

public class InvertValues {
    public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result[i] = Math.abs(array[i]);
            } else {
                result[i] = array[i] * -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = new int[]{-1, 2, -3, 4, -5};
        System.out.println(Arrays.toString(invert(input)));
    }
}
