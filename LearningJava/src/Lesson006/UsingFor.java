package Lesson006;
import javax.swing.*;
public class UsingFor {
    public static void main(String[] args) {
        int k=0,s;
        String data = JOptionPane.showInputDialog(null,
                "������� ����������� �����",
                "���������� ����� ���������",
                JOptionPane.INFORMATION_MESSAGE);
        if (data==null){
            JOptionPane.showMessageDialog(null,
                    "�� �� ����� �����",
                    "������",
                    JOptionPane.ERROR_MESSAGE);
        }
        int num=Integer.parseInt(data);
        for (s=1;s<=num;s++){
            k+=s*s;
        }
        JOptionPane.showMessageDialog(null,
                "����� ��������� �� 1 �� "+data+" ����� "+k,
                "���������",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
