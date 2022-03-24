package com.harman.assign5;

import java.util.Scanner;

class Employeedetails
{
    public void test()
    {
        System.out.println("The Employeedetails are:");
    }
}
class Employees extends Employeedetails
{
    @Override
    public void test()
    {
        System.out.println("The Employeedetails are shown:");
    }
}
public class employee
{
    @Deprecated
    public static void printf()
    {
        System.out.println("This is a Deprecated method ");
    }
    public static void main(String[] args)
    {
        Employeedetails e=new Employeedetails();
        e.test();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the employee Name = ");
        String a=sc.next();
        System.out.print("Enter the employee age = ");
        int b= sc.nextInt();
        System.out.print("Enter the employee Address = ");
        String c= sc.next();
        System.out.print("Enter the employee email = ");
        String d= sc.next();
        System.out.print("Enter the employee contact no = ");
        long e1= sc.nextLong();
        Employees obj=new Employees();
        obj.test();
        printf();
    }
}
