/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness;

import java.util.ArrayList;


class Recipies
{
  String name;
  int calories;
  Recipies(String name,int calories)
  {
      this.name=name;
      this.calories=calories;
  }
  public boolean isweightlossrecipies()
  {
      if(calories<100)
          return true;
      else 
          return false;
  }    
}
abstract class Meals
{
    
    public abstract ArrayList<Recipies> AssignMeals();
}
class WeightlossMeals extends Meals
{
    ArrayList<Recipies> weightlossassignedfood= new ArrayList();
    @Override
    public ArrayList<Recipies> AssignMeals()
    {
        for(int i=0;i<Userdatabase.getFood().size();i++)
        {
           Recipies m=(Recipies)Userdatabase.getFood().get(i);
            if(m.isweightlossrecipies())
            {
                weightlossassignedfood.add(m);
            }
        }
        for(int i=0;i<weightlossassignedfood.size();i++)
        {
            System.out.println("weightloss assigned food "+weightlossassignedfood.get(i).name);
        }
        return weightlossassignedfood;
    }
  
}
class WeightgainMeals extends Meals
{
    ArrayList<Recipies> weightgainassignedfood= new ArrayList();
    @Override
    public ArrayList<Recipies> AssignMeals()
    {
        for(int i=0;i<Userdatabase.getFood().size();i++)
        {
           Recipies m=(Recipies)Userdatabase.getFood().get(i);
            if(!m.isweightlossrecipies())
            {
                weightgainassignedfood.add(m);
            }
        }
         for(int i=0;i<weightgainassignedfood.size();i++)
        {
            System.out.println("weightgain assigned food "+weightgainassignedfood.get(i).name);
        }
        return weightgainassignedfood;
    }
  
}
class Variousmeals extends Meals
{
    ArrayList<Recipies> food= new ArrayList<>();
    @Override
    public ArrayList<Recipies> AssignMeals()
    {
        for(int i=0;i<Userdatabase.getFood().size();i++)
        {
           Recipies m=(Recipies)Userdatabase.getFood().get(i);
            
                food.add(m);
            
        }
       
        return food;
    }
}
public class Food {
    
}
