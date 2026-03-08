package com.kovanlabs.intern.week.task.week5Task;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class ServerSockets {

    static List<ClientHandler> clients = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(8828);
            System.out.println("Server Started Successfully...");

            ExecutorService pool = Executors.newCachedThreadPool();

            while (true) {

                Socket client = serverSocket.accept();


                ClientHandler handler = new ClientHandler(client);
                clients.add(handler);

                pool.execute(handler);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void broadcast(String message, ClientHandler sender) {
        for (ClientHandler client : clients) {
            if (client != sender) {
                client.sendMessage(message);
            }
        }
    }
}

class ClientHandler implements Runnable {

    Socket socket;
    DataInputStream input;
    DataOutputStream output;
    String userName;

    public ClientHandler(Socket socket) {
        try {
            this.socket = socket;
            input = new DataInputStream(socket.getInputStream());
            output = new DataOutputStream(socket.getOutputStream());

            userName = input.readUTF();
            System.out.println(userName + " joined the chat");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {

        try {

            while (true) {

                String msg = input.readUTF();

                if (msg.equalsIgnoreCase("over")) {
                    break;
                }

                String fullMessage = userName + " : " + msg;

                System.out.println(fullMessage);

                ServerSockets.broadcast(fullMessage, this);
            }

        } catch (IOException e) {
            System.out.println(userName + " disconnected.");
        }
    }

    public void sendMessage(String message) {
        try {
            output.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}