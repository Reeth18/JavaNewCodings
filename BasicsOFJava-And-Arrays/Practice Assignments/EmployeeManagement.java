interface Payements {
    public double calculateSalary();
}

abstract class Employee {
    private String empName;
    private int empAge;
    private double empBaseSalary;

    public Employee(String empName, int empAge, double empBaseSalary) {
        this.empName = empName;
        this.empAge = empAge;
        this.empBaseSalary = empBaseSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public double getEmpBaseSalary() {
        return empBaseSalary;
    }

    public abstract void display();
}

class Manager extends Employee implements Payements {
    private String department;

    public Manager(String empName, int empAge, double empBaseSalary, String department) {
        super(empName, empAge, empBaseSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void display() {
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Employee Age: " + getEmpAge());
        System.out.println("Employee Department: " + getDepartment());
        System.out.println("Employee Salary: " + calculateSalary());
        System.out.println();

    }

    public double calculateSalary() {
        double totalSalary = getEmpBaseSalary() + 10000;
        return totalSalary;
    }

}

class Technical extends Employee implements Payements {
    private String domain;

    public Technical(String empName, int empAge, double empBaseSalary, String domain) {
        super(empName, empAge, empBaseSalary);
        this.domain = domain;
    }

    public String getDomain() {
        return domain;
    }

    public double calculateSalary() {
        double totalSalary = getEmpBaseSalary() + 5000;
        return totalSalary;
    }

    public void display() {
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Employee Age: " + getEmpAge());
        System.out.println("Employee Domain: " + getDomain());
        System.out.println("Employee Salary: " + calculateSalary());
    }

}

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager manager = new Manager("Joy Guha", 50, 60000, "Service Manager");
        Technical technical = new Technical("Rayith Bose", 20, 40000, "Java");
        manager.display();
        technical.display();
    }
}
