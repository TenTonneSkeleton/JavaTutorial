package Other;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class RegularClocker {
    public static String clocker(String s) {
        char enter = ':';
        Pattern pattern = Pattern.compile("[0-2][0-7]\\:[0-9]{2}");
        //Pattern pattern = Pattern.compile("\\d\\d\\:\\d\\d");             //Тоже верно
        Matcher matcher = pattern.matcher(s);
        if (s.indexOf(enter)==-1){
            return "В тексте не указано время!";
        }
        if (matcher.find()) System.out.println("В тексте совпадения!");
            return s.substring(matcher.start(), matcher.end());
    }

    public static String javaString(String s) {
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(s);
        if (!s.contains("Java")){
            return "В тексте не указано время!";
        }
        if (matcher.find()) System.out.println("В тексте совпадения!");
        return s.substring(matcher.start(), matcher.end());
    }

    public static String javaScriptString(String s) {
        Pattern pattern = Pattern.compile("Java\\[\\^script\\]");
        Matcher matcher = pattern.matcher(s);
        if (!s.contains("Java[^script]")){
            return "В тексте не указано время!";
        }
        if (matcher.find()) System.out.println("В тексте совпадения!");
        return s.substring(matcher.start(), matcher.end());
    }

    public static String color(String s) {
        Pattern pattern = Pattern.compile("\\#[A-Z0-9]{1,6}");
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) System.out.println("В тексте совпадения!");
        return s.substring(matcher.start(), matcher.end());
    }

    public static void main(String[] args) {
        String s1 = "I have breakfast at 07:55";
        String s2 = "It would be nice to have breakfast at 27:00";
        String s3 = "Or don't eat breakfast at all.";
        String s4 = "17:30 - optimal time for breakfast";
        String s5 = "I enjoy learning - Java[^script]";
        String s6 = "My favorite color is #ABCDEF";
        System.out.println(clocker(s1)+"\n");
        System.out.println(clocker(s2)+"\n");
        System.out.println(clocker(s3)+"\n");
        System.out.println(clocker(s4)+"\n");
        System.out.println(javaString(s5)+"\n");
        System.out.println(javaScriptString(s5)+"\n");
        System.out.println(color(s6)+"\n");
    }
}
