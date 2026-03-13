package com.kovanlabs.intern.week.task.practice;

import com.mysql.cj.jdbc.MysqlDataSource;
import javax.sql.DataSource;
import java.sql.*;

public class JDBCOperation {
    public String userName = "root";
    public String userPassword = "root";
    public String dbUrl = "jdbc:mysql://localhost:3306/KlabsInternLearning";

    public DataSource createDataSource(){
        MysqlDataSource dbConnection = new MysqlDataSource();
        dbConnection.setUrl(dbUrl);
        dbConnection.setUser(userName);
        dbConnection.setPassword(userPassword);
        return dbConnection;
    }

    public void createTable(DataSource db){
        String query = "CREATE TABLE COFFEES(COF_NAME VARCHAR(30) , SUP_ID INT , PRICE FLOAT , SALES INT ,TOTAL INT);";
        try(Connection connection = db.getConnection();) {
            Statement st = connection.createStatement();
            st.executeUpdate(query);
            System.out.println("Query Executed Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertdetails(DataSource db ,String coffeName , int supplierID , double price , int sales , int total){
        String query = "INSERT INTO COFFEES VALUES('"+coffeName+"',"+supplierID+","+price+","+sales+","+total+")";
        try(Connection connection = db.getConnection()){
            Statement statement = connection.createStatement();
            System.out.println("Rows Affected"+statement.executeUpdate(query));
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void displayTable(DataSource ds){
        String query = "SELECT * FROM COFFEES";
        try(Connection connection = ds.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                System.out.println("COFFEE Name : "+result.getString("COF_NAME")+
                        "\nSuppplier Id : "+result.getInt("SUP_ID")+
                        "\nPrice : "+result.getDouble("PRICE")+
                        "\nSales : "+result.getInt("SALES")+
                        "\nTotal : "+result.getInt("TOTAL"));
            }
        }
        catch (SQLException e ){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JDBCOperation jdbc = new JDBCOperation();
        DataSource ds = jdbc.createDataSource();
        jdbc.displayTable(ds);




    }
}
