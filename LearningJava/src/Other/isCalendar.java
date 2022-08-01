package Other;

import javax.swing.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isCalendar {
    public static Date cal(int year, int month, int day, int roll) {
        Calendar calendar = new GregorianCalendar(year, month-1, day);
        calendar.add(calendar.DATE, roll-1);
        return calendar.getTime();
    }

    public static void main(String[] args) {
        String year="", month="", day="", roll="";
        String title = "–асчет сроков работы по материалам";
        String date = JOptionPane.showInputDialog(null, "¬ведите дату получени€ материала", title, JOptionPane.QUESTION_MESSAGE);
        String regex = "\\.";
        Pattern pattern = Pattern.compile(regex);
        String[] yearMonthDay = date.split(regex);
        for (int i = 0; i < yearMonthDay.length; i++) {
            switch (i){
                case 0:  day = yearMonthDay[i];
                case 1:  month = yearMonthDay[i];
                case 2:  year = yearMonthDay[i];
            }
        }
        System.out.println(day+"первое");
        System.out.println(month+"второе");
        System.out.println(year+"третье");
        Matcher matcher = pattern.matcher(date);
        if (matcher.find()){
            System.out.println(matcher.group());
        }
        String incRoll = JOptionPane.showInputDialog(null, "¬ведите установленный срок проверки", title, JOptionPane.QUESTION_MESSAGE);
        System.out.println(incRoll);

       // System.out.println(cal(year,month,day,roll));

    }

}
