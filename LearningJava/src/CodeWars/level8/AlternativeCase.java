package CodeWars.level8;

import java.util.Arrays;

public class AlternativeCase {

    public static String toAlternativeString(String string) {
        String result = "";
        char[] symbol = string.toCharArray();    // Разбиваем строку на массив символов
        for (int i = 0; i < string.length(); i++) {  // Проходим по каждому символу
            result += Character.isUpperCase(symbol[i]) ? Character.toLowerCase(symbol[i]) : Character.toUpperCase(symbol[i]);  // Проверяем символ на регистр
            }
        return result;
        }


    public static void main(String[] args) {
        String h1 = "HELLO WORLD", h2 = "HELLO world", h3 = "hello WORLD";
        System.out.println(toAlternativeString(h1));
        System.out.println(toAlternativeString(h2));
        System.out.println(toAlternativeString(h3));

    }
}
