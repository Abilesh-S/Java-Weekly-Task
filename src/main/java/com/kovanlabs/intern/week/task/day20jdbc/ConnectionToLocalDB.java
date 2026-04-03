package com.kovanlabs.intern.week.task.day20jdbc;

import java.sql.*;
import java.util.Scanner;

public class ConnectionToLocalDB {
    private String url = "jdbc:mysql://localhost:3306/hs";
    private String dbUserName = "root";
    private String dbUserPassword = "root";

    private void displayUserInList(){
        try {
            Connection db = DriverManager.getConnection(url , dbUserName , dbUserPassword);
            System.out.println("Enter Table Name ");
            String tableName = new Scanner(System.in).nextLine();
            String query = "SELECT * FROM team;";
            Statement st = db.createStatement();
            ResultSet executeQuery = st.executeQuery(query);
            System.out.println("User List");
            while(executeQuery.next()){
                System.out.println("User Name : "+executeQuery.getString("team_mem")+"\nAge : "+executeQuery.getInt("age")+"\nAcceptance : "+executeQuery.getString("accepted")+"\n");
                Thread.sleep(1000);
            }

        }
        catch (SQLException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private void createTableUsers(){
        try{
            Connection db = DriverManager.getConnection(url , dbUserName , dbUserPassword);
            System.out.println("Enter Table Name to be Created");
            String tableName = new Scanner(System.in).nextLine();
            DatabaseMetaData dbStruct = db.getMetaData();
            ResultSet resultData = dbStruct.getTables(null , null , tableName , new String[]{"TABLE"});
            if (!resultData.next()) {
                String query = "CREATE TABLE "+tableName+"(NAME VARCHAR(20), AGE INT);";
                Statement st = db.createStatement();
                st.executeUpdate(query);
                System.out.println("Table created successfully.");
            } else {
                System.out.println("Table already exists.");
            }
            db.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    private void insertUserList(){
        try{
            Scanner input = new Scanner(System.in);
            Connection db = DriverManager.getConnection(url , dbUserName , dbUserPassword);
            String insertionQuery = "INSERT INTO USERS(NAME, AGE) VALUES (?, ?)";
            PreparedStatement insertStatement = db.prepareStatement(insertionQuery);
            System.out.println("Enter Both Name and Age");
            String name = input.next();
            int age = input.nextInt();
            insertStatement.setString(1 , name);
            insertStatement.setInt(2, age);
            System.out.println("Rows Updated : "+insertStatement.executeUpdate());
            db.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ConnectionToLocalDB db = new ConnectionToLocalDB();
        int choice;
        do{
            System.out.println("\t-----------------------");
            System.out.println("\t| DB Operation List    |");
            System.out.println("\t| 1. Create Table      |");
            System.out.println("\t| 2. Insert in Table   |");
            System.out.println("\t| 3. Display Table     |");
            System.out.println("\t| 4. Exit              |");
            System.out.println("\t-----------------------");
            System.out.println("\n Enter your Choice");
            choice = new Scanner(System.in).nextInt();
            switch(choice){
                case 1 -> db.createTableUsers();
                case 2 -> db.insertUserList();
                case 3 -> db.displayUserInList();
                default -> System.out.println("Invalid Input");
            }
        }while(choice != 4);


    }
}
