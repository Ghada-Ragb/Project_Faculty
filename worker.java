package com.company;

//import java.util.Date;

class worker extends person implements faculty {
    private double salary;
    double Bonus;
    double deduction;
    public Date HireDate ;

    public worker() {
        setAge(35);
        setAddress("Assiut");
        this.salary = 2000;
        Bonus = 0.05;
    }
    public String toString()
    {printData();
        System.out.println("Salary : "+salary+"\n Bonus : "+Bonus+"\n Deduction : "+deduction+"\n Hire Date : "+HireDate );
    return "0";}
    public worker(worker a, double Bonus) {
        this.Bonus = a.Bonus;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    //void
    public double totalSalary() {
        salary = (salary + Bonus) - deduction(salary);
        return salary;
    }

    @Override
    public double deduction(double salary) {
        deduction = this.salary - (salary * 0.1);
        return deduction;
    }
public void Display()
{setSalary(this.salary);
System.out.println("Salary : "+getSalary()+"\n Bonus : "+ Bonus+"\n Deducyion : "+deduction);}
}
