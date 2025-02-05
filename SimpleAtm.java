import java.util.Scanner;

 class SimpleATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00;  // Initial balance
        int choice;

        do {
            System.out.println("\nWelcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            if (choice == 1) {  // Check Balance
                System.out.println("Your current balance is: $" + balance);
            } 
            else if (choice == 2) {  // Deposit
                System.out.print("Enter amount to deposit: $");
                double depositAmount = scanner.nextDouble();
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("Deposit successful! New balance: $" + balance);
                } else {
                    System.out.println("Invalid amount. Please enter a positive value.");
                }
            } 
            else if (choice == 3) {  // Withdraw
                System.out.print("Enter amount to withdraw: $");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount > 0 && withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal successful! New balance: $" + balance);
                } else if (withdrawAmount > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    System.out.println("Invalid amount. Please enter a positive value.");
                }
            } 
            else if (choice == 4) {  // Exit
                System.out.println("Thank you for using the ATM. Goodbye!");
            } 
            else {
                System.out.println("Invalid option! Please choose again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}