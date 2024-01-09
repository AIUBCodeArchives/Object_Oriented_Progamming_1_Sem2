import java.lang.*;

public class Account{
   protected int accnb;
   protected double balance;
   
   public Account()
   {
	   System.out.println("Empty for Account");
   }
   
   public Account(int accnb, double balance)
   {
	   this.accnb=accnb;
	   this.balance=balance;
	   //System.out.println("para for Account");
   }
   
   public void setaccnb(int accnb)
   {
	   this.accnb = accnb;
   }
   
   public void setbalance(double balance)
   {
	   this.balance = balance;
   }
   
   public int getaccnb()
   {
	   return accnb;
   }
   
   public double getbalance()
   {
	   return balance;
   }
   
   public void details()
   {
	   System.out.println("Account Number: "+accnb+"\n"+"Account Balance: "+balance);
   }




}