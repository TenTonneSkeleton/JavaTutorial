package Lesson7;

import javax.swing.JOptionPane;

class UsingSwitch {
    static String getDay(int num) {
        String day = "";
        switch (num) {
            case 1:
                day = "�����������";
                break;
            case 2:
                day = "�������";
                break;
            case 3:
                day = "�����";
                break;
            case 4:
                day = "�������";
                break;
            case 5:
                day = "�������";
                break;
            case 6:
                day = "�������";
                break;
            case 7:
                day = "�����������";
                break;
            default:
                day = "������ ��� �� ����������";
        }
        return day;
    }

    static String checkDay(int num) {
        String day = "";
        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                day = "�������";
                break;
            case 6:
            case 7:
                day = "��������";
                break;
            default:
                day = "������ ��� �� ����������";
        }
        System.out.println(num);
        System.out.println(day);
        return day;
    }

    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog(null,
                "������� ����� ���",
                "��������� ����",
                JOptionPane.INFORMATION_MESSAGE);
        int num = Integer.parseInt(data);
        JOptionPane.showMessageDialog(null,
                "�� ����� ����� " + data + "\n�� �������� " + getDay(num) + "\n�� �������� " + checkDay(num), "����������", JOptionPane.INFORMATION_MESSAGE);

    }
}
