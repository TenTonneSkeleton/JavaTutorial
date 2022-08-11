package CodeWars.level8;

public class ConvertStringToANumber {

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        String varieble1 = "1234", varieble2="605", varieble3="1405", varieble4="-7";
        System.out.println(stringToNumber(varieble1));
        System.out.println(stringToNumber(varieble2));
        System.out.println(stringToNumber(varieble3));
        System.out.println(stringToNumber(varieble4));

    }
}
