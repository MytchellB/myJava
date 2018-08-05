//Title: Account
//Abstract: The 2nd level in our bank class, holds account information and a customer object.
//Author: Mytchell Beaton
//Date: 9/21/17

package bankAccount;

public class Account {
    private int accNum;
    private int accType; // 1 is checking, 2 is savings account types.
    private Customer accountholder; // This holds our customer class.
    private double balance;

    public Account( String customerName, String address, int ssn, int accNum, int accType, double balance ){
        this.accNum = accNum;
        this.accType = accType;
        this.balance = balance;
        accountholder = new Customer( customerName, address, ssn ); // Creates new constructor with our customer info.
    }

    public String getCustomerName(){ // The purpose of these getters is to retrieve a variable from a class within a class, for the original class.
        return accountholder.getCustomerName();
    }

    public int getCustomerSsn(){
        return accountholder.getSsn();
    }

    public String getCustomerAddress(){
        return accountholder.getAddress();
    }

    public void setCustomerAddress( String address ){
        accountholder.setAddress( address );
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int getAccType() {
        return accType;
    }

    public void setAccType(int accType) {
        this.accType = accType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}