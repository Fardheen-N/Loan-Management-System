import java.sql.*;

public class Connect{

    void display(Connection con,int ID) throws SQLException {
        Statement stm = con.createStatement();
        ResultSet rs=stm.executeQuery("select B.bankName,L.EMI,L.interest,L.minDuration,L.maxDuration,L.penalty from loan as L inner join  bank as B on L.bankID = B.bankID where ID=1");
        while(rs.next())
        System.out.println(rs.getInt("minDuration"));
    }
    void getLoanInfo(Connection con) throws SQLException {
        Statement stm = con.createStatement();
        ResultSet rs=stm.executeQuery("select * from loantype");
        System.out.println("Loan details");
        System.out.println("Choice"+"\t\t"+"Loan Name");
        while(rs.next())
        {
            System.out.println(rs.getInt("loanID")+"\t\t\t"+rs.getString("loanname"));
        }
    }

    void setEmi(Connection con,float Emi,int ID) throws Exception{
        Statement stm = con.createStatement();
        stm.executeUpdate("update loan set EMI = "+Emi+" where bankID = "+ID+";");
    }
    void setInterest(Connection con,float interest,int ID) throws Exception{
        Statement stm = con.createStatement();
        stm.executeUpdate("update loan set EMI = "+interest+" where bankID = "+ID+";");
    }

}
