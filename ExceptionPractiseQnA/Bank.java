package ExceptionPractiseQnA;
import java.util.HashMap;

class Bank{
    public HashMap<String, BankAccount> accounts = new HashMap<>();
    // Add a new account to the bank
    public void addAccount(String accountNumber, double initialBalance) {
        BankAccount account = new BankAccount(accountNumber, initialBalance);
        accounts.put(accountNumber, account);
        System.out.println("Account added: " + account);
    }
        // Get an account by its number with exception handling for invalid account
        BankAccount getAccount(String accountNumber) throws InvalidAccountException 
        {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) {
            throw new InvalidAccountException("Invalid account number: " + accountNumber);
        }
        return account;
    }
}
