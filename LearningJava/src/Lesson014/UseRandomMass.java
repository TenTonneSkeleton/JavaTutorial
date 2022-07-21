package Lesson014;

import javax.swing.*;

public class UseRandomMass {
    public static void main(String[] args) {
        String title = "Символьный массив";
        ImageIcon img = new ImageIcon("C:\\Users\\raspe\\IdeaProjects\\JavaTutorial\\LearningJava\\src\\Lesson014\\racoon.png");
        int[] size={7,4,2,9};                                       //Создаем размерность двумерного массива, указывая сколько стобцов будет использовано в строке
        char[][] symbMass = new char[size.length][];                //Создаем двумерный символьный массив используя определенное количество строк
        char s = 'A';                                               //Задаем первоначальное значение переменной с которой будем заполнять массив
        String txt="";
        for (int i=0; i<symbMass.length;i++){                       //Создаем строку в массиве
                symbMass[i] = new char[size[i]];
            txt+="Строка из "+symbMass[i].length+" столбцов:\n";

            for (int j=0; j<symbMass[i].length;j++){                //Заполняем столбцы в созданных строках
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
