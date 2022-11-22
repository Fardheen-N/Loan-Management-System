import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

//select B.bankName,L.EMI,L.interest,L.minDuration,L.maxDuration,L.penalty from loan as L inner join  bank as B on L.bankID = B.bankID where ID=1
public class Main {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/miniproject";
        String username="root";
        String password="007007";
        Scanner sc = new Scanner(System.in);
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Hello User Welcome....");
        Connect con1 = new Connect();
        float emi=0.0f;
        float interest=0.0f;
        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        con1.getLoanInfo(con);
        System.out.println("Enter your choice : ");
        int loanID=sc.nextInt();
//        con1.setEmi(con,emi,ID);
//        con1.display(con,ID);
    }
}