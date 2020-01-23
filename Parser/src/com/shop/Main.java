package com.shop;

        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "0832 973213 ada 074o-123 312 0721 912 123 123 321 212 0732-222111(7480)-732213 0932-213-231(0732)-1321220749 223-102a0792-010-110";
        String phoneno = null;
        Pattern p = Pattern.compile("\\(?07\\d{2}\\)?(-|\\s)\\d{3}(-|\\s)?\\d{3}");
        Matcher m = p.matcher(string);
        while (m.find()) {
               System.out.println(m.group(0));

        }
    }
}
