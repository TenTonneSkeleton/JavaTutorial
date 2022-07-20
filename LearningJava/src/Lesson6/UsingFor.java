package Lesson6;
import javax.swing.*;
public class UsingFor {
    public static void main(String[] args) {
        int k=0,s;
        String data = JOptionPane.showInputDialog(null,
                "Введите необходимое число",
                "Вычисление суммы квадратов",
                JOptionPane.INFORMATION_MESSAGE);
        if (data==null){
            JOptionPane.showMessageDialog(null,
                    "Вы не ввели число",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        }
        int num=Integer.parseInt(data);
        for (s=1;s<=num;s++){
            k+=s*s;
        }
        JOptionPane.showMessageDialog(null,
                "Сумма квадратов от 1 до "+data+" равна "+k,
                "Выполнено",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
