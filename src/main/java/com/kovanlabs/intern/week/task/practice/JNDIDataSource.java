package com.kovanlabs.intern.week.task.practice;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JNDIDataSource {

    public static void main(String[] args) throws Exception {
        Context ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup("jdbc/hostelmgmt");
        Connection con = ds.getConnection();
        System.out.println("Connected Successfully!");
        String query = "SELECT * FROM users;";
        try(Statement st = con.createStatement()){
            ResultSet result = st.executeQuery(query);
            System.out.println("User Details\n+");
            while(result.next()){
                System.out.println("User ID : "+result.getInt("id")+
                                 "\nName    : "+result.getString("name")+
                                 "\nPhone no: "+result.getLong("phno")+
                                 "\nGuardian: "+result.getString("guardian_name")+
                                 "\nGPhoneno: "+result.getLong("guardian_ph_no")+
                                 "\nEmail Id: "+result.getString("email"));
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}