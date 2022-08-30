package CodeWars.level8;

public class DeleteSymbolInString {

    static String removeExclamationMarks(String s) {
        return s.replaceAll("!","");
    }

    public static void main(String[] args) {
        String variable = "Hello World!";
        System.out.println(removeExclamationMarks(variable));
    }
}
