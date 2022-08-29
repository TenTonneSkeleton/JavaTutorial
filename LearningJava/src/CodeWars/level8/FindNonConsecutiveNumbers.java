package CodeWars.level8;

public class FindNonConsecutiveNumbers {

    public static Integer find(final int[] array) {
        if (array[0]!=0){
            for (int i = 1; i < array.length; i++) {
                if (array[i]-1!=array[0]){
                    return array[i];
                } else {
                    array[0]++;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] var1 = new int[]{1, 2, 3, 4, 6, 7, 8};
        int[] var2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] var3 = new int[]{4, 6, 7, 8, 9, 11};
        int[] var4 = new int[]{4, 5, 6, 7, 8, 9, 11};
        int[] var5 = new int[]{31, 32};
        int[] var6 = new int[]{-3, -2, 0, 1};
        int[] var7 = new int[]{-5, -4, -3, -1};
        System.out.println(find(var1));
        System.out.println(find(var2));
        System.out.println(find(var3));
        System.out.println(find(var4));
        System.out.println(find(var5));
        System.out.println(find(var6));
        System.out.println(find(var7));
    }
}
