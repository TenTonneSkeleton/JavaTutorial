package CodeWars.level8;

/*
�������� ������� get_char()/ getChar(), ������� ��������� ����� � ���������� ��������������� ������ ASCII ��� ����� ��������.
*/
public class ASCIIValue {
    public static char get_Char (int num){
        return (char)num;
    }


    public static void main(String[] args) {
        int num = 65;
        System.out.println(get_Char(num));
    }
}
