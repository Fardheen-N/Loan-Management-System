import java.sql.*;

public class Connect{

    void display(Connection con) throws SQLException {
        Statement stm = con.createStatement();
        ResultSet rs=stm.executeQuery("select * from loan ;");
        rs.next();
        System.out.println(rs.getFloat("EMI"));
    }
    void query(Connection con) throws Exception{
        Statement stm = con.createStatement();
        stm.executeUpdate("update loan set EMI=50.0 where ID=2;");
    }

}
