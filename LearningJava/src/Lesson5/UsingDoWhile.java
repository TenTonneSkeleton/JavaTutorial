package Lesson5;

import javax.swing.*;

class UsingDoWhile {
    static String coder(int number) {
        String s = "";
        int n = number;
        do {
            s = (n % 2) + s;
            n /= 2;
        } while (n != 0);
        return s;
    }

    public static void main(String[] args) {
        String input;
        input = JOptionPane.showInputDialog(null,
                "������� ����� �����",
                "���������� ��������� �����",
                JOptionPane.INFORMATION_MESSAGE);
        if (input == null) {
            JOptionPane.showMessageDialog(null,
                    "�� ������ �� �����",
                    "������",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        int num = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null,
                "�� ����� �����: " + num + "\n" + "�������� ��� ����� " + coder(num),
                "����������",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
