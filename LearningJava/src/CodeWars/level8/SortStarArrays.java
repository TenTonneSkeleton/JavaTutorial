package CodeWars.level8;

import java.util.Arrays;

//¬ам будет предоставлен список строк. ¬ы должны отсортировать его в алфавитном пор€дке (с учетом регистра и на основе значений символов ASCII), а затем вернуть первое значение.
//
//¬озвращаемое значение должно быть строкой и иметь "***"между каждой из его букв.
//
//¬ы не должны удал€ть или добавл€ть элементы из/в массив.

public class SortStarArrays {

    public static String twoSort(String[] s) {
        String result = "";
        Arrays.sort(s);                                 //сортирует вхожд€щий массив
        char[] symbol = s[0].toCharArray();             //разбивает минимальный эллемент строчного массива в символьный массив
        for (int i = 0; i < s[0].length()-1; i++) {
            result += symbol[i] + "***";                  // онкатенаци€ элементов строчного массива в строку
            System.out.println(result);
        }
        result+=symbol[symbol.length-1];
        return result;
    }

    public static void main(String[] args) {
        String[] nameMass1 = new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
        String[] nameMass2 = new String[]{"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"};
        System.out.println(twoSort(nameMass1));
        System.out.println(twoSort(nameMass2));

    }
}
