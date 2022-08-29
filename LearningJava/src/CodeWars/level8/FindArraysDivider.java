package CodeWars.level8;

import java.util.ArrayList;
import java.util.Arrays;

public class FindArraysDivider {
    public static int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> result = new ArrayList();
        for (int var:numbers){
            if (var%divider==0){
                result.add(var);
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] var1 = new int[]{1,2,3,4,5,6};
        int[] var2 = new int[]{1,2,3,4,5,6};
        int[] var3 = new int[]{0,1,2,3,4,5,6};
        int var11 = 2, var12 = 3, var13 = 4;
        System.out.println(Arrays.toString(divisibleBy(var1, var11)));
        System.out.println(Arrays.toString(divisibleBy(var2, var12)));
        System.out.println(Arrays.toString(divisibleBy(var3, var13)));
    }

}


/*
  public static int[] divisibleBy(int[] numbers, int divider) {

    return Arrays.stream(numbers)
                 .filter(i -> (i % divider) == 0)
                 .toArray();
  }
 */
