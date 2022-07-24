package Lesson016;

import javax.swing.*;

class UseExtends extends JOptionPane {
    static void showMessage(String txt, String title){              //Метод для отображения результатов txt
        showMessageDialog(null, txt, title, PLAIN_MESSAGE, new ImageIcon("C:\\Users\\raspe\\IdeaProjects\\JavaTutorial\\LearningJava\\src\\Lesson016\\racoon.png"));
    }
    static void showMessage(String txt){
        showMessage(txt, "Сообщение");
    }
    static int getInteger(String txt){                              //Метод возвращающий введенное значение в int
        String res;
        res=showInputDialog(null, txt, "Число по умолчанию 10", QUESTION_MESSAGE);
        if (res==null){
            return 10;
        } else {
            return Integer.parseInt(res);
        }
    }
    }
class ExtendingJOptionPane{
    public static void main(String[] args) {
        UseExtends.showMessage("Всем привет!");
        int number;
        number=UseExtends.getInteger("Введите целое число");
        String txt = "Числа от 1 до "+number+":\n";
        for (int i = 1; i <=number; i++) {
            txt+=i+" ";
        }
        UseExtends.showMessage(txt,"Перечисляем числа");
    }
}