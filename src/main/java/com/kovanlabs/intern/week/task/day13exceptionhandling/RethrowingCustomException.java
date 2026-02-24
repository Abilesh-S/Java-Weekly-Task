package com.kovanlabs.intern.week.task.day13exceptionhandling;
import java.io.FileReader;
import java.io.IOException;

class DataProcessingException extends RuntimeException {
    DataProcessingException(String message, Throwable cause) {
        super(message , cause);
    }
}

public class RethrowingCustomException {
    private static void existFile(String fileName){
        try {
            FileReader file = new FileReader(fileName);
            file.close();
       }
        catch (IOException e){
            throw new DataProcessingException("File is not found" , e);
        }
    }
    public static void main(String[] args) {
        String fileName = "commands_log.md";
        try{
            existFile(fileName);
        }
        catch (DataProcessingException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}

