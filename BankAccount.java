//Pair program with Rochelle B.

public class BankAccount {
  private double checkingBalance;
  private double savingsBalance; 
  private static int numOfAccounts = 0;
  private static double accountBalance =0;
  
//?      CONSTRUCTOR
  public BankAccount(double checkingBalance, double savingsBalance) {
    this.checkingBalance = 0;
    this.savingsBalance = 0;
    BankAccount.numOfAccounts++;
  }

//? SETTER 
  public boolean depositChecking(double deposit) {
    if (deposit < 0) {
      return false;
    }
    this.checkingBalance += deposit;
    BankAccount.accountBalance += deposit;
    return true;
  }
  public boolean depositSavings(double deposit) {
    if (deposit < 0) {
      return false;
    }
    this.savingsBalance += deposit;
    BankAccount.accountBalance += deposit;
    return true;
  }

  public boolean withdrawChecking(double withdrawal) {
    if (withdrawal < 0){
      return false;
    }else if (withdrawal > this.checkingBalance){
      return false;
    }
    this.checkingBalance -= withdrawal;
    BankAccount.accountBalance -= withdrawal;
    return true; 
  }
  
  public boolean withdrawSaving(double withdrawal) {
    if (withdrawal < 0){
      return false;
    }else if (withdrawal > this.savingsBalance){
      return false;
    }
    this.savingsBalance -= withdrawal;
    BankAccount.accountBalance -= withdrawal;
    return true; 
  }

  //? GETTER
  public double getCheckingBalance(){
    return this.checkingBalance;
  } 

  public double getSavingsBalance(){
    return this.savingsBalance;
  }
//? SHOW 
  public void display() {
    System.out.printf("Checking account balance: $%.2f ", this.getCheckingBalance());
    System.out.printf("Savings  account balance: $%.2f", this.getSavingsBalance());
  }
}