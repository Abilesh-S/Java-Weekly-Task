package com.kovanlabs.intern.week.task.topicspractice;

import java.io.*;
import java.util.Scanner;

public class CharactherStream {

    private void bufferOperation(){
        BufferedReader inputreader = null;
        BufferedWriter outputWriter = null;
        try {
            inputreader = new BufferedReader(new FileReader("C:\\Users\\abile\\OneDrive\\Documents\\FilesOperation\\input.txt"));
            outputWriter = new BufferedWriter(new FileWriter("C:\\Users\\abile\\OneDrive\\Documents\\FilesOperation\\output.txt"));

            String s ;
            while((s = inputreader.readLine()) != null){
                outputWriter.write(s);
            }

            System.out.println("Written Successfully");

            inputreader.close();
            outputWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    private void charactherStream() {
        Reader inputreader = null;
        Writer outputwriter = null;

        try{
            inputreader = new FileReader("C:\\Users\\abile\\OneDrive\\Documents\\FilesOperation\\input.txt");
            outputwriter = new FileWriter("C:\\Users\\abile\\OneDrive\\Documents\\FilesOperation\\output.txt");

            int c ;
            while((c = inputreader.read()) != -1){
                outputwriter.write(c);
            }

            inputreader.close();
            outputwriter.close();
        }
        catch (IOException e ){
            e.printStackTrace();
        }
    }

    private void readFromFile(){
        Scanner s = null;
        try{
            s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\abile\\OneDrive\\Documents\\FilesOperation\\output.txt")));

            while(s.hasNext()){
                System.out.println(s.next());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            if(s == null){
                s.close();
            }
        }
    }
    public static void main(String[] args) {
        CharactherStream s = new CharactherStream();
        s.readFromFile();
    }
}
