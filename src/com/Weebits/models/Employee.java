package com.Weebits.models;

abstract class Employee {
     final protected Gender gender;
     protected String employeeName;
     protected String regionalOffice;
     protected String jobCategory;
     protected double salary;

    /**
     *
     */
     protected Employee(Gender gender,String employeeName,String regionalOffice, String jobCategory,double salary){
         this.employeeName=employeeName;
         this.gender=gender;
         this.jobCategory=jobCategory;
         this.salary=salary;
         this.regionalOffice=regionalOffice;
     }


}
