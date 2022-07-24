package CodeWars.level8;

public class ReplaceAllDots {
    public static String replaceDots(String str) {
        return str.replace(".", "-");
    }

    public static void main(String[] args) {
        String str = "one.two.three";
        System.out.println(replaceDots(str));
    }
}

/*
replace(char, char);
replace(CharSequence, CharSequence);
replaceFirst(String, String);
replaceAll(String, String).
*/