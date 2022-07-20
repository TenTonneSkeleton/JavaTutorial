package Lesson8;

import javax.swing.JOptionPane;
import java.lang.Math;

class UsingOneMassive {
    public static String title = "���������� ��������";
    public static int intValue;

    public static boolean isNumeric(String number) {

        try {
            intValue = Integer.parseInt(number);
            return true;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "��� �� ������������� �����",
                    title,
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static int pow(int intValue, int j) {
        return (int) Math.pow(intValue, j); //����� intValue �������� � ������� j, ���������� �����
    }

    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog(null, "������� �����:", title, JOptionPane.INFORMATION_MESSAGE);
        if (number != null && isNumeric(number) && intValue > 0) {
            int[] integraNum = new int[10];
            String s = "| ";
            for (int j = 1; j < 10; j++) {
                integraNum[j] = pow(intValue, j);
                s += integraNum[j] + " | ";
            }
            JOptionPane.showMessageDialog(null,
                    "�� ����� �����: " + intValue + "\n������� ������� ����� " + s,
                    title, JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "��� �� ������������� �����",
                    title, JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }


    }

}

