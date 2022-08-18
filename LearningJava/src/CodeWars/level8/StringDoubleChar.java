package CodeWars.level8;

public class StringDoubleChar {
    public static String doubleChar(String s){
        String result = "";
        char[] arraySymbol = s.toCharArray();
        for (char r:arraySymbol){
            result+=r;
            result+=r;
        }
        return result;
    }

    public static void main(String[] args) {
        String var1 = "String", var2 = "Hello World", var3 = "1234!_ ";
        System.out.println(doubleChar(var1));
        System.out.println(doubleChar(var2));
        System.out.println(doubleChar(var3));
    }
}

/*
  public static String doubleChar(String s){
     return s.replaceAll(".", "$0$0");
  }
 */
