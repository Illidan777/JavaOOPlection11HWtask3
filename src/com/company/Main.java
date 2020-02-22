package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
      String specificaror = "https://prog.kiev.ua/forum/";
      String htmlMarkUP;
        File htmlLinks = new File("Links.txt");
        FileServise fileServise = new FileServise();
      try{
          htmlMarkUP = NetworkServise.getStringFromURl(specificaror,"UTF-8");
          htmlLinks.createNewFile();
          fileServise.putToFile(htmlLinks,htmlMarkUP);
      }catch (IOException e){
          e.printStackTrace();
      }

    }
}
