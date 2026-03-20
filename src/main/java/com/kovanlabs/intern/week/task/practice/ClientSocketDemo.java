package com.kovanlabs.intern.week.task.practice;

import java.io.*;
import java.net.Socket;

public class ClientSocketDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Trying to Connect to Server ");
            Socket clientSide = new Socket("localhost", 7742);
            System.out.println("Connected to client");

            OutputStream out = clientSide.getOutputStream();
            DataOutputStream writer = new DataOutputStream(out);

            writer.writeUTF("Hello Mapila Vaikiran Bomb Gapula");

            InputStream in = clientSide.getInputStream();
            DataInputStream reader = new DataInputStream(in);

            System.out.println("Input from User : "+reader.readUTF());
            clientSide.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
