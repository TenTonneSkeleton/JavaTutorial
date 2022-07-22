package Lesson015;

public class UseMethodMass {
    static void A(int[][] massA){
        for (int i = 0; i <massA.length; i++) {
            for (int j = 0; j <massA[i].length; j++) {
                System.out.print(massA[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void B(int[] massB){
        for (int i = 0; i <massB.length ; i++) {
            System.out.print(massB[i]+"\t");
        }
        System.out.println();
    }

    static void C(int[][] massA, int[] massB){
        int[] massC = new int[massA.length];
        for (int i = 0; i <massA.length; i++) {
            for (int j = 0; j <massA[i].length; j++) {
                massC[i]+=massA[i][j]*massB[i];
            }
            System.out.print(massC[i]+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] massA = {{1, 2, 3, 4},{4,6,7,8},{9,8,7,6}};
        int[] massB = {4,3,2,1};
        System.out.println("Massive A:");
        A(massA);
        System.out.println("Massive B:");
        B(massB);
        System.out.println("Massive C:");
        C(massA, massB);

    }
}
