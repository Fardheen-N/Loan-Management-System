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
        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        con1.getLoanInfo(con);
        System.out.println("\nEnter your choice : ");
        int loanID=sc.nextInt();
        Loan loan= new Loan();
        System.out.println("Enter amount you want to take loan:");
        loan.setAmount(sc.nextInt());
        con1.displayDuration(con,loanID);
        System.out.println("\nEnter num of month you want to take loan:");
        loan.setDuration(sc.nextInt());
        for(int i=1;i<=4;i++)
        {
            float emi=loan.getEMI(i,loanID,con1,con);
            con1.setEmi(con,emi,i);
            con1.setInterest(con,loan.getInterest(),i);
        }
        con1.display(con,loanID);
        System.out.println("\n\nARIGATHO GOSAIMUS ;)");
    }
}