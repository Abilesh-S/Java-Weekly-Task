package com.kovanlabs.intern.week.task.practice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Server Started Chat");
            ServerSocket serverChat = new ServerSocket(7743);
            Socket client = serverChat.accept();
            System.out.println("Client Accepted");
            String msg = "" ;
            DataInputStream inputFromClient ;
            while(!msg.equals( "over")) {
                InputStream in = client.getInputStream();
                inputFromClient = new DataInputStream(in);
                msg = inputFromClient.readUTF();
                if(msg.equals("over")){
                    break;
                }

                System.out.println("Client : " + msg);

                OutputStream out = client.getOutputStream();
                DataOutputStream output = new DataOutputStream(out);
                System.out.print("Balaji : ");
                msg = input.nextLine();
                output.writeUTF(msg);
            }
            System.out.println("Server is out of Chat ");
            input.close();




        } catch (IOException e) {
            System.out.println("Client Exited from Chat");
        }
    }
}
