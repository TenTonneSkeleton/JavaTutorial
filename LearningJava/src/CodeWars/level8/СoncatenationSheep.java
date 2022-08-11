package CodeWars.level8;

//Учитывая неотрицательное целое число, 3например,
// вернуть строку с бормотанием: "1 sheep...2 sheep...3 sheep...".
// Ввод всегда будет действительным, т.е. отрицательных целых чисел не будет.

public class СoncatenationSheep {

    public static String countingSheep(int num) {
        String result="";
        for (int i = 1; i <= num; i++) {
            result+=i+" sheep...";
        }
        return result;
    }

    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3 = 2, num4 = 3;
        System.out.println(countingSheep(num1));
        System.out.println(countingSheep(num2));
        System.out.println(countingSheep(num3));
        System.out.println(countingSheep(num4));

    }
}
