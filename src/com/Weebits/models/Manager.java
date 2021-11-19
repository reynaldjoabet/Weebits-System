package com.Weebits.models;

public class Manager extends  Employee {
     private final  EmployeeRole role;
    /**
     *
     */
    public  Manager(Gender gender,String employeeName,String regionalOffice, String jobCategory,double salary){
        super(gender,employeeName, regionalOffice, jobCategory,salary);
        this.role=EmployeeRole.MANAGER;
    }

    public EmployeeRole getRole() {
        return role;
    }
    public double getSalary() {
        return this.salary;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public Gender getGender() {
        return this.gender;
    }

    public String getJobCategory() {
        return this.jobCategory;
    }


    public String getRegionalOffice() {
        return this.regionalOffice;
    }


}
