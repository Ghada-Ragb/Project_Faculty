package com.company;

class Administrator extends worker {
    private String department;

    public void setDepart(String department) {
        this.department = department;
    }

    public String getDepart() {
        return department;
    }
    public String toString()
    {printData();
        Display();
        System.out.println("Department : "+ department);
    return "0";}
}
