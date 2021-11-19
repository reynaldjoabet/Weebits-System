package com.Weebits.models;

/**
 *
 */
public class SalesStaff extends Employee{
    private final EmployeeRole role;
    public  SalesStaff(Gender gender,String employeeName,String regionalOffice, String jobCategory,double salary){
        super(gender,employeeName, regionalOffice, jobCategory,salary);
        this.role=EmployeeRole.SALESSTAFF;
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

    public EmployeeRole getRole() {
        return this.role;
    }
}
