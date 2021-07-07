package com.company;

class aEmployee{
    //technically we should not declare field in java public
    private int baseSalary;//this is now not accessible outside class
    private int extraHours ;

    public int calculateWage(int hourlyRate){
        return  baseSalary + (extraHours * hourlyRate);
    }

    public void setBaseSalary(int baseSalary){

        //validation
        if(baseSalary <=0 )
            throw new IllegalArgumentException("Salary can't be 0 or -ve");
        //exception not handled will terminate our program

        this.baseSalary=baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setExtraHours(int extraHours) {

        if(extraHours <0 )
            throw new IllegalArgumentException("hours can't  be -ve");
        this.extraHours=extraHours;
    }

    public int getExtraHours() {
        return extraHours;
    }

}
public class be_GettersAndSetters {
    public static void main(String[] args) {

        var aEmployee = new aEmployee();

        //throws error
        //aEmployee.baseSalary = 50_000;
        //aEmployee.extraHours = 10;

        aEmployee.setBaseSalary(50_000);
        aEmployee.setExtraHours(10);

        System.out.println(aEmployee.getBaseSalary());//50000
        System.out.println(aEmployee.getExtraHours());//10

        System.out.println(aEmployee.calculateWage(20));//50200
    }
}
