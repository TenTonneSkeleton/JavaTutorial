package Lesson005;

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
                "Введите любое число",
                "Вычисление бинарного числа",
                JOptionPane.INFORMATION_MESSAGE);
        if (input == null) {
            JOptionPane.showMessageDialog(null,
                    "Вы ничего не ввели",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        int num = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null,
                "Вы ввели число: " + num + "\n" + "Бинарное код числа " + coder(num),
                "Поздравляю",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
