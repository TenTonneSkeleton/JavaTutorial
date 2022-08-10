package CodeWars.level8;

import java.util.Arrays;

//��� ����� ������������ ������ �����. �� ������ ������������� ��� � ���������� ������� (� ������ �������� � �� ������ �������� �������� ASCII), � ����� ������� ������ ��������.
//
//������������ �������� ������ ���� ������� � ����� "***"����� ������ �� ��� ����.
//
//�� �� ������ ������� ��� ��������� �������� ��/� ������.

public class SortStarArrays {

    public static String twoSort(String[] s) {
        String result = "";
        Arrays.sort(s);                                 //��������� ��������� ������
        char[] symbol = s[0].toCharArray();             //��������� ����������� �������� ��������� ������� � ���������� ������
        for (int i = 0; i < s[0].length()-1; i++) {
            result += symbol[i] + "***";                  //������������ ��������� ��������� ������� � ������
            System.out.println(result);
        }
        result+=symbol[symbol.length-1];
        return result;
    }

    public static void main(String[] args) {
        String[] nameMass1 = new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
        String[] nameMass2 = new String[]{"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"};
        System.out.println(twoSort(nameMass1));
        System.out.println(twoSort(nameMass2));

    }
}
