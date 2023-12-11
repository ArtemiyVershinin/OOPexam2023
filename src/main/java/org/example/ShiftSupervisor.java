package org.example;

public class ShiftSupervisor extends ShiftWorker{
    public double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void getReportDetails() {
        super.getReportDetails();
        System.out.println("Employee Annual Salary: ");
    }
}
