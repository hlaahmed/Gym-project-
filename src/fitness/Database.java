/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness;

import java.util.ArrayList;


abstract class Userdatabase
{
    
     private static ArrayList<Member> data=new ArrayList<Member>();
     private static ArrayList<Recipies> food;
     public static void initialize()
     {
           Recipies R1= new Recipies("Salad",50);
           Recipies R2= new Recipies("icecream",150);
           Recipies R3 = new Recipies("Grilled Chicken",80);
           Recipies R4 = new Recipies("Cake",200);
           food=new ArrayList<Recipies>(){
    
            {
                add(R1);
                add(R2);
                add(R3);
                add(R4);
            }
            };  
     }
    
         
    public static ArrayList getMembers()
     {
         return data;
     }
     public static ArrayList getFood()
     {
        
         return food;
     }
}
public class Database {
    
}
