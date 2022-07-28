package CodeWars.level8;

public class CountOfPositives {
    public static int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[]{};
        System.out.println(input.length);
        if (input == null || input.length<1) return result;
        int pos = 0, neg = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                pos++;
            } else {
                neg += input[i];
            }
        }
        result[0] = pos;
        result[1] = neg;
        return result;
    }

    public static String set(int[] result) {
        String txt = "Massive: \n";
        for (int i = 0; i < result.length; i++) {
            txt += result[i] + "\t";
        }
        return txt;
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{0};
        int[] input2 = new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14};
        int[] result1 = countPositivesSumNegatives(input1);
       // int[] result2 = countPositivesSumNegatives(input2);
        System.out.println(set(result1));
       // System.out.println(set(result2));
    }
}
