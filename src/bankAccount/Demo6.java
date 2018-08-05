// Test accountInfo() method
package bankAccount;
public class Demo6
{
    public static void main(String[] args)
    {
        Bank csumbBank = new Bank("CSUMB");

        csumbBank.openAccount("BBB BBB", "Address B", 22222, 2222, 1, 2.0);
        csumbBank.openAccount("CCC CCC", "Address C", 33333, 3333, 1, 3.0);
        csumbBank.openAccount("AAA AAA", "Address A", 11111, 1111, 1, 1.0);
        csumbBank.openAccount("DDD DDD", "Address D", 44444, 4444, 1, 4.0);

        System.out.println("\n\n===== ANSWER: false =====");
        System.out.println(csumbBank.accountInfo(4445));

        System.out.println("\n\n===== ANSWER: One Account (3333- CCC CCC: $3.00, Address C) =====");
        csumbBank.accountInfo(3333);
        System.out.println("\n");
    }
}