package com.reijnn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static String regex = "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)";
    private static String[] testUrls = new String[]{"http://lib.hva/nl", "http://www.hva.nl/a/b?tijd=UTC", "https://google.com"};

    public static void main(String[] args) {
        for (String url : testUrls) {
            System.out.println("Url: " + url + ", Result: " + checkURL(url));
        }
    }

    private static boolean checkURL(String url) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}
