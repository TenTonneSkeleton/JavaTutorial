package CodeWars.level8;

import java.util.ArrayList;
import java.util.Arrays;

public class ListMaxMinNumbers {

    public static int[] pipeFix(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(numbers);
        int max = numbers[numbers.length-1];
        for (int min = numbers[0];  min<=max ; min++) {
            result.add(min);
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] var1 = new int[]{1,2,3,5,6,8,9};
        int[] var2 = new int[]{1,2,3,12};
        int[] var3 = new int[]{6,9};
        int[] var4 = new int[]{-1,4};
        int[] var5 = new int[]{1,2,3};
        System.out.println(Arrays.toString(pipeFix(var1)));
        System.out.println(Arrays.toString(pipeFix(var2)));
        System.out.println(Arrays.toString(pipeFix(var3)));
        System.out.println(Arrays.toString(pipeFix(var4)));
        System.out.println(Arrays.toString(pipeFix(var5)));
    }
}

/*
  public static int[] pipeFix(int[] numbers) {
    return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
  }
 */