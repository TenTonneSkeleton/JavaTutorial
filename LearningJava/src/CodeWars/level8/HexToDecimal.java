package CodeWars.level8;

public class HexToDecimal {
    public static int hexToDec(final String hexString) {
        return (int) Long.parseLong(hexString, 16);
    }

    public static void main(String[] args) {
        String hex1 = "1", hex2 = "a", hex3 = "10", hex4 = "FF", hex5 = "-C";
        System.out.println(hexToDec(hex1));
        System.out.println(hexToDec(hex2));
        System.out.println(hexToDec(hex3));
        System.out.println(hexToDec(hex4));
        System.out.println(hexToDec(hex5));
    }
}

/*
public class Kata {

  public static int hexToDec(final String hexString) {
    return Integer.parseInt(hexString, 16);
  }

}
*/