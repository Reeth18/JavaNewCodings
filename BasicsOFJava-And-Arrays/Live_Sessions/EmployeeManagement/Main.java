package EMPLOYEE;

public class Main {
    public static void main(String[] args) {
        Tech t1 = new Tech("Rayith", "01/01/2023", 120, 5000);
        t1.getShift();
        t1.setShift(0);
        t1.setTechSkills("Java");
        System.out.println(t1.getEmpID());
        System.out.println(t1.getName());

        // System.out.println(t1.get);
        System.out.println(t1.getHiringDate());
        System.out.println(t1.getSalary());
        System.out.println(t1.getShift());
        System.out.println(t1.getTechSkills());
    }
}
