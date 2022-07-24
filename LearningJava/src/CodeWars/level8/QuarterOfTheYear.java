package CodeWars.level8;

public class QuarterOfTheYear {
    public static int quarterOf(int month) {
        switch (month){
            case 1: case 2: case 3: month=1; break;
            case 4: case 5: case 6: month=2; break;
            case 7: case 8: case 9: month=3; break;
            case 10: case 11: case 12: month=4; break;

        }
            return month;

    }
}

/* //Variant 1
interface Kata {
  static int quarterOf(int month) {
    return (int) Math.ceil(month / 3.);
  }
}
 */

/* // Variant 2
 public class Kata {

    public static int quarterOf(int month) {
        return (month+2)/3;
    }
} */
