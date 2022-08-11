package CodeWars.level8;

import java.util.Arrays;
//Полученную строку формата long записать в массив типа int, при этом развернуть значение.
public class ReverseArraysDigits {

    public static int[] digitize(long n) {
        char[] symbol = Long.toString(n).toCharArray();
        int[] result = new int[symbol.length];
        System.out.println(Arrays.toString(symbol));
        for (int i = 0; i < symbol.length; i++) {
            result[symbol.length-1-i] = Character.getNumericValue(symbol[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        long num1 = 35231, num2 = 0;
        System.out.println(Arrays.toString(digitize(num1)));
        System.out.println(Arrays.toString(digitize(num2)));

    }
}
