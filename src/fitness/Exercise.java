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
interface exercises {
    
    public void print();
    
}

class aerobics implements exercises {
    
    @Override
   public  void  print(){
        System.out.print("1-Jumping rope \n Duration and frequency: 15 to 25 minutes, 3 to 5 times per week \n Safety: Your jump rope should be adjusted for your height. Stand with both feet on the middle of the rope and extend the handles to your armpits. That’s the height you’re going for. If it’s too long, cut or tie it to avoid tripping on the rope.");
        
    }
}
class bodybuilding implements exercises
{
    @Override
    public void print()
    {
        System.out.println("lift weight using machine iv and do pushups for 5 mins");
    }
}
class Nullexercise implements exercises
{
    @Override
    public void print()
    {
        System.out.println("no asssigned exercises ");
    }
}
public class Exercise {
    
}
