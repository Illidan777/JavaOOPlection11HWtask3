package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileServise {
    WorkWithHTML workWithHTML = new WorkWithHTML();
    public  File putToFile(File file, String url)throws IOException {
        String stringOfURL = "";
        List<String> listOfURL = workWithHTML.extractUrlsFromString(url);
        try(  BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String list:listOfURL) {
                if(list!=null){
                    stringOfURL+=list + System.lineSeparator();
                }
            }
            bw.write(stringOfURL);
            //   System.out.println("Done!");
        }catch (IOException e){
            e.printStackTrace();
        }
        return file;
    }

}
