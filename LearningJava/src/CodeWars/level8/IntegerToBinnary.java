package CodeWars.level8;

public class IntegerToBinnary {

    public static String stringy(int size) {
        return "Your string should start with a "+"10".repeat(size/2)+(size%2 == 1? "1" :"");
    }

    public static void main(String[] args) {
        int var1 = 12;
        System.out.println(stringy(var1));
    }
}
