import java.sql.*;

public class Connect{

    void display(Connection con,int ID) throws SQLException {
        Statement stm = con.createStatement();
        ResultSet rs=stm.executeQuery("select B.bankName,L.EMI,L.interest,L.minDuration,L.maxDuration,L.penalty from loan as L inner join  bank as B on L.bankID = B.bankID where ID=1");
        System.out.println("Bankname\tEMI\tInterest per month\tminimum time\tmaximum time\tPenalty per month");
        while(rs.next())
        System.out.println(rs.getString("B.bankname")+"\t\t"+rs.getFloat("L.EMI")+"\t\t"+rs.getFloat("L.interest")+"\t\t"+rs.getInt("L.minDuration")+"\t\t"+rs.getInt("L.maxDuration")+"\t\t"+rs.getInt("L.penalty"));
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
    float getInterest(Connection con,int loanID,int bankID) throws SQLException {
        Statement stm = con.createStatement();
        ResultSet rs=stm.executeQuery("select * from loantype where loanID="+loanID);
        ResultSet rt=stm.executeQuery("select * from bank where bankID="+bankID);
        float interest=rs.getFloat("interest")+rt.getFloat("PI");
        return interest;
    }


}
