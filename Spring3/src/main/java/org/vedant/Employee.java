package org.vedant;

public class Employee {
   private int age;
   private Payout payee;

   public Employee(int age,Payout payee)
   {
       System.out.println("This is a Constructor of Employee");
       this.payee=payee;
       this.age=age;
   }



   //getter and setters for age
   public int getAge()
   {
       return age;
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
