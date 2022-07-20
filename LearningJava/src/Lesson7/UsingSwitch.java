package Lesson7;

import javax.swing.JOptionPane;

class UsingSwitch {
    static String getDay(int num) {
        String day = "";
        switch (num) {
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
                day = "Суббота";
                break;
            case 7:
                day = "Воскресенье";
                break;
            default:
                day = "Такого дня не существует";
        }
        return day;
    }

    static String checkDay(int num) {
        String day = "";
        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                day = "Буднями";
                break;
            case 6:
            case 7:
                day = "Выходным";
                break;
            default:
                day = "Такого дня не существует";
        }
        System.out.println(num);
        System.out.println(day);
        return day;
    }

    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog(null,
                "Введите номер дня",
                "Вычисляем день",
                JOptionPane.INFORMATION_MESSAGE);
        int num = Integer.parseInt(data);
        JOptionPane.showMessageDialog(null,
                "Вы ввели число " + data + "\nОн является " + getDay(num) + "\nОн является " + checkDay(num), "Подзравляю", JOptionPane.INFORMATION_MESSAGE);

    }
}
