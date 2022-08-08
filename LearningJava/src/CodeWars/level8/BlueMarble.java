package CodeWars.level8;

/*
Вы решили написать функцию, guessBlue()помогающую автоматически вычислять, следует ли угадывать «синий» или «красный».

Функция должна принимать четыре аргумента:
количество синих шариков, которые вы положили в мешок, чтобы начать
количество красных шариков, которые вы положили в мешок, чтобы начать
количество вытащенных синих шариков (всегда меньше, чем начальное количество синих шариков)
количество вытащенных красных шариков (всегда меньше начального количества красных шариков)

guessBlue()должен возвращать вероятность рисования синего шарика, выраженную в виде числа с плавающей запятой.
Например, guessBlue(5, 5, 2, 3)должен вернуть 0.6.

 */

public class BlueMarble {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        return (double) (blueStart-bluePulled)/(redStart+blueStart-redPulled-bluePulled);
    }

    public static void main(String[] args) {
        int blueStart1=5, redStart1=5, bluePulled1=2, redPulled1=3;
        int blueStart2=5, redStart2=7, bluePulled2=4, redPulled2=3;
        System.out.println(guessBlue(blueStart1,redStart1,bluePulled1,redPulled1));
        System.out.println(guessBlue(blueStart2,redStart2,bluePulled2,redPulled2));
    }
}
