//Title: BankDemo
//Abstract: Tests out bank, account, and customer classes.
//Author: Mytchell Beaton
//Date: 9/21/17
package bankAccount;
public class BankDemo {
    public static void main(String[] args) {
        Bank csumbBank = new Bank("CSUMB");

        System.out.println("\n========== Three New Accounts ==========");
        csumbBank.openAccount("Tom Smith", "123 University Center 93955",
                77777, 1000, 1, 10.0);
        csumbBank.openAccount("Alice Smith", "123 University Center 93955",
                88888, 2000, 1, 50.25);
        csumbBank.openAccount("Joe Otter", "2440 Ocean Avenue 93900",
                99999, 3000, 2, 100.25);

        System.out.println("\n========== Bank Info ==========");
        csumbBank.bankInfo();

        System.out.println("\n========== Close Account ==========");
        System.out.println(csumbBank.closeAccount(1000));
        System.out.println(csumbBank.closeAccount(7000));

        System.out.println("\n========== Account Info ==========");
        csumbBank.accountInfo(2000);
        csumbBank.accountInfo(7000);

        csumbBank.updateAddress( 2000, "Candy Land"); // Testing out update address and balance methods, then printing account info again.
        csumbBank.updateBalance( 2000, 9000.01 );
        csumbBank.accountInfo( 2000 );

    }
}