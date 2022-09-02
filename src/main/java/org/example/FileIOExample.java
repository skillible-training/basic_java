package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileIOExample {
    public static void main(String[] args) {
        File file = new File("/Users/vikas/Downloads/ergo Interview");
        System.out.println("File name is " + file.getName() +  " and Absolute path: " + file.getAbsolutePath());
        System.out.println("is Directory: " + file.isDirectory());
        if (file.isDirectory()) { // checking it is a directory
            List files = Arrays.asList(file.list()); // list all the files
            files.forEach(System.out::println); // print all the files or folder.

            System.out.println(file.getAbsoluteFile());
            // Create new File

            File newFile = null;

//            try {
//                newFile = new File("newfile1.txt");
//                if (newFile.createNewFile()) {
//                    System.out.println("creating new file");
//                } else {
//                    System.out.println("File already exists");
//                }
//            } catch (IOException ioe) {
//                System.out.println(ioe.getMessage());
//                ioe.printStackTrace();
//            }
//            System.out.println("file name: " + newFile.getName());
        }


    }

}
