package Lesson4;

import javax.swing.*;

class UsingWhile {
    static int decoder(String code) {
        int n = code.length();
        int s = 0, k = 1, q = 1, a;
        while (k <= n) {
            if (code.charAt(n - k) == '1') {
                a = 1;
            } else {
                a = 0;
            }
            s += q * a;
            q *= 2;
            k++;
            System.out.println(s);
        }
        return s;
    }

    public static void main(String[] args) {
        String input;
        String title= "����������� ��������� ����";
        input=JOptionPane.showInputDialog(null,
                "������� �������� ���",
                "�������",
                JOptionPane.QUESTION_MESSAGE);
        if (input==null){
            System.exit(0);
        }
        int num = decoder(input);
        String text = "�� ����� �������� ���: "+input;
        text += "\n��� ������������� �����: "+num;
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }

}
