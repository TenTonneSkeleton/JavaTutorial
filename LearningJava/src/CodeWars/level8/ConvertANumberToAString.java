package CodeWars.level8;

public class ConvertANumberToAString {
    public static String numberToString(int num) {
        String s = "";
        return s += num;
    }

    public static void main(String[] args) {
        int num = 67;
        System.out.println(numberToString(num));
    }
}

/* Variant
class Kata {
  public static String numberToString(int num) {
    return String.valueOf(num);
  }
}
 */
