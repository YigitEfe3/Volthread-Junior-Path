package org.example.CoveringTheBasics.EssentialJavaClasses.BasicIO.turkcellFileAndPathClasses1;

import java.io.File;
import java.util.Scanner;

public class PathOperations {

    public static void main(String[] args) {

        //gets a folder from the path as an input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Folder Path:");
        String path = scanner.nextLine();

        //passes the path to a new file
        File file = new File(path);

        //gets all the content of the file inside content
        String[] content = file.list();

        //prints out the content of the folder specified by the user to the console
        for (int i = 0; i < content.length; i++){
            System.out.println(content[i]);
        }
        scanner.close();
    }

}
