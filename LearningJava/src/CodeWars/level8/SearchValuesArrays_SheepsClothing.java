package CodeWars.level8;

public class SearchValuesArrays_SheepsClothing {

    public static String warnTheSheep(String[] array) {
        String variable = "wolf";
        if (variable.equals(array[array.length-1])) {return "Pls go away and stop eating my sheep";}
        for (int i = array.length-1; i < array.length; i--) {
            if (variable.equals(array[i])){
                return "Oi! Sheep number "+((array.length-1)-i)+"! You are about to be eaten by a wolf!";
            }
        }
        return "Not wolf!";
    }

    public static void main(String[] args) {
        String[] getArrays1 = new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"};
        String[] getArrays2 = new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"};
        String[] getArrays3 = new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"};
        String[] getArrays4 = new String[]{"sheep", "wolf", "sheep"};
        String[] getArrays5 = new String[]{"sheep", "sheep", "wolf"};
        System.out.println(warnTheSheep(getArrays1));
        System.out.println(warnTheSheep(getArrays2));
        System.out.println(warnTheSheep(getArrays3));
        System.out.println(warnTheSheep(getArrays4));
        System.out.println(warnTheSheep(getArrays5));
    }
}


/*
public static String warnTheSheep(String[] array) {
Collections.reverse(Arrays.asList(array));
int pos = Arrays.asList(array).indexOf("wolf");
return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
}
 */