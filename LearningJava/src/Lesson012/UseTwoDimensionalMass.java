package Lesson012;

public class UseTwoDimensionalMass {
    public static void main(String[] args) {
        int rows=9,cols=9;
        int[][] table = new int[rows][cols];
        String txt = "\t|\t";                       // Табулирование символа
        for (int i=1;i<=cols;i++){                  // Создаем горизонтальные значения таблицы
            txt += i+"\t";
        }
        txt+="\n";                                  // Перенос строки
        for (int i=1; i<=16+3*cols;i++){            // Создаем горизонтальную линию границы
            txt+="-";
        }
        for (int i=0; i<table.length;i++){          // Создаем вертикальные значения таблицы
            txt+="\n"+(i+1)+"\t|\t";
            for (int j=0; j<table[i].length;j++){   // Заполняем таблицу вертикально, построчно
                table[i][j]=(i+1)*(j+1);
                txt+=table[i][j]+"\t";
            }
        }
        System.out.println(txt);
    }
}
