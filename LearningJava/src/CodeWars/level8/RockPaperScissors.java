package CodeWars.level8;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        String result="";
        switch (p1){
            case "rock": if (p2=="scissors"){
                result="Player 1 won!";break;
            } else if (p2=="rock"){
                result="Draw!";break;
            } else {
                result="Player 2 won!";break;
            }
            case "scissors": if (p2=="paper"){
                result= "Player 1 won!"; break;
            } else if (p2=="scissors"){
                result= "Draw!";break;
            } else {
                result= "Player 2 won!";break;
            }
            case "paper": if (p2=="rock"){
                result= "Player 1 won!";break;
            } else if (p2=="paper"){
                result= "Draw!";break;
            } else {
                result= "Player 2 won!";break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String p11="rock", p21 = "scissors",
                p12 = "scissors",p22="paper",
                p13="paper", p23 = "scissors";
        System.out.println(rps(p11,p21));
        System.out.println(rps(p12,p22));
        System.out.println(rps(p13,p23));
    }
}
