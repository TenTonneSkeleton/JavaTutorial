package CodeWars.level8;

public class FindThisPosition {
    public static String position(char alphabet) {
        char letter = 'a';
        int number = 1;
        if (alphabet == 'a') {
            return "Position of alphabet: "+number;         //Число которое складывается к строке принимает тип "строка"
        }
        while (letter != alphabet) {
            letter++;
            number++;
        }
        return "Position of alphabet: "+number;
    }

    public static void main(String[] args) {
        char alphabet1 = 'a';
        System.out.println(position(alphabet1));
        char alphabet2 = 'z';
        System.out.println(position(alphabet2));
        char alphabet3 = 'e';
        System.out.println(position(alphabet3));

    }
}

/* Variant 1
    public class Kata
    {
      public static String position(char alphabet)
      {
        return "Position of alphabet: " + ((int) alphabet - 96);        //Латинская буква принимает целочисленное значение начиная с 97, пример: a = 97, e = 101
      }
    }

 */
