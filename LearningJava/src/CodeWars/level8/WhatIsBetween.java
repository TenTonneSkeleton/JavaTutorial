package CodeWars.level8;

import java.util.Arrays;

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        int[] result = new int[Math.abs(b-a)+1];
        for (int i =0; i<=(b-a); i++){
            result[i] = a+i;
        }
        return result;
    }

    public static void main(String[] args) {
        int vara1 = 1, varb1 = 4, vara2 = -2, varb2 = 2;
        System.out.println(Arrays.toString(between(vara1,varb1)));
        System.out.println(Arrays.toString(between(vara2,varb2)));
    }
}
