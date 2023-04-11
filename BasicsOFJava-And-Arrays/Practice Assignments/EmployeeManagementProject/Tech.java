package EMPLOYEE;

public class Tech extends EmployeeDetails {
    private int shift;
    private String techSkills;

    Tech(String empName, String empJD, int empId, double income) {
        super(empName, empJD, empId, income);
    }

    public String getShift() {
        if (shift == 1) {
            return "Night";
        } else if (shift == 0) {
            return "Day";
        }
        return techSkills;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getTechSkills() {
        return techSkills;
    }

    public void setTechSkills(String techSkills) {
        this.techSkills = techSkills;
    }

}
