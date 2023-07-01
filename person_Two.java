package com.company;

public abstract class person {
   private String name;
  private  int age;
  private  String gender;
   private String address;
private static String college = "FCI";
   private int ID;
   public void setName(String name)
   {this.name=name;}
public String getName()
{return name;}
    public void setAge(int age)
    {if(age>=18)
        this.age=age;
        else
    throw new ArithmeticException("this input is not valid");}
    public int getAge()
    {return age;}
    public void setGender(String gender)
    {
        if(gender.equals("male")||gender.equals("female"))
           this.gender=gender;
        else
            this.gender="you entered wrong data please inter all again";
     }
    public String getGender()
    {return gender;}
    public void setAddress(String address)
    {this.address=address;}
    public String getAddress()
    {return address;}
    public void setID(int ID)
    {if(ID>0)
        this.ID=ID;
    else
        throw new ArithmeticException("this input is not valid");
    }
    public int getID()
    {return ID;}
    public void printData()
    {System.out.println("ID : "+ID +"\n Name : "+name +"\n Age : "+age+"\n Gender : "+gender+"\n Address : "+address+"\n College : " + college);}
public String getCollege()
{return college;}

  /*  @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof person)) return false;
        person person = (person) o;
        return getAge() == person.getAge() && getID() == person.getID() && Objects.equals(getName(), person.getName()) && Objects.equals(getGender(), person.getGender()) && Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getGender(), getAddress(), getID());}*/

}














