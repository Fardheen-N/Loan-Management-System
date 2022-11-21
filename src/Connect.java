import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect{

    String url = "jdbc:mysql://localhost:3306/miniproject";
    String username="root";
    String password="007007";
    java.sql.Connection con;
    void Connect() throws Exception {
         this.con = DriverManager.getConnection(url, username, password);
         Statement stm = con.createStatement();
    }
    void display() throws SQLException {
        Statement stm = con.createStatement();
        ResultSet rs=stm.executeQuery("select * from loan ;");
    }
    void query() throws Exception{
        Statement stm = con.createStatement();
        stm.executeUpdate("INSERT INTO client " + "VALUES (1234,'Zoro','covai',987654321,')");
    }

}
