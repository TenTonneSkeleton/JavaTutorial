package CodeWars.level8;

/*
Напишите функцию get_char()/ getChar(), которая принимает число и возвращает соответствующий символ ASCII для этого значения.
*/
public class ASCIIValue {
    public static char get_Char (int num){
        return (char)num;
    }


    public static void main(String[] args) {
        int num = 65;
        System.out.println(get_Char(num));
    }
}
