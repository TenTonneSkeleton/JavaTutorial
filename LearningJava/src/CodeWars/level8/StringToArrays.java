package CodeWars.level8;

import java.util.Arrays;

public class StringToArrays {

    public static String[] stringToArray(String s) {
        String regex = "[\\s]";
        String[] result = s.split(regex);
        return result;
    }

    public static void main(String[] args) {
        String var1 = "Robin Singh", var2 = "I love arrays they are my favorite";
        System.out.println(Arrays.toString(stringToArray(var1)));
        System.out.println(Arrays.toString(stringToArray(var2)));
    }
}

/*
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
 */