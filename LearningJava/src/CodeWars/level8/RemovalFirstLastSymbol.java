package CodeWars.level8;

//��� �������� ������. ���� ���� � ������� �������, ������� ������� ������ � ��������� ������� ������.
//��� ��� ���� ��������, �������� ������. ��� �� ����� ������������ � �������, ���������� ����� ���� ��������.

public class RemovalFirstLastSymbol {
    public static String remove(String str) {
        String result ="";
        char[] arraySymbol = str.toCharArray();
        for (int i = 1; i < arraySymbol.length-1 ; i++) {
            result+=arraySymbol[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String var1 = "eloquent", var2 = "country", var3 = "person", var4 = "place";
        System.out.println(remove(var1));
        System.out.println(remove(var2));
        System.out.println(remove(var3));
        System.out.println(remove(var4));
    }
}

/*
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
 */