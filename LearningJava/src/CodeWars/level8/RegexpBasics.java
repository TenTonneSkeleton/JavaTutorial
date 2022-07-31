package CodeWars.level8;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class RegexpBasics {
    public static boolean isDigit(String s) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher isNum = pattern.matcher(s);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1= "", s2="7", s3=" ", s4="a", s5="a5", s6="14";
        System.out.println(isDigit(s1));
        System.out.println(isDigit(s2));
        System.out.println(isDigit(s3));
        System.out.println(isDigit(s4));
        System.out.println(isDigit(s5));
        System.out.println(isDigit(s6));
    }
}
