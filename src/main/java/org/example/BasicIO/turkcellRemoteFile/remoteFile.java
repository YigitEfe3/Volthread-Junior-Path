package org.example.BasicIO.turkcellRemoteFile;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

public class remoteFile {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.w3.org/TR/2003/REC-PNG-20031110/iso_8859-1.txt");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

            char[] buffer = new char[1024];
            StringBuilder stringBuilder = new StringBuilder();
            int length = 0;

            while((length = inputStreamReader.read(buffer)) != -1){
                stringBuilder.append(Arrays.copyOfRange(buffer, 0 , length));
            }
            System.out.println(stringBuilder.toString());

        } catch (Exception e){

        } finally {

        }
    }
}
