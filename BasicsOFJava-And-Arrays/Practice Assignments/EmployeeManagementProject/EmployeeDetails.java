package EMPLOYEE;

public class EmployeeDetails {
    private String name;
    private String hiringDate;
    // private String contact;
    private int empID;
    private double salary;

    public EmployeeDetails(String empName, String empJD, int empId, double income) {
        this.name = empName;
        this.hiringDate = empJD;
        // this.contact = cont;
        this.empID = empId;
        this.salary = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(String hiringDate) {
        this.hiringDate = hiringDate;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}