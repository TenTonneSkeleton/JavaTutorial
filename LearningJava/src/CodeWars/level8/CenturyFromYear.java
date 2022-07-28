package CodeWars.level8;

public class CenturyFromYear {
    public static int century(int number) {
        return (number > number / 100 * 100) ? (number / 100 + 1) : (number / 100);
     /*   if (number>number/100*100){
            return number/100+1;
        } else {
            return number/100;
        }*/
    }

    public static void main(String[] args) {
        int number1 = 1705;
        int number2 = 1900;
        int number3 = 1601;
        int number4 = 2000;
        System.out.println(century(number1));
        System.out.println(century(number2));
        System.out.println(century(number3));
        System.out.println(century(number4));
    }
}

/*
public class Solution {
  public static int century(int number) {
    return (number + 99) / 100;
  }
}
 */

/*
public class Solution {
  public static int century(int number) {

        return ((number % 100 == 0))? (number = number / 100 ) :  (number = (number / 100) + 1);

  }
}
 */
