package EMPLOYEE;

public class Sales extends EmployeeDetails {
    private double target;
    private String deadline;
    private double Conversion;

    Sales(String empName, String empJD, int empId, double income) {
        super(empName, empJD, empId, income);
    }

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) {
        this.target = target;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public double getConversion() {
        return Conversion;
    }

    public void setConversion(double conversion) {
        Conversion = conversion;
    }

}
