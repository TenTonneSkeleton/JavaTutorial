package CodeWars.level8;

public class ReversedStrings {

    //��������� ������� ���, ����� ��� ����������� ���������� � ���� ������.
        // 'world'  =>  'dlrow'
        // 'word'   =>  'drow'

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "world";
        System.out.println(solution(str1));
    }
}
