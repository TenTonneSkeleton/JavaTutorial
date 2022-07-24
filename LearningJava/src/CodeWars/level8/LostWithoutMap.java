package CodeWars.level8;

public class LostWithoutMap {
    public static int[] map(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
    }
        return arr;
    }

    public static void main(String[] args) {
        int[]arr = new int[] {1,2,3};
        map(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
