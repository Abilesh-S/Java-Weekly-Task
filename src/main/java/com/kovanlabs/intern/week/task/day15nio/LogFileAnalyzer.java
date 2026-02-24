package com.kovanlabs.intern.week.task.day15nio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Log{
    String ipAddress , timeStamp , url;
    int statusCode;
    public Log(String ipAddress, String timeStamp, int statusCode , String url){
        this.ipAddress = ipAddress;
        this.timeStamp = timeStamp;
        this.statusCode = statusCode;
        this.url = url;
    }
    public String toString(){
        return ipAddress + " " + timeStamp + " " + statusCode + " " + url ;
    }
    public static Log parse(String line){
        String[] parts = line.split(" ");
        return new Log(parts[0],
                   parts[1],
                   Integer.parseInt(parts[2]),
                   parts[3]
        );
    }
}

public class LogFileAnalyzer{
    private static Path logFileLocation =  Paths.get("C:\\Users\\abile\\IdeaProjects\\Java-Weekly-Task\\src\\com\\kovanlabs\\intern\\week\\task\\day15nio\\server.log");
    private static void createLogFile(){
        try{
            if(!Files.exists(logFileLocation)){
                Files.createFile(logFileLocation);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void generateLogFile(){
        Random random = new Random();
        String[] url = {"/home", "/login", "/dashboard", "/api/users", "/api/products", "/logout", "/profile"};

        int[] statusCodes = {200, 201, 400, 401, 403, 404, 500};

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        try(BufferedWriter saveOperation = Files.newBufferedWriter(logFileLocation)){
            for(int i = 0 ; i < 1000 ; i++){

                String ip = random.nextInt(256) +"."+random.nextInt(256) +"."+random.nextInt(256) +"."+random.nextInt(256);
                String timestamp = LocalDateTime.now().minusSeconds(random.nextInt(100000)).format(formatter);
                int statusCode = statusCodes[random.nextInt(statusCodes.length)];
                String urls = url[random.nextInt(url.length)];

                Log totalLog  = new Log(ip, timestamp, statusCode, urls);
                saveOperation.write(totalLog.toString());
                saveOperation.newLine();
            }
            System.out.println("Log file has been generated with 1000 records.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void loadAndPerformTask() throws IOException{
        List<Log> logs ;
        try(Stream<String> readOperation = Files.lines(logFileLocation)){
            logs = readOperation.map(Log::parse).toList();
            System.out.println("Log file has been loaded and its size"+logs.size());

            System.out.println("Ip Request List");
            Map<String , Long> requestPerIp = logs.stream().collect(Collectors.groupingBy(log -> log.ipAddress,Collectors.counting()));
            requestPerIp.forEach((ip, count)->{System.out.println(ip+" : "+count);});

            System.out.println("\nTop 3 Most Requested URLs:");
            logs.stream().collect(Collectors.groupingBy(log -> log.url,Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                    .limit(3)
                    .forEach(System.out::println);

            long totalRequests = logs.size();
            long error404Count = logs.stream()
                    .filter(log -> log.statusCode == 404)
                    .count();

            double percentage = (error404Count * 100.0) / totalRequests;

            System.out.printf("\n404 Error Percentage: %.2f%%\n", percentage);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String []args) throws IOException{
        if(!Files.exists(logFileLocation)){
            createLogFile();
        }
        generateLogFile();
        loadAndPerformTask();
    }

}