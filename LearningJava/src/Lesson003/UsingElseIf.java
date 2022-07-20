package Lesson003;

import javax.swing.*;

public class UsingElseIf {
    public static void main(String[] args) {
        ImageIcon img;
        String animal;
        String file = "D:/";
        String homa = "Хома";
        String pes = "Пес";
        String zai = "Зай";
        String ptic = "Птиц";
        String progError = "";
        animal = JOptionPane.showInputDialog(null,
                "Введите название животного",
                pes + ", " + ptic + ", " + homa + " или " + zai);
        if (animal == null) {
            System.exit(0);
        } else if (animal.equalsIgnoreCase(progError)){
            JOptionPane.showMessageDialog(null,
                    "Вы не ввели животное",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } else if (animal.equalsIgnoreCase(pes)) {
            file += "pes.png";
            animal = pes;
        } else if (animal.equalsIgnoreCase(ptic)) {
            file += "ptic.png";
            animal = ptic;
        } else if (animal.equalsIgnoreCase(homa)) {
            file += "homa.png";
            animal = homa;
        } else if (animal.equalsIgnoreCase(zai)) {
            file += "zai.png";
            animal = zai;
        }
        img = new ImageIcon(file);
        JOptionPane.showMessageDialog(null, img, animal, JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
