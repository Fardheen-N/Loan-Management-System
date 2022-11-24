import java.sql.Connection;
import java.sql.SQLException;

public class Loan {
    private int ID;
    private float EMI;
    private float interest;

    public float getEMI(int bankID, int loanID, Connect con1,Connection con) throws SQLException {
        float inter=con1.getInterest(con,loanID,bankID);
        inter /= 2;
        this.EMI=inter;
        return EMI;
    }
    //public float
}
