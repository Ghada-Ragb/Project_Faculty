package com.company;

public class Date {
    private int month;
    private int year;
    private int day;
  /*  public Date(int day, int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }*/
    public void setYear(int year)
    {this.year=year;}
    public void setMonth(int month)
    {this.month=month;}
    public void setDay(int day){this.day=day;}
    public int getYear()
    {return year;}
    public int getMonth()
    {return month;}
    public int getDay()
    {return day;}
    public String toString()
    {return this.day+"/"+this.month+"/"+this.year;}
    public String print()
    {return (" Hire Date : "+toString());}
}
