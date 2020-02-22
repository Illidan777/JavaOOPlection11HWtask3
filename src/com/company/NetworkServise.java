package com.company;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkServise {
    public static String getStringFromURl(String specificator, String code)throws IOException{
        String res = "";
        URL url = new URL(specificator);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        try (InputStream is = connection.getInputStream()){
            BufferedReader br = new BufferedReader(new InputStreamReader(is,code));
            String temp = "";
            for(;(temp = br.readLine())!=null;){
                res+=temp+System.lineSeparator();
            }
        }catch (IOException e){
            throw e;
        }
        return res;
    }
}
