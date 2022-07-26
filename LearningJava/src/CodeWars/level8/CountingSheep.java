package CodeWars.level8;

public class CountingSheep {
    public static int countSheeps(Boolean[] arrayOfSheeps) { //Boolean - true, false, null // boolean true, false
        int sum=0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == null) {
                sum+=0;
            } else if (arrayOfSheeps[i]==true) {
                sum+=1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Boolean[] arrayOfSheeps = new Boolean[]{true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  null,  true ,
                false, false, true,  true};
        System.out.println(countSheeps(arrayOfSheeps));

    }
}

/* Variant 1
public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int counter = 0;
    for (Boolean present : arrayOfSheeps) {
      if (present != null && present) {
        counter += 1;
      }
    }
    return counter;
  }
}
 */

/* Variant 2
import java.util.Arrays;
import java.util.Collections;

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
  }
}
 */
