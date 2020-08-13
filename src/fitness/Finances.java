/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness;


abstract class Payment
{
  
  public abstract void Payingmethod();
  public abstract double Paidamount();
  public final void finishpayment()
  {
      Payingmethod();
      Paidamount();
  }
}
class Credit extends Payment
{
    double amount=1000+0.1*1000;
    @Override
    public void Payingmethod()
    {
        System.out.println("Enter credit card number");
    }
    @Override
    public double Paidamount()
    {
        System.out.println("pay "+(amount+0.1*amount));
        return amount;
    }
}
class Deposit extends Payment
{
    int amount=1000;
    int bankaccount=26;
    @Override
    public void Payingmethod()
    {
        System.out.println("pay the deposit at "+bankaccount);
    }
    @Override
     public double Paidamount()
    {
        System.out.println("pay "+amount);
        return amount;
    }
}
class Nullpayment extends Payment
{
    int amount=0;
     @Override
     public void Payingmethod()
    {
        System.out.println("you will have to watch ads , to remove them you have to pay");
    }
     @Override
    public double Paidamount()
    {
        System.out.println("paid amount = zero ");
        return amount;
    }
}
public class Finances {
    
}
