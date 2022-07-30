package CodeWars.level8;

public class WillThereBeEnoughSpace {
    public static int enough(int cap, int on, int wait){
        return (cap-on-wait>=0) ? 0 : (Math.abs(cap-on-wait));
    }

    public static void main(String[] args) {
        int cap1 = 10, cap2 = 100, cap3 = 20,
                on1 = 5, on3 = 5, on2 = 60,
                wait1 = 5, wait3 = 5, wait2 = 50;
        System.out.println(enough(cap1, on1, wait1));
        System.out.println(enough(cap2, on2, wait2));
        System.out.println(enough(cap3, on3, wait3));

    }
}
