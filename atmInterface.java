import java.util.Scanner;

public class atmInterface {
    public static void main(String[] args) {
        Atm a1 = new Atm();
        a1.checkPin();
    }
}

class Atm {
    Scanner sc = new Scanner(System.in);

    double balance = 0;
    int PIN = 0000;

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println(" Available Balance: ₹" + getBalance());
        menu();
    }

    void depositMoney() {

        System.out.print("Enter The Amount You Want To DEPOSIT: ₹");
        double depositAmount = sc.nextInt();

        setBalance(balance + depositAmount);

        System.out.println("\n    Amount Deposited Successfully\n    Updated Balance:  ₹" + getBalance());

        menu();
    }

    void withdrawMoney() {

        System.out.print("Enter The Amount You Want To WITHDRAW: ₹");
        int withdrawAmount = sc.nextInt();

        if (withdrawAmount < getBalance()) {
            setBalance(balance - withdrawAmount);
            System.out.println("\n Amount Withdrawl Successfull\n  Updated Balance: ₹" + getBalance());

        } else {
            System.out.println("\n  Insufficient Funds ");
        }
        menu();
    }


    void checkPin() {
        System.out.print("Enter Your Pin: ");
        int pin = sc.nextInt();

        if (pin == PIN) {
            System.out.println();
            menu();
        } else {
            System.out.println("Enter A Valid Pin");

            System.out.print("\nEnter Your Pin Again: ");
            int pin2 = sc.nextInt();


            if (pin2 == PIN) {
                menu();
            }
            else {
                System.out.println("Enter A Valid Pin");
                System.out.print("\nEnter Your Pin : ");
                int pin3 = sc.nextInt();

                if (pin3 == PIN) {

                    menu();
                }
                else {
                    System.out.println("Your Card Has Been Blocked");
                }
            }
        }
    }



    void menu() {

        System.out.println("1. Deposit Money\n2. Withdraw Money\n3. A/C Balance\n4. Exit");

        System.out.print(" Choose One Option, Press(1-4): ");
        int option = sc.nextInt();

        while (true) {
            if (option == 1) {
                depositMoney();
            } else if (option == 2) {
                withdrawMoney();
            } else if (option == 3) {
                checkBalance();
            } else if (option == 4) {
                System.out.println("  Exited  ");
                System.exit(0);
            } else {
                System.out.println(" Choose A Valid Option");
                menu();
            }
        }
    }
}