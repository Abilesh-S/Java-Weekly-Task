package com.kovanlabs.intern.week.task.topicspractice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NewInputOutputDemo {

    public static void fileDemoPractice(){
        try{
            Path directory = Paths.get("C:\\Users\\abile\\OneDrive\\Desktop\\Kovan");
            if(Files.notExists(directory)){
                Files.createDirectories(directory);
                System.out.println("Directory created");
            }
            Path file = directory.resolve("input.txt");
            if(Files.notExists(file)){
                Files.createFile(file);
                System.out.println("File created");
                List<String> lines = new ArrayList<>();
                lines.add("Hello nanba");
                lines.add("Hello Mapla");
                if(Files.exists(file)){
                    Files.write(file, lines);
                }
            }


            Path dir2 =Paths.get("C:\\Users\\abile\\OneDrive\\Desktop\\Kovan\\FullTimer");
            if(Files.notExists(dir2)){
                Files.createDirectories(dir2);
                System.out.println("Directory created");
            }
            Path file2 =dir2.resolve("input.txt");
            if(Files.notExists(file2)){
                Files.createFile(file2);
                System.out.println("File created 1 ");
                Files.copy(file, file2, StandardCopyOption.REPLACE_EXISTING);
            }
            if(Files.exists(file2)){
                Files.delete(file2);
            }
            Path dir3 = Paths.get("C:\\Users\\abile\\OneDrive\\Desktop");
            System.out.println(Files.walk(directory));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    private static void recursiveWalk(){
        Path filePath =  Paths.get("C:\\Users\\abile\\OneDrive\\Desktop\\Kovan");
        try(Stream<Path> pathsOfAllFiles = Files.walk(filePath)){
            pathsOfAllFiles.filter(Files::isRegularFile)
                .forEach(
                        pathOfOneFile -> {
                            try{
                                long sizeofFile = Files.size(pathOfOneFile);
                                System.out.println(pathOfOneFile+" -> "+ sizeofFile+" bytes");
                            }
                            catch (IOException ex){
                                ex.printStackTrace();
                            }
                        }
                );

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        recursiveWalk();
    }
}
