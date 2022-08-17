package CodeWars.level8;

public class AbbreviateTwoWordName {

    public static String abbrevName(String name) {
        String[] massResult = name.split(" ");
        return massResult[0].toUpperCase().charAt(0)+"."+massResult[1].toUpperCase().charAt(0);
    }

    public static void main(String[] args) {
        String var1 = "Sam Harris", var2 = "Patrick Feenan", var3 = "Evan Cole", var4 = "P Favuzzi", var5 = "David Mendieta";
        System.out.println(abbrevName(var1));
        System.out.println(abbrevName(var2));
        System.out.println(abbrevName(var3));
        System.out.println(abbrevName(var4));
        System.out.println(abbrevName(var5));
    }
}
