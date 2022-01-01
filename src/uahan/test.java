package uahan;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        System.out.println("2018/7/3".matches("\\d+.\\d+.\\d+"));
        System.out.println("18-06-12".matches("\\d+.\\d+.\\d+"));
        System.out.println("2018년7월3일".matches("\\d+.\\d+.\\d+"));
        System.out.println("2018/7/3".matches("\\d+.\\d+.\\d+"));
        Pattern p = Pattern.compile("\\d+.\\d+.\\d+");
        Matcher m = p.matcher("2018년7월3일");
        if (m.find()) System.out.println(m.group());
    }
}
