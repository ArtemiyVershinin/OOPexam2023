package org.example;

public class ShiftWorker extends Employee {
    int Shift, day;
    int PayrollNo;

    public double PayRate = 14.50;
    void setShift(){
        if(Shift == day){
            System.out.println("1");
        } else if (Shift != day) {
            System.out.println("2");
        }
    }
    public void setPayrollNo(){
        System.out.println("ShiftWorkers PayrollNo is: 5867");
    }
    public void setPayRate(int Hourly){
        System.out.println("ShiftWorkers Hourly Rate is " + Hourly + " euros");
    }

    @Override
    public void getReportDetails() {
        super.getReportDetails();
        System.out.println("Employee Shift: Day");
        System.out.println("Employee PayRollNo: 5867");
        System.out.println("Employee Hourly Rate: 14.50");
    }

    ShiftWorker myShiftWorker = new ShiftWorker();

    this.Shift = Shift;
    this.PayrollNo = PayrollNo;
    this.PayRate = PayRate;
}
