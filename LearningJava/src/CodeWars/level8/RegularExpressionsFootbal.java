package CodeWars.level8;

/*
Наша футбольная команда завершила чемпионат. Результат каждого совпадения выглядит как "x:y". Результаты всех матчей фиксируются в сборнике.
Например: ["3:1", "2:2", "0:1", ...]
Напишите функцию, которая берет такую  коллекцию и считает очки нашей команды в чемпионате. Правила подсчета очков за каждый матч:

    если х > у: 3 балла
    если х < у: 0 баллов
    если х = у: 1 балл
*/

public class RegularExpressionsFootbal {

    public static int points(String[] games) {
        int count = 0;
        String regex = ":";
        for (int i = 0; i < games.length; i++) {
            String[] result = games[i].split(regex);
            if (Integer.parseInt(result[0])>Integer.parseInt(result[1])){
                count+=3;
            } else if (Integer.parseInt(result[0])<Integer.parseInt(result[1])) {
                count+=0;
            } else {
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] DateMassive1 = new String[]{"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
        String[] DateMassive2 = new String[]{"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"};
        String[] DateMassive3 = new String[]{"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"};
        String[] DateMassive4 = new String[]{"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"};
        String[] DateMassive5 = new String[]{"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"};
        System.out.println(points(DateMassive1));
        System.out.println(points(DateMassive2));
        System.out.println(points(DateMassive3));
        System.out.println(points(DateMassive4));
        System.out.println(points(DateMassive5));

        }
    }
