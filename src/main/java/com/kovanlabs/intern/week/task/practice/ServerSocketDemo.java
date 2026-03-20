package com.kovanlabs.intern.week.task.practice;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {
    public static void main(String[] args) {
        try {
            ServerSocket serverSlide = new ServerSocket(7742);

            Socket clientFromServer = serverSlide.accept();

            InputStream in = clientFromServer.getInputStream();
            DataInputStream inputFromClient = new DataInputStream(in);

            System.out.println("Client : "+inputFromClient.readUTF());

            OutputStream out = clientFromServer.getOutputStream();
            DataOutputStream replyToClient = new DataOutputStream(out);

            replyToClient.writeUTF("Unnna vida mapum manthirama than irrukom");
            serverSlide.close();
            clientFromServer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
