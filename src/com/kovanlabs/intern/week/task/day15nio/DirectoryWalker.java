package com.kovanlabs.intern.week.task.day15nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryWalker {
    public static void findFilesInDirectory(Path directory){
        try(Stream<Path> files = Files.walk(directory)){
            files.filter(Files::isRegularFile)
                 .forEach(path -> {
                     try {
                         long sizeOfFile= Files.size(path);
                         System.out.println(path.toAbsolutePath() + " -> " +  sizeOfFile+ " bytes");
                     }
                     catch (IOException e) {
                         e.printStackTrace();
                     }
                 });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Path Directory = Paths.get("C:\\Users\\abile\\OneDrive\\Desktop\\Kovan");
        if(Files.exists(Directory)){
            findFilesInDirectory(Directory);
        }
        else{
            System.out.println("Directory does not exist");
        }

    }
}
