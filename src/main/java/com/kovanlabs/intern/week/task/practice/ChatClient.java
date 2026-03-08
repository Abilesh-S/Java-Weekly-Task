package com.kovanlabs.intern.week.task.practice;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        String msg = "";
        DataInputStream input;
        DataOutputStream output ;
        try {
            Scanner inputFromUser = new Scanner(System.in);
            Socket clientSide = new Socket("localhost",7743);
            System.out.println("Client Connected to Server");
            do {
                OutputStream out = clientSide.getOutputStream();
                output = new DataOutputStream(out);
                System.out.print("Ranjith : ");
                msg = inputFromUser.nextLine();
                if(msg.equals("over")) {
                    break ;
                }
                output.writeUTF(msg);
                InputStream in = clientSide.getInputStream();
                input = new DataInputStream(in);
                if((msg = input.readUTF()).equals("over")){
                    break;
                }
                System.out.println("Server : " + msg);
            }while(!msg.equals( "over"));
            System.out.println("Ranjith Exited From Chat");

            output.close();
        }
        catch (IOException e){
            System.out.println("Server Exited from Chat");
        }
    }
}
