package CodeWars.level8;

//���� ������ - ��������� ������ � ������������ ������. ��� ����� ������ ��������� ��������� ������:

//S ������� ��������������� ��� 5
//O ������� ��������������� ��� 0
//I ������� ��������������� ��� 1


public class ReplaceSymbolInString {

    public static String correct(String string) {
        return string.replace("5","s").replace("0", "o").replace("1","i");
    }

    public static void main(String[] args) {
        String varieble = "A bad c0mpr0m15e 1s better than a g00d law5u1t";
        System.out.println(correct(varieble));
    }

}
