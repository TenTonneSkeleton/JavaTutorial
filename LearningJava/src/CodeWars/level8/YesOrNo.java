package CodeWars.level8;

public class YesOrNo {
    public static String boolToWord(boolean b)
    {
        String i="";
        if(b==true){
            return i="yes";
        } else {
            return i="no";
        }
    }

    public static void main(String[] args) {
        boolean b = true;
        System.out.println(boolToWord(b));
    }
}


/* Variant
class YesOrNo // переменная x = (выражение) ? значение if true : значение if false
{
  public static String boolToWord(boolean b)
  {
    return b ? "Yes" : "No";
  }
}
 */