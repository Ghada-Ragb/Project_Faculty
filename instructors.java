package com.company;

import java.util.Date;

class instructors extends worker {
    private String department;
    private String Material;

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    public void setMaterial(String Material) {
        this.Material=Material;
    }

    public String getMaterial() {
        return Material;
    }
    public String toString()
    {printData();
        Display();
        System.out.println("Department : "+ department+"\n Material : "+Material);
    return "0";}
}
