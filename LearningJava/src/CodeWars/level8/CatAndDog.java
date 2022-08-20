package CodeWars.level8;

import java.util.Arrays;

public class CatAndDog {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        if (humanYears==1){
            return new int[]{humanYears,15,15};
        } else if (humanYears==2){
            return new int[]{humanYears,24,24};
        } else {
            return new int[]{humanYears,(humanYears-2)*4+24,(humanYears-2)*5+24};
        }

    }

    public static void main(String[] args) {
        int var1 = 1, var2 = 2, var3 = 10;
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(var1)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(var2)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(var3)));
    }

}
