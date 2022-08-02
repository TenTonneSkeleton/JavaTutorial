package Other;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularMath {
    public static String searchMath (String[] s) {
        String regexNum = "\\s+\\W\\s+";
        //System.out.println(Arrays.toString(s[0].split(regexNum)));
       // System.out.println(Arrays.toString(s[1].split(regexNum)));
        String[][] result = new String[][]{};

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = s[i].split(regexNum);
            }
            }
        System.out.println(result[0][0]);
        System.out.println(result[0][1]);
        return "Helo";
        }


    public static void main(String[] args) {
        String[] arrayMath = new String[] {"1 + 2", "1.2 *   3.4", "-3  / -6", "-2-2"};
        System.out.println(searchMath(arrayMath));
    }
}
