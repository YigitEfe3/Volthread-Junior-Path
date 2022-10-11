package org.example.BasicIO.turkcellFileAndPathClasses1;

import java.io.File;
import java.io.IOException;

public class FileMethods {

    /*
    *
    * Java file class defines files and paths as abstract (soyut)
    *   File class is used for creating files/paths, searching for files, and deleting files
    *
    * Java path class is used to operate on files and paths with the file class
    *
    *
    * */

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Yigit\\Downloads\\Spring Boot Projects\\TheJavaTutorials\\turkcellFileAndPathClasses.txt");

        //System.out.println(file.exists());        //does the file exists?
        //System.out.println(file.canRead());       //can we read the file?
        //System.out.println(file.canWrite());      //can we write on the file?
        //System.out.println(file.isDirectory());   //is it a directory?
        //System.out.println(file.isFile());        //is it a file?
        //System.out.println(file.getAbsolutePath()); //get the path
        //System.out.println(file.getParent());       //get the path of the parent
        //System.out.println(file.length());       //get the total bytes    (every character is 1 byte?)
        //System.out.println(file.lastModified());    //milliseconds passed since January 1st 1970
        //System.out.println(new Date(file.lastModified()));  //as a normal date format

        //to create a new file
        File file2 = new File("C:\\Users\\Yigit\\Downloads\\Spring Boot Projects\\TheJavaTutorials\\turkcellFileAndPathClassesExample2.txt");
        if(!file2.exists()){    //if it already doesn't exist
            try {           //create a new file
                file2.createNewFile();  //if writing to the path is not permitted, we may get an IOException
            } catch (IOException e) {   //so we have to surround it with try catch blocks (handle the exception)                throw new RuntimeException(e);
                System.out.println(e.getMessage());
            }
        }

        File file3 = new File("C:\\Users\\Yigit\\Downloads\\Spring Boot Projects\\TheJavaTutorials\\turkcellFileAndPathClassesExample3.txt");
        //System.out.println(file3.exists());   //the file exists (returns true)
        if(file3.exists()){
            boolean isDeleted = false;
            isDeleted = file3.delete();      //delete the file
            System.out.println("file3 deleted " + isDeleted);   //file3 does not exist anymore.
        }
        if(file3.exists()){
            System.out.println("file3 still exists.");
        }else{
            System.out.println("file3 deleted successfully.");   //file3 does not exist anymore.
        }
    }

}
