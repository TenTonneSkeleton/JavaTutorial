package CodeWars.level8;

public class Dolmatines {

    public static String howManyDalmations(int number){

        String[] dogs = new String[]{"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIONS!!!"};

        return (number <= 10) ? dogs[0] : (number <= 50 ? dogs[1] : (number <= 100 ? dogs[2] : dogs[3]));
    }

    public static void main(String[] args) {
        int var1 = 26, var2 = 8, var3 = 14, var4 = 80, var5 = 100, var6 = 101;
        System.out.println(howManyDalmations(var1));
        System.out.println(howManyDalmations(var2));
        System.out.println(howManyDalmations(var3));
        System.out.println(howManyDalmations(var4));
        System.out.println(howManyDalmations(var5));
        System.out.println(howManyDalmations(var6));

    }
}
