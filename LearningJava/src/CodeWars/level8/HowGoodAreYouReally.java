package CodeWars.level8;

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int s=0;
        for (int i = 0; i < classPoints.length; i++) {
            s=s+classPoints[i];
        }
        s/= classPoints.length;
        if (s<yourPoints){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] classPoints = new int[] {100, 40, 34, 57, 29, 72, 57, 88};
        int yourPoints=75;
        System.out.println(betterThanAverage(classPoints, yourPoints));
    }
}

/* Variant
import java.util.Arrays;

class Kata {
    static boolean betterThanAverage(final int[] classPoints, final int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
}
 */
