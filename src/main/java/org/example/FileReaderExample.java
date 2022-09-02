package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "myfile.txt";
        FileReader fr = null;

        try {
            fr = new FileReader(fileName);
            System.out.println("File encoding: "+ fr.getEncoding());
            System.out.println("File data read | char by char");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
            }

            System.out.println();
            char[] charArray = new char[100];
            System.out.println("File data read | by char array");
            fr.read(charArray);
            System.out.println(charArray);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
