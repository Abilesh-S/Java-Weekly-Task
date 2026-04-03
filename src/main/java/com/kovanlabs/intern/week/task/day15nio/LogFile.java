package com.kovanlabs.intern.week.task.day15nio;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class LogStruct{
    String url , timeStamp , ip;
    int statusCode ;
    LogStruct(String ip , String timeStamp , int statusCode , String url){
        this.ip = ip;
        this.timeStamp = timeStamp ;
        this.statusCode = statusCode;
        this.url = url;
    }
    public String toString(){
        return this.ip+" "+this.timeStamp+" "+this.statusCode+" "+this.url;
    }
    public static LogStruct parse(String line){
        String[] parts = line.split(" ");
        return new LogStruct(parts[0] , parts[1], Integer.parseInt(parts[2]), parts[3] );
    }

}
class LogFile{
    private static String location = "C:\\Users\\abile\\IdeaProjects\\Java-Weekly-Task\\src\\main\\java\\com\\kovanlabs\\intern\\week\\task\\day15nio\\server.log";
    private void createLogFile() throws IOException {
        Path fileLocation = Paths.get(location);
        if(!Files.exists(fileLocation)){
            Files.createFile(fileLocation);
        }
        System.out.println("File Created");
    }


    private void generateLogFile() {
        String ip ,timestamp ;
        Random random = new Random();
        String[] urls = {"/home", "/login", "/dashboard", "/api/users", "/api/products", "/logout", "/profile"};
        int[] statusCodes = {200, 201, 400, 401, 403, 404, 500};

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        try(BufferedWriter saveOperation = new BufferedWriter(new FileWriter(location))){
            for(int i = 0 ; i < 1000 ; i++) {
                ip = random.nextInt(256) + "." + random.nextInt(256) + "." + random.nextInt(256) + "." + random.nextInt(256);
                timestamp = LocalDateTime.now().minusSeconds(random.nextInt(10000)).format(formatter);
                int statusCode = statusCodes[random.nextInt(statusCodes.length)];
                String url = urls[random.nextInt(urls.length)];
                LogStruct log = new LogStruct(ip, timestamp, statusCode, url);

                saveOperation.write(log.toString());
                saveOperation.newLine();
            }
            System.out.println("Log File Created");
        }
        catch (IOException e){
            System.out.println("Not Generated");
            e.printStackTrace();

        }

    }
    private void analyseLogFile() throws IOException{
        List<LogStruct> logs ;
        BufferedReader fileData = new BufferedReader(new FileReader(location));
        try(Stream<String> readOperation = fileData.lines()){
            logs = readOperation.map(LogStruct::parse).toList();
            System.out.println("Log file is loaded and its size"+logs.size());

            System.out.println("Totat Request per IP address");
            Map<String , Long> totalRequest = logs.stream().collect(Collectors.groupingBy(log -> log.ip ,Collectors.counting()));
            totalRequest.forEach((ip , count)->{
                System.out.println(ip+" : "+ count);
            });

            System.out.println("Log Requested Url");
            logs.stream().collect(Collectors.groupingBy(log-> log.url , Collectors.counting())).entrySet().stream().sorted(Map.Entry.<String , Long>comparingByValue().reversed()).limit(3).forEach(System.out::println);

            System.out.println("Total percentatge of 404 request");
            long total404ErrorRequest = logs.stream().filter(logStruct -> logStruct.statusCode == 404).count();

            long percentage = (total404ErrorRequest * 100)/ logs.size();
            System.out.println("Percentage of 404 error request occurs "+percentage);
        }
    }

    public static void main(String[] args) throws IOException {
        LogFile lf = new LogFile();
        lf.generateLogFile();
        lf.analyseLogFile();

    }
}
