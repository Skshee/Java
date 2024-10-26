package ExceptionPractiseQnA;
import java.util.HashMap;

class BankAccount{
    public int AccNo;
    public double  Balance;

    BankAccount(int AccNo,double initialBalance){
        this.AccNo = AccNo;
        Balance= initialBalance;
    }

    public void deposit(double amount) throws InvalidAmountException{
        if(amount > 0){
            Balance += amount;
            System.out.println("Deposited Rs. " + amount + " in your account");
        }
        else{
            throw new InvalidAmountException ("Invalid deposit amount");
        }
}

    public void withdraw(double amount) throws  InvalidAmountException,InsufficientBalanceException{

        if(amount <=Balance){
            Balance -= amount;
            System.out.println("Withdrawn Rs. " + amount + " in your account");
            System.out.println("Current Balance ="+ Balance);
        }
        else if(amount  > Balance){

            throw new InsufficientBalanceException("Insufficient balance");

        }
        else if(amount <= 0){
            throw new InvalidAmountException("Invalid withdrawal amount");
        }
    }

    public  double getBalance(){
        return Balance;
    }

    public int getAccNo(){
        return AccNo;
    }

    public String Display(){
        return  "Account Number: " + AccNo + "\n" + "Balance: " + Balance;
    }
}




