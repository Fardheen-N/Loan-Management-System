import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/miniproject";
        String username="root";
        String password="007007";
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Hello world!.....");
        Connect con1 = new Connect();
        con1.query(con);
        con1.display(con);
    }
}