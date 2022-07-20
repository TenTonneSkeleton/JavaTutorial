import javax.swing.*;

public class UsingMassList {
    public static void main(String[] args) {
        String title = "В мире животных";
        String text = "Выберите животное";
        String[] animal = {"Коала", "Кошка", "Лиса", "Медведь", "Волк"};
        String[] photo = {"koala.png", "cat.png", "fox.png", "bear.png", "wolf.png"};
        String folder = "C:\\Users\\raspe\\IdeaProjects\\JavaTutorial\\LearningJava\\src\\Lesson9\\";
        ImageIcon img = new ImageIcon(folder + "racoon.png");
        String choose = (String) JOptionPane.showInputDialog(null, text, title, JOptionPane.PLAIN_MESSAGE, img, animal, animal[0]);
        if (choose == null) {
            System.exit(0);
        }
        System.out.println(animal.length);
        for (int k = 0; k < animal.length; k++) {
            if (choose.equals(animal[k])) {
                img = new ImageIcon(folder + photo[k]);

                break;
            }
        }
        JOptionPane.showMessageDialog(null, img, title, JOptionPane.PLAIN_MESSAGE);
    }

}
