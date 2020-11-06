import java.util.*;
import java.lang.*;

class Account {

    String name, abc;
    int accNo;
    char accType;
    double bal = 0;
    double deposit;
    Scanner in = new Scanner(System.in);

    void input_data() {

        System.out.println("Enter your account type (S/C):");
        abc = in.nextLine();
        accType = abc.charAt(0);
    }

    void deposit() {

        System.out.println("Enter an amount to deposit: ");
        deposit = in.nextDouble();

        bal += deposit;
        System.out.println("Balance has been updated. ");
    }

    void view_balance() {

        System.out.println("Balance = " + bal);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x;
        Account a1 = new Account();
        a1.input_data();

        if (a1.accType == 'C' || a1.accType == 'c') {

            Current a2 = new Current();

            do {
                System.out.println("WELCOME TO YOUR CURRENT ACCOUNT");
                System.out.println("1. Deposit ");
                System.out.println("2. Check Balance ");
                System.out.println("3. Issue Cheque ");
                System.out.println("4. Exit");
                System.out.println("Enter your choice: ");
                x = s.nextInt();

                switch (x) {
                    case 1:
                        a2.deposit();
                        break;
                    case 2:
                        a2.check_balance();
                        break;
                    case 3:
                        a2.issue_cheque();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("ERROR. INVALID CHOICE.");
                }

            } while (x <= 4 && x >= 1);
        } else if (a1.accType == 'S' || a1.accType == 's') {

            Savings a3 = new Savings();

            do {
                System.out.println("WELCOME TO YOUR SAVINGS ACCOUNT");
                System.out.println("1. Deposit");
                System.out.println("2. View Balance");
                System.out.println("3. Withdraw ");
                System.out.println("4. Calculate compound interest ");
                System.out.println("5. Exit ");
                System.out.println("Enter your choice: ");
                x = s.nextInt();

                switch (x) {
                    case 1:
                        a3.deposit();
                        break;
                    case 2:
                        a3.view_balance();
                        break;
                    case 3:
                        a3.withdraw_balance();
                        break;
                    case 4:
                        a3.compute_CI();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("ERROR. INVALID CHOICE.");
                }

            } while (x <= 5 && x >= 1);
        } else
            System.out.println("INVALID ACCOUNT TYPE");
    }
}

class Current extends Account {

    Current() {

        System.out.println("Enter your name: ");
        name = in.nextLine();

        System.out.println("Enter your account number: ");
        accNo = in.nextInt();

        deposit();
    }

    double chq_amount;

    void issue_cheque() {

        System.out.println("Enter amount for which cheque is to be issued.");
        chq_amount = in.nextDouble();
        if (chq_amount > bal) {
            System.out.println("ERROR! Insufficient balance in account.");
        } else {
            bal -= chq_amount;
            System.out.println("Cheque has been issued SUCCESSFULLY");
        }
    }

    void check_balance() {

        if (bal < 1000) {

            System.out.println("Current available balance is lesser than minimum required balance.");
            bal -= 100;
            System.out.println("Service charge of Rs.100 has been deducted from your balance.");
        }
        view_balance();
    }
}

class Savings extends Account {

    double CI, withdrawal_ammount, time;

    Savings() {

        System.out.println("Enter your name: ");
        name = in.nextLine();

        System.out.println("Enter your account number: ");
        accNo = in.nextInt();

        deposit();
    }

    void compute_CI() {

        System.out.println("Enter time period in years: ");
        time = in.nextInt();
        CI = bal * Math.pow(1 + (0.08 / 12), 12 * time) - bal;
        System.out.println("CI = " + CI);
        bal += CI;
        System.out.println("CI has been deposited");
    }

    void withdraw_balance() {

        System.out.println("Enter the amount you want to withdraw: ");
        withdrawal_ammount = in.nextDouble();

        if (withdrawal_ammount > bal) {
            System.out.println("ERROR! THE ENTERED AMOUNT IS GREATER THAN THE AVAILABLE BALANCE...");
        } else {
            bal -= withdrawal_ammount;
            System.out.println("AMOUNT HAS SUCCESSFULLY BEEN WITHDRAWN!");
        }
    }

}