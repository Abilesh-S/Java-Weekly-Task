package com.kovanlabs.intern.week.task.topicspractice;

import java.io.*;

public class ByteStream {
    public static void main(String[] args)  {
        InputStream readFile = null ;
        OutputStream writeFile = null;
        try {
            readFile = new FileInputStream("C:\\Users\\abile\\OneDrive\\Documents\\FilesOperation\\input.txt");
            writeFile = new FileOutputStream("C:\\Users\\abile\\OneDrive\\Documents\\FilesOperation\\output.txt");
            int c = 0;
            while((c = readFile.read()) != -1){
                writeFile.write(c);
            }
            System.out.println("File written Successfully");
            readFile.close();
            writeFile.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {

        }
    }
}
