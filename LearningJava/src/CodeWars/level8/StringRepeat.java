package CodeWars.level8;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    public static void main(String[] args) {
        final int repeat = 4;
        final String string = "a";
        System.out.println(repeatStr(repeat,string));
    }
}
