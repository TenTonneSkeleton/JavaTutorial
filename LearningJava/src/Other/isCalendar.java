package Other;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class isCalendar {
    public static Date cal(int year, int month, int day, int roll) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        calendar.add(calendar.DATE, roll - 1);
        return calendar.getTime();
    }

    public static void main(String[] args) {
        String year = "", month = "", day = "", roll = "";
        String title = "������ ������ ������ �� ����������";
        String date = JOptionPane.showInputDialog(null, "������� ���� ��������� ���������", title, JOptionPane.QUESTION_MESSAGE);
        String iRoll = JOptionPane.showInputDialog(null, "������� ������������� ���� ��������", title, JOptionPane.QUESTION_MESSAGE);
        if (date==null || iRoll==null){
            JOptionPane.showMessageDialog(null, "������ ��� ����� ������", title, JOptionPane.ERROR_MESSAGE);
        }
        String regex = "\\.|\\,|\\/";
        String[] yearMonthDay = date.split(regex);
        for (int i = 0; i < yearMonthDay.length; i++) {
            switch (i) {
                case 0:
                    day = yearMonthDay[i];
                case 1:
                    month = yearMonthDay[i];
                case 2:
                    year = yearMonthDay[i];
            }
        }
        Integer intYear = null, intMonth = null, intDay = null, intRoll = null;
        try {
            intYear = Integer.valueOf(year);
            intMonth = Integer.valueOf(month);
            intDay = Integer.valueOf(day);
            intRoll = Integer.valueOf(iRoll);
        } catch (NumberFormatException e) {
            System.err.println("������������ ������ ������!");
        }
        if (intDay>32 || intDay>32 || intMonth>12){
            JOptionPane.showMessageDialog(null, "��������� ���� �� ������������� �������", title, JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        String result = dateFormat.format(cal(intYear, intMonth, intDay, intRoll));
        JOptionPane.showMessageDialog(null, result, title, JOptionPane.INFORMATION_MESSAGE);
    }

}
