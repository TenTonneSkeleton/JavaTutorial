package CodeWars.level8;

import java.util.Arrays;

public class ReversedSequence {
    public static int[] reverse(int n){
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i]=n-i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(reverse(n)));
    }
}

