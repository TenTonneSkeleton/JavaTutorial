package CodeWars.level8;

public class ReverseWordInStrings {

    public static String reverseWords(String str){
        String[] words = str.split(" ");
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i]=words[words.length-1-i];
        }
        return String.join(" ", result);
    }

    public static void main(String[] args) {
        String var1 = "I like eating";
        String var2 = "I like flying";
        String var3 = "The world is nice";
        System.out.println(reverseWords(var1));
        System.out.println(reverseWords(var2));
        System.out.println(reverseWords(var3));
    }
}

/*
     public static String reverseWords(String str){
     //write your code here...
     List Words = Arrays.asList(str.split(" "));
     Collections.reverse(Words);
     return String.join(" ", Words);
 }
 */
