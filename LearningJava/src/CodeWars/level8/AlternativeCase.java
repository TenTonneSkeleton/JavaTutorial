package CodeWars.level8;

import java.util.Arrays;

public class AlternativeCase {

    public static String toAlternativeString(String string) {
        String result = "";
        char[] symbol = string.toCharArray();    // ��������� ������ �� ������ ��������
        for (int i = 0; i < string.length(); i++) {  // �������� �� ������� �������
            result += Character.isUpperCase(symbol[i]) ? Character.toLowerCase(symbol[i]) : Character.toUpperCase(symbol[i]);  // ��������� ������ �� �������
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
