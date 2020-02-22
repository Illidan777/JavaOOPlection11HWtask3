package com.company;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithHTML {
    public ArrayList<String> extractUrlsFromString(String htmlString)
    {
        ArrayList<String> result = new ArrayList<>();

        String regex = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(htmlString);
        while (m.find())
        {
            result.add(m.group());
            // result.forEach(System.out::println);
        }

        return result;
    }
}
