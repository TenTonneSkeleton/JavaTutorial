package CodeWars.level8;

public class CountingSheep {
    public static int countSheeps(Boolean[] arrayOfSheeps) { //Boolean - true, false, null // boolean true, false
        int sum=0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i]==true) {
                sum+=1;
            } else if (arrayOfSheeps[i] == null) {
                sum+=0;
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
