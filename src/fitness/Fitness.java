/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness;

import java.util.Scanner;
class start
{
 public static Member Newmember(){
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter name , Email , password : ");
 String name=sc.next();  
 String Email=sc.next(); 
 String Password=sc.next(); 
 System.out.print("Enter weight in Kgs and height in meter : ");
 int Weight= sc.nextInt();
 double height= sc.nextDouble();
 Member m = new Member(name,Email,Password,Weight,height);
 return m;
 }
 public static Guest Newguest()
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter name ");
   String name=sc.next(); 
   Guest g= new Guest(name);
   return g;
 }
 public static int recipytobecalc()
 {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the name of the recipy that you want to know its calories ");
      String name= sc.next();
      CaloriesCalc c = new CaloriesCalc();
      return c.calculate(name);
 }
}

public class Fitness {
 
   
    public static void main(String[] args) {
       Userdatabase.initialize();
       // example to test the system
       
        Member m = start.Newmember();
        AccessExecutor c = new AccessExecutor();
        Signupcommand s = new Signupcommand(m);
        c.setcommand(s);
        c.invoke();
        m.RequestFitnessplan();
        m.e.print();
        Guest g = start.Newguest();
        System.out.println("salad"+g.Calculatecalories("Salad"));
      
        
     
    }
    
}
