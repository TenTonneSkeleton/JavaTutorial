package CodeWars.level8;

//Ваша задача - исправить ошибки в оцифрованном тексте. Вам нужно только исправить следующие ошибки:

//S неверно истолковывается как 5
//O неверно истолковывается как 0
//I неверно истолковывается как 1


public class ReplaceSymbolInString {

    public static String correct(String string) {
        return string.replace("5","s").replace("0", "o").replace("1","i");
    }

    public static void main(String[] args) {
        String varieble = "A bad c0mpr0m15e 1s better than a g00d law5u1t";
        System.out.println(correct(varieble));
    }

}
