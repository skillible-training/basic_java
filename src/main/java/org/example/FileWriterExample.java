package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String fileName = "myfile_1Sep.txt";
        FileWriter fw = null;

        try {
            fw = new FileWriter(fileName);
            fw.write("My sample data some changes");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        append(fileName);
    }

    public static void append(String fileName){
        File file = new File(fileName);
        FileWriter fw = null;
        try {
             fw = new FileWriter(file, true); //Append mode
            fw.write("\n");
             fw.write("new data on this file. How is today's session");
             fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
