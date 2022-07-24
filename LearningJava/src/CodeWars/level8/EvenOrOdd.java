package CodeWars.level8;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        String s="";
        return s =(number==number/2*2) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int number = 7;
        System.out.println(even_or_odd(number));
    }
}

/* Variant //Делит левый операнд на правый операнд и возвращает остато
public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return (number%2 == 0) ? "Even" : "Odd";
    }
}
 */