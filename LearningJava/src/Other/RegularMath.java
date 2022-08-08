package Other;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularMath {
    public static String[] searchMath(String s) {
        String[] result;
        String regexNum;
        if (s.contains(" ")) {
            regexNum = "\\s+\\W\\s+";
        } else {
            regexNum = "(?<=[\\d+])[\\-*/+](?=\\d+)";
        }
        result = s.split(regexNum);
        return result;
    }

    public static String searchSymbol(String s) {
        String regexSymbol = "[^\\-][+*\\-/]";
        Pattern pattern = Pattern.compile(regexSymbol);
        Matcher matcher = pattern.matcher(s);
        boolean b = matcher.find(); // if (matcher.find()) {}
        return s.substring(matcher.start(), matcher.end());
    }

    public static String searchSymbolNotSpace(String s) {
        String regexSymbol = "[+*\\-/]";
        Pattern pattern = Pattern.compile(regexSymbol);
        Matcher matcher = pattern.matcher(s);
        boolean b = matcher.find(); // if (matcher.find()) {}
        return s.substring(matcher.start(), matcher.end());
    }

    public static void main(String[] args) {
        String[] arrayMath = new String[]{"1 + 2", "1.2 *   3.4", "-3  / -6", "-2-2", "-2.65  * 2.35", "2.2-3.456"};
        String[][] resultArrays = new String[arrayMath.length][3];
        for (int i = 0; i < arrayMath.length; i++) {
            String[] getNum = searchMath(arrayMath[i]);
            String getSymbol = searchSymbolNotSpace(searchSymbol(arrayMath[i]));
            System.arraycopy(getNum, 0, resultArrays[i], 0, 2); //for (int j = 0; j < 2; j++) {resultArrays[i][j] = getNum[j];} мой вариант
            for (int j = 2; j <= 2; j++) {
                resultArrays[i][2] = getSymbol;
            }
        }
        for (String[] strings : resultArrays) { // (int i = 0; i < resultArrays.length; i++)
            System.out.println("Первое число: " + strings[0]);
            System.out.println("Второе число: " + strings[1]);
            System.out.println("Знак операции: " + strings[2]);
            System.out.println("----------------");
        }
    }
}
