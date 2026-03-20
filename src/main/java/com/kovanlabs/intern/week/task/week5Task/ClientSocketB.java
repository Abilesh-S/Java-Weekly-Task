package com.kovanlabs.intern.week.task.week5Task;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientSocketB {

    public static void recieveMessageFromOtherClients(DataInputStream input) {

        try {

            while (true) {
                String replymsg = input.readUTF();
                System.out.println(replymsg);

            }

        } catch (IOException e) {
            System.out.println("Connection closed.");
        }
    }

    public static void sendMessageToOtherClient( DataOutputStream output) {

        Scanner inputForMsg = new Scanner(System.in);
        String msg = "";

        while (!msg.equalsIgnoreCase("over")) {

            try {

                msg = inputForMsg.nextLine();
                output.writeUTF(msg);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        try {

            Socket clientSide = new Socket("localhost", 8828);

            DataInputStream input = new DataInputStream(clientSide.getInputStream());
            DataOutputStream output = new DataOutputStream(clientSide.getOutputStream());

            Scanner inputForMsg = new Scanner(System.in);

            System.out.print("Enter User Name: ");
            String userName = inputForMsg.nextLine();

            output.writeUTF(userName);

            ExecutorService chatMultiProcessing = Executors.newFixedThreadPool(2);

            chatMultiProcessing.execute(() -> recieveMessageFromOtherClients(input));

            chatMultiProcessing.execute(() -> sendMessageToOtherClient(output));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}