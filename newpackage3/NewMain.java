package newpackage3;
import java.util.Scanner;
public class NewMain {
public static void main(String[] args)
{
    int a;
    double b;
    String c,d;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Name:");
    c=s.next();
    System.out.println("Enter Email:");
    d=s.next();
    System.out.println("Enter Account Number:");
    b=s.nextDouble();
    savingsAccount obj=new savingsAccount();
                obj.Name=c;
                obj.Email=d;
                obj.AccountNumber=b;
    currentAccount obj1=new currentAccount();
                obj1.Name=c;
                obj1.Email=d;
                obj1.AccountNumber=b;
    Boolean x=true;            
    while(x)
    {
    System.out.println("Select the operation:\n1.Deposit\n2.Withdraw\n3.Balance in Current account\n4.Balance in savings account\n5.Exit");
    a=s.nextInt();
    switch (a) {
        case 1:
            {
                int l;
                System.out.println("Enter Amount:");
                l=s.nextInt();
                obj.amount=(obj.amount+l);
                System.out.println("Deposited");
                break;
            }
        case 2:
            {
                int l;
                System.out.println("Enter Amount:");
                l=s.nextInt();
                obj1.amount=(obj1.amount-l);
                System.out.println("Withdrawn");
                break;
            }
        case 3:
        {
            obj1.getBalance();
     
            break;
        }
        case 4:
        {
            obj.getBalance();
     
            break;
        }
        case 5:
        {
            x=false;
            break;
        }    
        default:
        {
            System.out.println("Enter valid choice");
            break;
        }
    }
}
}
   
}
abstract class Account
{
    double AccountNumber;
    String Name;
    String Email;
    abstract double getBalance();
    abstract void deposit(int amount);
    abstract void withdraw(int amount);
}
class currentAccount extends Account
{
    int amount=50000;
    @Override
    public void withdraw(int amount)
    {
        this.amount=amount;
    }
    @Override
    public double getBalance()
    {
        double s=amount;
        System.out.println("Balance in current account:"+s);
        return s;
    }    
    @Override
    public void deposit(int amount)
    {
   
    }
    @Override
    public String toString()
    {
        return Name+Email+AccountNumber+amount;
    }
}
class savingsAccount extends Account
{
    int amount=50000;
    @Override
    public void deposit(int amount)
    {
        this.amount=amount;
    }
    @Override
    public double getBalance()
    {
        double s=amount;
        System.out.println("Balance in Savings account:"+s);
        return s;
    }
    @Override
    public void withdraw(int amount)
    {
   
    }
    @Override
    public String toString()
    {
        return Name+Email+AccountNumber+amount;
    }
}