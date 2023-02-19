import java.util.*;
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdrawal(double amount) {     // METHOD TO CHECK THE ENTERED AMOUNT WITH THE BALANCE IN
        if (amount > balance) {
            System.out.println("Insufficient Funds!!");
            System.out.println("Your account balance is: "+balance);
        } else {
            System.out.println("Processing your withdrawal request....");
            System.out.println("Collect the cash!!");
            System.out.println("Balance: " + (balance -= amount));
        }
    }

    public static void main(String[] args) {

        Account account = new Account(7000); // created an object with 7000 as the amount in the bank account
        Scanner sc = new Scanner(System.in);
        boolean runAgain = true;

        while(runAgain) {
            System.out.println("Enter amount you want to withdraw:");  // CALLING A METHOD THROUGH OBJECT AND PASSING A PARAMETER.
            double amount = sc.nextInt();
            account.withdrawal(amount);

            System.out.println("Press 1, if you want to withdraw again?");
            int again = sc.nextInt();
            if(again != 1){
                runAgain=false;
            }
        }
    }
}
