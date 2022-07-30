package CodeWars.level8;

public class CountByX {
    public static int[] countBy(int x, int n){
        int[] result = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            result[i] = x+x*count;
            count++;
            System.out.println(result[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int x1 = 1, x2 = 2, x3 = 3;
        int n1 = 10, n2 = 5, n3 = 7;
        int[] xn1 = countBy(x1,n1);
        int[] xn2 = countBy(x2,n2);
    }
}
