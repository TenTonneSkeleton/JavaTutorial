package CodeWars.level8;

//� ���� ���� ��� ����� ��������� ��������������� ������ (x) �� ������� ������� ���� ������� � ������ ���� ������.
//���� ���� ���� ��� ��� ������� ����, ������� �������������!�, ���� �� ������ 2, ������� ���� �����!�.
//���� ��� ������� ����, ��� ��� ����� ������, ������� �Fail!�.

public class GoodBad {

    public static String well(String[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i]=="good") {count++;}
        }
        if (count<1){
            return "Fail!";
        } else if (count>2){
            return "I smell a series!";
        } else {
            return "Publish!";
        }
    }

    public static void main(String[] args) {
        String[] str1 = new String[]{"bad", "bad", "bad"};
        String[] str2 = new String[]{"good", "bad", "bad", "bad", "bad"};
        String[] str3 = new String[]{"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"};
    }
}
