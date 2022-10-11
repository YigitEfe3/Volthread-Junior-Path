package org.example.BasicIO.turkcellReadingACharArrayFromATextFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class newclass {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Yigit\\Downloads\\Spring Boot Projects\\TheJavaTutorials\\turkcellReadingACharArrayFromATextFileExample.txt");
        if(file.exists()){
            FileReader fileReader = null;       //for reading character based resources
            try {
                fileReader = new FileReader(file);


                //keep track of the current time before the reading and writing begins.
                long now = System.currentTimeMillis();
                /*
                int c = 0;                                                          //this section
                while( (c = fileReader.read()) != -1){  //-1 means the end o file   //reads
                    System.out.print((char)c);                                      //and outputs the file
                }
                System.out.println(""); //empty line
                System.out.println(System.currentTimeMillis()-now);
                //amount of milliseconds passed between starting reading and finishing writing to the console.
                //In this case, for 3 tries, the values are: 11814 11735 11591
                */
                //In this case, for 3 tries, the values are: 409   436   373
                //As we can see, using a buffer is a lot more efficient
                char[] buffer = new char[1024];
                int length = 0;
                StringBuilder stringBuilder = new StringBuilder();

                while((length = fileReader.read(buffer)) != -1){
                    stringBuilder.append(Arrays.copyOfRange(buffer, 0, length));
                }
                System.out.println(stringBuilder.toString());

                System.out.println(""); //empty line
                System.out.println(System.currentTimeMillis()-now);
                //amount of milliseconds passed between starting reading and finishing writing to the console.
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }finally {
                if(fileReader != null){
                    try {
                        fileReader.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }else{
            System.out.println("File not found.");
        }
    }
}
