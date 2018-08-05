//Title: Bank
//Abstract: Holds bank info and an array of accounts held at this bank. Our top level class that holds 2 classes within it.
//Author: Mytchell Beaton
//Date: 9/21/17
package bankAccount;
import java.util.Scanner;

public class Bank {
    Scanner keyboard = new Scanner(System.in);

    private String bankName;
    private Account accounts[] = new Account[5]; // This holds our accounts, which hold customers within them.
    private int numOfAccounts = 0; // Helpful int to keep track of how many accounts are currently open at this bank.
    private double bankTotalBalance = 0; // Holds the total balance the bank holds, across all user accounts.

    public Bank( String name ){
        this.bankName = name;
    }

    public String toString(){
        return this.bankName + " " + accounts;
    }

    public boolean openAccount( String customerName, String address, int ssn, int accNum, int accType, double balance ){

        if ( numOfAccounts == 5 ){
            System.out.println("Maximum number of accounts have been created at this bank, exiting.");
            return false; // Cancels method if maximum number of accounts has already been reached.
        }

        for ( int i = 0; i < numOfAccounts; i++ ){
            if ( accNum == accounts[i].getAccNum()){
                System.out.println("This account number already exists, cancelling account creation.");
                return false; // Cancels method if account number already exists.
            }
            if ( ssn == accounts[i].getCustomerSsn()){ // Cancels if SSN already exists at this bank.
                System.out.println("This SSN already exists at this bank, cancelling account creation.");
                return false;
            }
        }

        // Creates new account object.
        // Account # created is kept track of by numOfAccounts.
        System.out.println("New account with acc number " + accNum + " created.");
        accounts[numOfAccounts] = new Account( customerName, address, ssn, accNum, accType, balance);
        numOfAccounts++; // Adds 1 to the account number count.
        return true;
    }

    public void bankInfo(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Number of Accounts: " + numOfAccounts);

        for ( int i = 0; i < numOfAccounts; i++ ) {
            try {
                System.out.println("    " + accounts[i].getAccNum() + ": $" + accounts[i].getBalance() + " - " +
                        accounts[i].getCustomerName() + ": " + accounts[i].getCustomerSsn());
                bankTotalBalance += accounts[i].getBalance(); // Add up our bank's total balance as we go through our accounts.
            }
            catch(NullPointerException e){}
        }
        System.out.println("Bank Total Balance: $" + bankTotalBalance);
    }

    public boolean closeAccount( int accNum ){
        for ( int i = 0; i < numOfAccounts; i++) {
            try {
                if (accounts[i].getAccNum() == accNum) {
                    accounts[i] = null; // Closes the account by setting the object to null.
                    System.out.println("Account " + accNum + " closed.");
                    numOfAccounts--; // Takes away 1 account from numOfAccounts.
                    for (int j = 0; j < numOfAccounts; j++) { // This is meant to fix the account closing error. Seems to work, test with 3 accounts though.
                        if (i == 0) {
                            accounts[j] = accounts[j + 1];
                        }
                        else{
                            if ( j == numOfAccounts - 1){
                                accounts[i + j] = null; // Set the last array value equal to null, as we fixed all the other values.
                            }
                            else {
                                accounts[i + j] = accounts[j + i + 1];
                            }
                        }
                    }
                    return true;
                }
            }
            catch(NullPointerException e){
            }
        }
        System.out.println("No account with number " + accNum + " exists, exiting.");
        return false; // If no account with that number is found, returns false.
    }

    public boolean accountInfo( int accNum ){
        int noneFound = 0;
        for ( int i = 0; i < numOfAccounts; i++ ){
            if ( accounts[i].getAccNum() == accNum ){
                System.out.println("Account Info: Account Number: " + accNum);
                if ( accounts[i].getAccType() == 1 ) {
                    System.out.println("              Checking account");
                }
                else if ( accounts[i].getAccType() == 2){
                    System.out.println("              Savings account");
                }
                System.out.println("              Balance: $" + accounts[i].getBalance());
                System.out.println("Customer: " + accounts[i].getCustomerName());
                System.out.println("          " + accounts[i].getCustomerAddress());
                System.out.println("          SSN: " + accounts[i].getCustomerSsn() + "\n");
                noneFound = 1; // Sets to 1 because we found an account with that number.
                return true;
            }
        }
        if ( noneFound == 0 ){
            System.out.println("false, no account with number " + accNum + " exists.\n");
            return false;
        }
        return false;
    }

    public boolean updateAddress( int accNum, String address ){ // Changes the user's address to a new String, if account number exists.
        for ( int i = 0; i < numOfAccounts; i++ ){
            if ( accounts[i].getAccNum() == accNum ){
                accounts[i].setCustomerAddress( address );
                return true;
            }
        }
            System.out.println("No account with number " + accNum + " exists.\n");
            return false;
    }

    public boolean updateBalance( int accNum, double balance ){ // Changes the user's balance to a new value, if account number exists.
        for ( int i = 0; i < numOfAccounts; i++ ){
            if ( accounts[i].getAccNum() == accNum ){
                accounts[i].setBalance( balance );
                return true;
            }
        }
        System.out.println("No account with number " + accNum + " exists.\n");
        return false;
    }
}