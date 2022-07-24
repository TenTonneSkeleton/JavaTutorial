package Lesson016;

import javax.swing.*;

class UseExtends extends JOptionPane {
    static void showMessage(String txt, String title){              //����� ��� ����������� ����������� txt
        showMessageDialog(null, txt, title, PLAIN_MESSAGE, new ImageIcon("C:\\Users\\raspe\\IdeaProjects\\JavaTutorial\\LearningJava\\src\\Lesson016\\racoon.png"));
    }
    static void showMessage(String txt){
        showMessage(txt, "���������");
    }
    static int getInteger(String txt){                              //����� ������������ ��������� �������� � int
        String res;
        res=showInputDialog(null, txt, "����� �� ��������� 10", QUESTION_MESSAGE);
        if (res==null){
            return 10;
        } else {
            return Integer.parseInt(res);
        }
    }
    }
class ExtendingJOptionPane{
    public static void main(String[] args) {
        UseExtends.showMessage("���� ������!");
        int number;
        number=UseExtends.getInteger("������� ����� �����");
        String txt = "����� �� 1 �� "+number+":\n";
        for (int i = 1; i <=number; i++) {
            txt+=i+" ";
        }
        UseExtends.showMessage(txt,"����������� �����");
    }
}