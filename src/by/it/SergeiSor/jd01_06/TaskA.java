package by.it.SergeiSor.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Pattern;

public class TaskA {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(Data.lukomor);
        Pattern pattern = Pattern.compile("[a-яА-ЯёЁ]{4,}");
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()) {
            int pos= matcher.start() + 3;
            sb.setCharAt(pos, '#');
            if (matcher.group().length()>6){
                pos=matcher.start()+6;
                sb.setCharAt(pos, '#');
        }

    }
      System.out.println(sb.toString());
}
}
