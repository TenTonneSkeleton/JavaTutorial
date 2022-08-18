package CodeWars.level8;

public class ConcationArrayString {
    public static String sayHello(String [] name, String city, String state){
        String result ="Hello, ";
        for (int i = 0; i < name.length-1; i++) {
            result+=name[i]+" ";
        }
        return result+=name[name.length-1]+"! Welcome to "+city+", "+state+"!";
    }

    public static void main(String[] args) {
        String[] varName = new String[]{"John", "Smith"};
        String varCity = "Phoenix", varState = "Arizona";
        System.out.println(sayHello(varName,varCity,varState));
    }
}

/*
public class Hello{
  public String sayHello(String[] name, String city, String state){
    return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);
  }
}
 */
