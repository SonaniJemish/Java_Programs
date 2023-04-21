import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.beans.Statement;

public class Pr_12_CreateTable {
    static final String dburl = "jdbc:mysql://localhost:3307/ajava";
    static final String user = "root";
    static final String pass = "root";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(dburl, user, pass);
            java.sql.Statement stmt;
            stmt= conn.createStatement();

            String sql = "create table student(enrno int(12),pass varchar(20),name varchar(30), email varchar(30),mobile int(10),city varchar(10))";
            stmt.executeUpdate(sql);
            System.out.println("Table Created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
