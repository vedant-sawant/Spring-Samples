package org.vedant;

public class Employee {
   private int age;
   private Payout payee;
   public void setAge(int age)
   {
       this.age=age;
   }

   //getter and setters for age
   public int getAge()
   {
       return age;
   }

    //getter and setters for payout
    public void setPayee(Payout payee)
    {
        this.payee=payee;
    }
    public Payout getPayee()
    {
        return payee;
    }


    public void show()
    {
        payee.calculate();
        System.out.println("in show method");
    }




}
