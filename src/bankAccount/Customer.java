//Title: Customer
//Abstract: Bottom level class, information can only be accessed through account using getters and setters. Holds customer's info.
//Author: Mytchell Beaton
//Date: 9/21/17
package bankAccount;
public class Customer {
    private String customerName;
    private String address;
    private int ssn;

    public Customer ( String customerName, String address, int ssn ){
        this.customerName = customerName;
        this.address = address;
        this.ssn = ssn;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
}