package Lesson002;

import javax.swing.*;

class UsingIF {
    public static void main(String[] args) {
        String input, text, title;
        int number;
        ImageIcon img;
        input = JOptionPane.showInputDialog(null,
                "������� �����",
                "����������� �����",
                JOptionPane.INFORMATION_MESSAGE);
        if (input == null) {
            JOptionPane.showMessageDialog(null,
                    "�� ����� �� �����",
                    "������",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        number=Integer.parseInt(input);

        if (number%2==0){
            img=new ImageIcon("d:/2.jpg");
            text = "��������� ����� "+number+" ������!";
            title = "������ �����";
        } else {
            img=new ImageIcon("d:/1.jpg");
            text = "��������� ����� "+number+" ��������!";
            title = "�������� �����";
        }
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.PLAIN_MESSAGE,img);
    }
}
