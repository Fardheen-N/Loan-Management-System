import java.sql.*;

public class Connect{

    void display(Connection con,int ID) throws SQLException {
        Statement stm = con.createStatement();
        ResultSet rs=stm.executeQuery("select B.bankName,L.EMI,L.interest,L.minDuration,L.maxDuration,L.penalty from loan as L inner join  bank as B on L.bankID = B.bankID where ID=1");
        System.out.printf("%s      %s       %s  %s\n","Bankname","EMI","Interest per month","Penalty per month");
        while(rs.next())
        System.out.printf("%-12s  %.2f   %.2f %18d\n",rs.getString("B.bankname"),rs.getFloat("L.EMI"),rs.getFloat("L.interest"),rs.getInt("L.penalty"));
        rs.close();
    }
    void displayDuration(Connection con,int ID) throws SQLException {
        Statement stm = con.createStatement();
        ResultSet rs=stm.executeQuery("select B.bankName,L.minDuration,L.maxDuration,L.penalty from loan as L inner join  bank as B on L.bankID = B.bankID where ID=1;");
        System.out.printf("%s    %s  %s  %s\n","Bankname","minDuration","maxDuration","Penalty per month");
        while(rs.next())
            System.out.printf("%-13s%-12s%-12s %-10s\n",rs.getString("B.bankname"),rs.getInt("L.minDuration"),rs.getInt("L.maxDuration"),rs.getInt("L.penalty"));
        rs.close();
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
        rs.close();
    }
    void setEmi(Connection con,float Emi,int ID) throws Exception{
        Statement stm = con.createStatement();
        stm.executeUpdate("update loan set EMI = "+Emi+" where bankID = "+ID+";");
    }
    void setInterest(Connection con,float interest,int ID) throws Exception{
        Statement stm = con.createStatement();
        stm.executeUpdate("update loan set interest = "+interest+" where bankID = "+ID+";");
    }
    float getInterest(Connection con,int loanID,int bankID) throws SQLException {
        Statement stm = con.createStatement();
        ResultSet rs=stm.executeQuery("select * from loantype where loanID="+loanID); rs.next();
        float interest=rs.getFloat("interest");rs.close();
        ResultSet rt=stm.executeQuery("select * from bank where bankID="+bankID);rt.next();
        interest+=rt.getFloat("PI");rt.close();
        return interest;
    }


}
