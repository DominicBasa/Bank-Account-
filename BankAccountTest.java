public class BankAccountTest {
  public static void main(String[] args) {
    BankAccount bankAccount1 = new BankAccount(300.00, 3000.00);
    
    bankAccount1.depositChecking(200.00);
    System.out.printf("Checking Balance: %.2f%n", bankAccount1.getCheckingBalance());

    bankAccount1.withdrawChecking(100);
    System.out.printf("Checking Balance: %.2f%n", bankAccount1.getCheckingBalance());

    bankAccount1.getCheckingBalance();
    System.out.printf("Checking Balance: %.2f%n", bankAccount1.getCheckingBalance());

    bankAccount1.getSavingsBalance();
    System.out.printf("Checking Balance: %.2f%n", bankAccount1.getSavingsBalance());
  }
}
