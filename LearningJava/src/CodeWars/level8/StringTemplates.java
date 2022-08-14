package CodeWars.level8;

import java.util.Arrays;

public class StringTemplates {
    public static String buildString(String[] args){
        String result = "I like ";
        for (int i = 0; i < args.length-1; i++) {
            result+=args[i]+", ";
        }
        result+=args[args.length-1]+"!";
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        String[] varieble1 = new String[]{"Cheese","Milk","Chocolate"};
        String[] varieble2 = new String[]{"Cheese","Milk"};
        String[] varieble3 = new String[]{"Chocolate"};
        System.out.println(buildString(varieble1));
        System.out.println(buildString(varieble2));
        System.out.println(buildString(varieble3));

    }
}
