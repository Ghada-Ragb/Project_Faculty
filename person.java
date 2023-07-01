package com.company;
//import java.util.Date;


interface faculty {
    void salary();
    double deduction(double salary);
        }



public abstract class person {
    String name;
    int age;
    String gender ;
     String address;
    static String college="FCI";
}



/*class faculty{
    String department;
    public faculty(faculty a){
        this.department=department;   }
}*/
class student extends person {
    private double GPA;
    private String course;
    private int level;
    String department;
    public student(){
        super.age=20;
        super.address="Assiut";
        this.GPA=4;
    }
    public void setGPA(double GPA)
    {this.GPA=GPA;}
    public double getGPA(){
        return GPA;
    }
    public void setCourse(String course)
    {this.course=course;}
    public String getCourse()
    {return course;}
    public void setLevel(int level)
    {this.level=level;}
    public int gerLevel()
    {return level;}}
class Date{
    int Day;
    int Month;
    int Year;
    public Date(int Day, int Month, int Year){
        this.Day=Day;
        this.Month=Month;
        this.Year=Year;
    }
    @Override
    public String toString()
    {return (this.Day+"/"+this.Month+"/"+this.Year);}
    public void Printt(){
        System.out.println("Hire Date : "+toString());
    }
}


     class worker extends person implements faculty{
        private double salary;
        double Bonus;
        double deduction;
        public Date HireDate;
    public worker ()
    {super.age=35;
        super.address="Assiut";
        this.salary=2000;
    Bonus=0.05;}
        public worker (worker a, double Bonus)
        {this.Bonus= a.Bonus;}
         @Override
        public void salary()
        {salary=(salary+Bonus)-deduction(salary);}
         @Override
         public double deduction(double salary) {
             deduction = this.salary -(salary*0.1);
             return deduction;
         }
         public void setSalary(double salary)
        {this.salary=salary;}
        public double getSalary()
        {return salary;}
    }



    class instructors extends worker{
        private String department;;
        public void setDepartment(String department)
        {this.department=department;}
        public String getDepartment()
        {return department;}
    }




class Administrator extends worker{
    private String department;
    public void setDepart(String department)
    {this.department=department;}
    public String getDepart()
    {return department;}
}



class technicians extends worker{
    private String department;
    public void setDepart(String department)
    {this.department=department;}
    public String getDepart()
    {return department;}
}
