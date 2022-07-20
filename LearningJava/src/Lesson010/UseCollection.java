package Lesson010;

import javax.swing.*;
import java.util.Random;
//������� ���������� ������ �� ��������� ������������� �����
//� ������� ������������ � ������������� ����� ��������� �������������.
//����� ��������� ���������� ������ ������ for � ���������� ��� � ������.
public class UseCollection {
    static int intValueMin, intValueMax;
    static String title = "Working with collections";

    static boolean isNumericMin(String min) {
        try {
            intValueMin = Integer.parseInt(min);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "������! ������� ������������� �����",
                    title,
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    static boolean isNumericMax(String max) {
        try {
            intValueMax = Integer.parseInt(max);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "������! ������� ������������� �����",
                    title,
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static void main(String[] args) {
        int size = 10;
        String text = "Create an array\n|";
        Random rndm = new Random();
        String min = JOptionPane.showInputDialog(null, "����������� ����� �����", title, JOptionPane.PLAIN_MESSAGE);
        if (isNumericMin(min) == false) { // Checking the minimum number
            System.exit(0);
        } else if (intValueMin == 0) {
            JOptionPane.showMessageDialog(null,
                    "������! 0 - ��� �� �����",
                    title,
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        String max = JOptionPane.showInputDialog(null, "������������ ����� �����", title, JOptionPane.PLAIN_MESSAGE);
        if (isNumericMax(max) == false) { // Checking the maximum number
            System.exit(0);
        } else if (intValueMax == 0) {
            JOptionPane.showMessageDialog(null,
                    "������! 0 - ��� �� �����",
                    title,
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (min != null && max != null && intValueMin != 0 && intValueMax != 0) {
            int diff = intValueMax - intValueMin;
            System.out.println(diff);
            int[] nums = new int[size];
            for (int k = 0; k < nums.length; k++) {
                nums[k] = rndm.nextInt(diff) + intValueMin;
                text += " " + nums[k] + " |";
            }
            text += "\nChecking the array\n|";
            for (int j : nums) { // ���������� ������ ������� � ������� ��������
                text += " " + j + " |";
            }
            JOptionPane.showMessageDialog(null, text, title, JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "������! ������� ������������� �����",
                    title,
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

    }
}
