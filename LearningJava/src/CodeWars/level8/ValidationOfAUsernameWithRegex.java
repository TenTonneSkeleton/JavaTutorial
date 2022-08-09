package CodeWars.level8;

//�������� ������� ���������� ��������� ��� �������� ����� ������������.
//���������� �������:
//�������� �����, �����, ������������
//����� ������ ���� �� 4 �� 16 �������� (������� ���).

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfAUsernameWithRegex {

    public static boolean validator(String name) {
        String regex = "^[0-9a-z_]{4,16}$";
        if (name == null) {
            System.out.println("�� �� ����� ���");
            return false;
        }
        try {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(name);
            boolean tf = m.find();
            name = name.substring(m.start(), m.end());
            return true;
        } catch (IllegalStateException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        String username1 = "regex",
                username2 = "a",
                username3 = "Hass",
                username4 = "Hasd_sadsdasdaffasdasdadasd123sdff",
                username5 = "",
                username6 = "____",
                username7 = "012",
                username8 = "p1pp1",
                username9 = "asd43 34",
                username10 = "asd43_34";
        System.out.println(validator(username1));
        System.out.println(validator(username2));
        System.out.println(validator(username3));
        System.out.println(validator(username4));
        System.out.println(validator(username5));
        System.out.println(validator(username6));
        System.out.println(validator(username7));
        System.out.println(validator(username8));
        System.out.println(validator(username9));
        System.out.println(validator(username10));
    }
}

/*
public class ZywOo {
  public static boolean validateUsr(String s) {
    return s.matches("[a-z_\\d]{4,16}");
  }
}
 */