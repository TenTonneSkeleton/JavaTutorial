package Lesson014;

import javax.swing.*;

public class UseRandomMass {
    public static void main(String[] args) {
        String title = "���������� ������";
        ImageIcon img = new ImageIcon("C:\\Users\\raspe\\IdeaProjects\\JavaTutorial\\LearningJava\\src\\Lesson014\\racoon.png");
        int[] size={7,4,2,9};                                       //������� ����������� ���������� �������, �������� ������� ������� ����� ������������ � ������
        char[][] symbMass = new char[size.length][];                //������� ��������� ���������� ������ ��������� ������������ ���������� �����
        char s = 'A';                                               //������ �������������� �������� ���������� � ������� ����� ��������� ������
        String txt="";
        for (int i=0; i<symbMass.length;i++){                       //������� ������ � �������
                symbMass[i] = new char[size[i]];
            txt+="������ �� "+symbMass[i].length+" ��������:\n";

            for (int j=0; j<symbMass[i].length;j++){                //��������� ������� � ��������� �������
                symbMass[i][j]=s;
                s++;
                txt+="| "+symbMass[i][j]+" ";
            }
            txt+="|\n";
        }
        JOptionPane.showMessageDialog(null,
                txt, title, JOptionPane.PLAIN_MESSAGE, img);
    }
}
