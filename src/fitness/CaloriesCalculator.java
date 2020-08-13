/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness;

/**
 *
 * @author Hla
 */
class CaloriesCalc {
     Recipies R;
     int cal;
    int  calculate(String name){
        for(int i = 0 ; i<Userdatabase.getFood().size();i++)
        {
            R=(Recipies)Userdatabase.getFood().get(i);
            if(name == R.name )
            {
                cal = R.calories;
                 return cal;
            }
        }
        System.out.println("Not Found");
        return -1 ;
    }
         


}
public class CaloriesCalculator {
    
}
