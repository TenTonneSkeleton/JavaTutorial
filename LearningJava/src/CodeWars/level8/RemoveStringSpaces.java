package CodeWars.level8;

public class RemoveStringSpaces {
    public static String noSpace(String x) {
        x = x.replaceAll("[^A-Za-zР-пр-џ0-9]", "");
        return x;
    }

    public static void main(String[] args) {
        String x = "8 j 8   mBliB8g  imjB8B8  jl  B";
        System.out.println(noSpace(x));
    }
}


/* // Variant 1
    static String noSpace(final String x) {
        return x.replace(" ", "");
    }
 */