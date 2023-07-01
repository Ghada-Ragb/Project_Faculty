package com.company;

class technicians extends worker {
    private String specialization;

    public void setSpecial(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecial() {
        return specialization;
    }
    public String toString()
    {printData();
        Display();
        System.out.println("Specialization : "+specialization );
    return "0";}
}
