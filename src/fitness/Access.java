/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness;


class AccessExecutor
{
    usercommand c;
    public void setcommand(usercommand c)
    {
        this.c=c;
    }
    public void invoke()
    {
        c.execute();
    }
}
interface usercommand
{
    public void execute();
            
}
class Signupcommand implements usercommand
{
    Member m;
     Signupcommand(Member m)
    {
        this.m=m;
    }
    @Override
    public void execute()
    {
        Userdatabase.getMembers().add(m);
        m.loggedin=true;
    }
}
class Logincommand implements usercommand
{
    Member m;
    Logincommand(Member m)
    {
        this.m=m;
    }
    @Override
    public void execute()
    {
       if(m.isValid(m.Email, m.Password))
       {
           System.out.println("Welcome");
            m.loggedin=true;
       }
       else
            System.out.println("you need to create an account first");
    }
}
class Loginasaguestcommand implements usercommand
{
    Guest G;
     Loginasaguestcommand(Guest G)
    {
        this.G=G;
    }
    @Override
    public void execute()
    {
        System.out.println(" logged in temporarily");
    }
}

public class Access {
    
}
