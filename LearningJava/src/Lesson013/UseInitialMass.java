package Lesson013;

public class UseInitialMass {
    static void show(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print("\t" + nums[i][j] + "\t");
            }
            System.out.println("");

        }

    }

    public static void main(String[] args) {
        int[][] alpha = {{1, 2, 3}, {4, 5, 6}};
        int[][] bravo = {{4, 3, 2, 1}, {3, 2, 1}, {2, 1}, {1}};
        System.out.println("\tMassive: alpha");
        show(alpha);
        System.out.println("\tMassive: bravo");
        show(bravo);
    }
}