import java.sql.Connection;
import java.sql.SQLException;

public class Loan {
    private int ID;
    private float EMI;
    private float interest;
    private int amount;
    private int duration;

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getInterest() {
        return interest;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public float getEMI(int bankID, int loanID, Connect con1,Connection con) throws SQLException {
        this.interest=con1.getInterest(con,loanID,bankID);
        float inter = (this.amount)*(this.interest)/100.0f;
        this.EMI=(inter)+(float)(this.amount/this.duration);
        return EMI;
    }
    //public float
}
