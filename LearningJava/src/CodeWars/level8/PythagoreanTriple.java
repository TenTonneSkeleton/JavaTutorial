package CodeWars.level8;

import java.util.Arrays;

public class PythagoreanTriple {

    public static int pythagoreanTriple(int[] triple){
        Arrays.sort(triple);
        return ((Math.pow(triple[0],2)+Math.pow(triple[1],2))==Math.pow(triple[2],2)) ? 1 : 0;

    }

    public static void main(String[] args) {
        int[] var1 = new int[]{3,4,5};
        int[] var2 = new int[]{3,5,7};
        System.out.println(pythagoreanTriple(var1));
        System.out.println(pythagoreanTriple(var2));

    }


}
