import java.util.Scanner;

public class Account {
    double balance;
    String accountNumber;

    //no arguments
    public Account(){
        this.balance=Math.random();
    }

    //two arguments
    public Account(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("After depositing tha amount :"+balance);
    }

    void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("After withdrawal amount :"+balance);
        }
        else{
            System.out.println("insufficient balance" );
        }
    }

    void display(){
        System.out.println("Balance :"+balance);
    }

    public static void main(String[] args) {
        Account account1=new Account();
        Account account2=new Account("BC10987",97000);
        account2.display();
        account2.deposit(500);
        account2.withdraw(2000);
        account2.display();
    }
}
