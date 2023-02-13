import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void wtihdrawal(double amount) {     // METHOD TO CHECK THE ENTERED AMOUNT WITH THE BALANCE IN
        if (amount > balance) {
            System.out.println("Insufficient Funds!!");
        } else {
            System.out.println("Processing your withdrawal request....");
            System.out.println("Collect the cash!!");
            System.out.println("Balance: " + (balance -= amount));
        }
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount(7000); // created an object with 7000 as the amount in the bank account
        Scanner sc = new Scanner(System.in);
        boolean runAgain = true;

        while(runAgain) {
            System.out.println("Enter amount you want to withdraw:");  // CALLING A METHOD THROUGH OBJECT AND PASSING A PARAMETER.
            double amount = sc.nextInt();
            account.wtihdrawal(amount);

            System.out.println("Press 1, if you want to withdraw again?");
            int again = sc.nextInt();
            if(again == 1){
                runAgain=true;
            }else {
                runAgain=false;
            }
        }
    }
}
