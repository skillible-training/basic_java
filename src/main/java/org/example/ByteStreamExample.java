package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException
    {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try
        {
            sourceStream = new FileInputStream("myfile.txt");
            targetStream = new FileOutputStream ("copy_to.txt");

            // Reading source file using read method
            //  and write to file byte by byte using write method
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);
        }
        finally
        {
            if (sourceStream != null){
                sourceStream.close();
            }
            if (targetStream != null){
                targetStream.close();
            }
        }
    }
}
