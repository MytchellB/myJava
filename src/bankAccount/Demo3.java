// Test openAccount() method.
package bankAccount;
public class Demo3
{
    public static void main(String[] args)
    {
        Bank csumbBank = new Bank("CSUMB");

        System.out.println("\n\n===== ANSWER: true, false, false, true, true, true, true, false =====");
        System.out.println(csumbBank.openAccount("AAA AAA", "Address A", 11111, 1111, 1, 1.0));
        System.out.println(csumbBank.openAccount("ERROR1 ERROR1", "Address E1", 11111, 2020, 1, 1.0));
        System.out.println(csumbBank.openAccount("ERROR2 ERROR2", "Address E2", 22222, 1111, 1, 1.0));
        System.out.println(csumbBank.openAccount("BBB BBB", "Address B", 22222, 2222, 1, 2.0));
        System.out.println(csumbBank.openAccount("CCC CCC", "Address C", 33333, 3333, 1, 3.0));
        System.out.println(csumbBank.openAccount("DDD DDD", "Address D", 44444, 4444, 1, 4.0));
        System.out.println(csumbBank.openAccount("EEE EEE", "Address E", 55555, 5555, 1, 5.0));
        System.out.println(csumbBank.openAccount("ERROR3 ERROR3", "Address E3", 88888, 8888, 1, 9999.0));
        System.out.println("\n");
    }
}

