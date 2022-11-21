import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        Connect con1 = new Connect();
        con1.display();
    }
}