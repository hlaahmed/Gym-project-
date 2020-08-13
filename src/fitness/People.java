/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness;

import static java.lang.Math.pow;
import java.util.ArrayList;

abstract class User
{ 
   String name;
   Payment method;
   User(String name)
    {
        this.name=name;
       
    }
 
    public void Pay(){method.finishpayment();};
    public int Calculatecalories(String name)
    {
        CaloriesCalc c = new CaloriesCalc();
        return c.calculate(name);
    }
}
class Member extends User
{
    String Email,Password;
    int weight;
    double height;
    double Bodymassindex;
    boolean loggedin;
    exercises e;
    ArrayList<Recipies> f ;
   
    Member(String name,String Email,String Password,int weight,double height)
    {
        super(name);
        Bodymassindex=weight/(pow((double)height,2));
        method = new Credit();
        f= new Variousmeals().AssignMeals(); 
        e= new Nullexercise() ;
        loggedin=false;
    }
     public void setPayment(Payment method)
    {
        if(method.Paidamount()==0)
        {
            System.out.println("invalid");
        }
        else
        this.method=method;
    }
     public boolean isValid(String Email,String Password)
     {
         for(int i=0;i<Userdatabase.getMembers().size();i++)
         {
             Member m=(Member)Userdatabase.getMembers().get(i);
             if(m.Email.equals(Email)&&m.Password.equals(Password))
                 return true;
            
         }
         return false;
     }
     public void RequestFitnessplan()
     {
         if(loggedin)
           Planmediator.assignplanto(this);
         else
         {
             System.out.println("enter the system first");
         }
     }
    
}
class Guest extends User
{
    Guest(String name)
    {
        super(name);
        method = new Nullpayment();
    }
}
class Trainer
{
    public static ArrayList<Recipies> assignfitnessmeals(double Bodymassindex)
    {
        Meals f;
        ArrayList<Recipies> assignedmeals;
            if(Bodymassindex<18)
            {
                f=new WeightgainMeals();
                assignedmeals=f.AssignMeals();
            }
            else if(Bodymassindex>24.9)
            {
                f=new WeightlossMeals();
                assignedmeals=f.AssignMeals();
            }
            else
            {
                f=new Variousmeals();
                assignedmeals=f.AssignMeals();
            }
                
         return assignedmeals;
       
    }
    
    public static exercises assignExercise(double Bodymassindex)
    {
        exercises e;
            if(Bodymassindex<18)
            {
               e= new bodybuilding(); 
               
            }
            else if(Bodymassindex>24.9)
            {
                 e= new aerobics();
                
            }
           else 
                e= new Nullexercise();
        return e;
    }
    
}
 class Planmediator
{
    public static void assignplanto(Member m)
    {
        
        m.f=Trainer.assignfitnessmeals(m.Bodymassindex);
        m.e=Trainer.assignExercise(m.Bodymassindex);
    }
}
public class People {
    
}
