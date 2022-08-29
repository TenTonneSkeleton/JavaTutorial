package CodeWars.level8;

import java.util.Arrays;

public class SearchMaxMathFunction {

    public static int expressionsMatter(int a, int b, int c)
    {
        int[] result = new int[]{(a+b)+c, (a+b)*c, a*(b+c),a*b*c};
        Arrays.sort(result);
        return result[result.length-1];
    }

    public static void main(String[] args) {
        int a1 = 2, b1 = 1, c1 = 2,
                a2 = 1, b2 = 1, c2 = 1,
                a3 = 2, b3 = 1, c3 = 1,
                a4 = 1, b4 = 2, c4 = 3,
                a5 = 1, b5 = 3, c5 = 1,
                a6 = 2, b6 = 2, c6 = 2;
        System.out.println(expressionsMatter(a1,b1,c1));
        System.out.println(expressionsMatter(a2,b2,c2));
        System.out.println(expressionsMatter(a3,b3,c3));
        System.out.println(expressionsMatter(a4,b4,c4));
        System.out.println(expressionsMatter(a5,b5,c5));
        System.out.println(expressionsMatter(a6,b6,c6));
    }
}
