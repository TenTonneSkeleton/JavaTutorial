package Lesson2;

import javax.swing.*;

class UsingIF {
    public static void main(String[] args) {
        String input, text, title;
        int number;
        ImageIcon img;
        input = JOptionPane.showInputDialog(null,
                "Введите число",
                "Определение числа",
                JOptionPane.INFORMATION_MESSAGE);
        if (input == null) {
            JOptionPane.showMessageDialog(null,
                    "Вы ввели не число",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        number=Integer.parseInt(input);

        if (number%2==0){
            img=new ImageIcon("d:/2.jpg");
            text = "Введенное число "+number+" четное!";
            title = "Четное число";
        } else {
            img=new ImageIcon("d:/1.jpg");
            text = "Введенное число "+number+" нечетное!";
            title = "Нечетное число";
        }
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.PLAIN_MESSAGE,img);
    }
}
