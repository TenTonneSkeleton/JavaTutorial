package CodeWars.level8;

/*������� ������� close_compare ������� ��������� 3 ���������: a, b, � �������������� margin. ������� ������ ���������� �������� a ����, ������ ��� ����, ��� b.
a ��������� �������� � b ���� margin ������ ��� ����� ���������� ����� a � ����� b.
�������� �������� �� ���������:
����� a ������ � b, ������������ 0.

� ��������� ������...
����� a ������ ��� b, ������������ -1.
����� a ������, ��� b, ������������ 1.
���� margin �� ����, �������� ��� ������ ����.

������������: margin >= 0
 */
public class CompareWithinMargin {

    public static int closeCompare(double a, double b) {
        return Double.compare(a, b);
    }

    public static int closeCompare(double a, double b, double margin) {
        //  return Math.abs(a - b) <= margin? 0 : a > b? 1 : -1;
        if ((Math.max(a,b)-Math.min(a,b))<=margin){
            return 0;

        } else {
            return Double.compare(a, b);
        }
    }

    public static void main(String[] args) {
        double a1=4,a2=5,a3=6,a4=-6,a5=2,a6=8.1,a7=1.99;
        double b1=5,b2=5,b3=5,b4=-5,b5=3,b6=3,b7=5;
        double margin5=3, margin6=3, margin7=3;
       System.out.println(closeCompare(a1,b1));
        System.out.println(closeCompare(a2,b2));
        System.out.println(closeCompare(a3,b3));
        System.out.println(closeCompare(a4,b4));
        System.out.println(closeCompare(a5,b5,margin5));
        System.out.println(closeCompare(a6,b6,margin6));
        System.out.println(closeCompare(a7,b7,margin7));


    }
}
