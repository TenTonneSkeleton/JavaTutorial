package CodeWars.level8;

//�������� ��������������� ����� �����, 3��������,
// ������� ������ � �����������: "1 sheep...2 sheep...3 sheep...".
// ���� ������ ����� ��������������, �.�. ������������� ����� ����� �� �����.

public class �oncatenationSheep {

    public static String countingSheep(int num) {
        String result="";
        for (int i = 1; i <= num; i++) {
            result+=i+" sheep...";
        }
        return result;
    }

    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3 = 2, num4 = 3;
        System.out.println(countingSheep(num1));
        System.out.println(countingSheep(num2));
        System.out.println(countingSheep(num3));
        System.out.println(countingSheep(num4));

    }
}
