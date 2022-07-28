package CodeWars.level8;

public class DoIGetABouns {
    public static String bonusTime(final int salary, final boolean bonus) {
        char unichar = '\u00A3';
        if (bonus){
            return ""+unichar+salary*10;

        } else {
            return ""+unichar+salary;
        }
    }

    public static void main(String[] args) {
        int salary1 = 10000;    boolean bonus1 = true;
        int salary2 = 25000;    boolean bonus2 = true;
        int salary3 = 10000;    boolean bonus3 = false;
        int salary4 = 60000;    boolean bonus4 = false;
        System.out.println(bonusTime(salary1,bonus1));
        System.out.println(bonusTime(salary2,bonus2));
        System.out.println(bonusTime(salary3,bonus3));
        System.out.println(bonusTime(salary4,bonus4));

    }
}


/* Variant
public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    return "\u00A3" + (bonus ? 10 : 1) * salary;
  }
}
 */