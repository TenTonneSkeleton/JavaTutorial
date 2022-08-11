package CodeWars.level8;

public class CharArraysFakeBinary {
    public static String fakeBin(String numberString) {
        String result = "";
        char[] symbol = numberString.toCharArray();             //разбивает минимальный эллемент строчного массива в символьный массив
        for (int i = 0; i < numberString.length(); i++) {
            if (symbol[i] < '5') {
                result += "0";
            } else {
                result += "1";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String num1 = "45385593107843568";
        String num2 = "509321967506747";
        String num3 = "366058562030849490134388085";
        System.out.println(fakeBin(num1));
        System.out.println(fakeBin(num2));
        System.out.println(fakeBin(num3));
    }
}

/*
public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
 */
