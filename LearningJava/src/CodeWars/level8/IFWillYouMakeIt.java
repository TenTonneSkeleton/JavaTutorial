package CodeWars.level8;

public class IFWillYouMakeIt {

    public static boolean pathCalculation (double distanceToPump, double mpg, double fuelLeft){
        return (distanceToPump<=mpg*fuelLeft) ? true : false;
    }
    public static void main(String[] args) {
        double distanceToPump = 50, mpg=25, fuelLeft=2;
        System.out.println(pathCalculation(distanceToPump,mpg,fuelLeft));
    }
}

/*
return distanceToPump <= mpg * fuelLeft;
 */