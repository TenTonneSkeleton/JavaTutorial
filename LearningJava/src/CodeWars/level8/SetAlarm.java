package CodeWars.level8;

public class SetAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }

    public static void main(String[] args) {
        boolean employed1=true, vacation1=false,
        employed2=false, vacation2=true;
        System.out.println(setAlarm(employed1,vacation1));
        System.out.println(setAlarm(employed2,vacation2));
    }
}
