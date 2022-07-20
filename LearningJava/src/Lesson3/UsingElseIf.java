package Lesson3;

import javax.swing.*;
import java.awt.font.ImageGraphicAttribute;

public class UsingElseIf {
    public static void main(String[] args) {
        ImageIcon img;
        String animal;
        String file = "D:/";
        String homa = "����";
        String pes = "���";
        String zai = "���";
        String ptic = "����";
        String progError = "";
        animal = JOptionPane.showInputDialog(null,
                "������� �������� ���������",
                pes + ", " + ptic + ", " + homa + " ��� " + zai);
        if (animal == null) {
            System.exit(0);
        } else if (animal.equalsIgnoreCase(progError)){
            JOptionPane.showMessageDialog(null,
                    "�� �� ����� ��������",
                    "������",
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
