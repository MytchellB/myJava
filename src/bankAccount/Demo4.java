// Test closeAccount() method
package bankAccount;
public class Demo4
{
    public static void main(String[] args)
    {
        Bank csumbBank = new Bank("CSUMB");

        csumbBank.openAccount("AAA ANSWER", "Address A", 11111, 1111, 1, 1.0);
        csumbBank.openAccount("BBB BBB", "Address B", 22222, 2222, 1, 2.0);
        csumbBank.openAccount("CCC CCC", "Address C", 33333, 3333, 1, 3.0);
        csumbBank.openAccount("DDD DDD", "Address D", 44444, 4444, 1, 4.0);

        csumbBank.closeAccount(2222);
        csumbBank.closeAccount(7000);
        csumbBank.closeAccount(2222);
        csumbBank.closeAccount(5555);
        csumbBank.closeAccount(4444);
        csumbBank.closeAccount(4444);
        csumbBank.closeAccount(4444);
        csumbBank.closeAccount(3333);

        System.out.println("\n\n===== ANSWER: One Account (1111- AAA ANSWER: $1.00) =====");
        csumbBank.bankInfo();
        System.out.println("\n");
    }
}

