import java.io.BufferedReader;
// import java.io.File;
import java.io.FileReader;
// import java.io.Reader;
// import java.util.Scanner;

public class readStudentUsingStringNew {
    public static void main(String[] args) {
        String d = ",";
        String student;
        int sum = 0;
        int headerLines = 1;
        int rows = 1;
        try {

            FileReader file = new FileReader("StdReportCard.csv");

            BufferedReader buffer = new BufferedReader(file);

            // Apply Loop
            while ((student = buffer.readLine()) != null) {
                // System.out.println(student);
                // The previous one would have printed in a wrong manner
                String[] newStudent = student.split(d);
                // System.out.println("Student Name: " + newStudent[1] + ", " + "Language-I: " +
                // newStudent[5]);

                if (rows <= headerLines) {
                    rows += rows;
                    continue;
                }

                for (int i = 2; i < newStudent.length; i++) {
                    sum += Integer.parseInt(newStudent[i]);

                }
                System.out.println("Roll No: " + newStudent[0] + ", " + "Student Name: " + newStudent[1] + "," + sum);
                // System.out.println(sum);
                sum = 0;
            }
            buffer.close();

        } catch (Exception e) {
            System.out.println("An error has occured" + e.getMessage());
            // TODO: handle exception
        }

    }
}
