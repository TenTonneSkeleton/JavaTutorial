package Other;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularMath {
    public static String searchMath (String[] s) {
        String regexnum = "\\-?\\d+\\.?\\d?";
        String regexnum2 = "[0-9]";
        String regexsym = "";
        String[] result = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            Pattern pattern = Pattern.compile(regexnum);
            Matcher matcher = pattern.matcher(s[i]);
            if (matcher.find()){
            System.out.println(matcher.group());
            }

        }
        return "Helo";

    }

    public static void main(String[] args) {
        String[] arrayMath = new String[] {"1 + 2", "1.2 *   3.4", "-3  / -6", "-2-2"};
        System.out.println(searchMath(arrayMath));
    }
}
