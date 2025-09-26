public class Encapsulation {
    static class BankAccount {
        private final String accountNumber;
        private double balance;
        private final String owner;
        
        public BankAccount(String accountNumber, String owner) {
            this.accountNumber = accountNumber;
            this.owner = owner;
            this.balance = 0.0;
        }
        
        public String getAccountNumber() {
            return accountNumber;
        }
        
        public String getOwner() {
            return owner;
        }
        
        public double getBalance() {
            return balance;
        }
        
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }
        
        public boolean withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                return true;
            }
            return false;
        }
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "Amrul Hadi");
        
        account.deposit(1000);
        System.out.println("(>) Balance: " + account.getBalance());
        
        boolean withdrawSuccess = account.withdraw(500);
        System.out.println("(>) Withdrawal successful: " + withdrawSuccess);
        System.out.println("(>) New balance: " + account.getBalance());
    }
}
