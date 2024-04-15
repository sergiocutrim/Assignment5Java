import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            /*
             * create 3 objects, the 1st pass the 4 values in method, the second pass the 6
             * values, the 3rd pass with setter
             */
            Student student1 = new Student("Nicolas", "de la Cruz", "Computer Programming", "Georgian");
            Student student2 = new Student("Giorgian", "de Arrascaeta", "Science", "Ilac", 85.0, 95.0);
            Student student3 = new Student();
            student3.setFirstName("Adenor");
            student3.setLastName("'Tite' Bacchi");
            student3.setProgName("History");
            student3.setCollName("Georgian@Ilac");
            student3.setValue1(99.0);
            student3.setValue2(100.0);
            /* Call the method to print the info of each of the 3 students */
            student1.printStudentInformation();
            System.out.println();
            student2.printStudentInformation();
            System.out.println();
            student3.printStudentInformation();
            System.out.println();
            /* Setting the grades for each of them using the setter */
            student1.setValue1(80.0);
            student1.setValue2(95.0);
            student2.setValue1(50.0);
            student2.setValue2(100.0);
            student3.setValue1(40.0);
            student3.setValue2(50.0);
            /* Calculating the new average and printing the value */
            System.out.println("Calculating new average using only the method and printing.");
            System.out.println("Student 1: " + student1.getLastName() + ", " + student1.getFirstName() + " average is: "
                    + student1.average());
            System.out.println("Student 2: " + student2.getLastName() + ", " + student2.getFirstName() + " average is: "
                    + student2.average());
            System.out.println("Student 3: " + student3.getLastName() + ", " + student3.getFirstName() + " average is: "
                    + student3.average());
            /* Creating a 4th student with user inputting the information */
            Scanner input = new Scanner(System.in); /* open scanner to read input */
            System.out.println();
            System.out.println("Please inform student first name:"); /* ask user to put information */
            String firstName = input.nextLine(); /* read input with scanner and store value in a new variable */
            System.out.println("Please inform student last name:");
            String lastName = input.nextLine();
            System.out.println("Please inform student program:");
            String progName = input.nextLine();
            System.out.println("Please inform student college:");
            String collName = input.nextLine();
            System.out.println("Please inform student first grade (between 0 and 100):");
            double value1 = input.nextDouble();
            System.out.println("Please inform student second grade (between 0 and 100):");
            double value2 = input.nextDouble();
            /* after requesting all values call the method with 6 variables */
            Student student4 = new Student(firstName, lastName, progName, collName, value1, value2);
            /* in the end call the print information method to print student 4 */
            student4.printStudentInformation();
            input.close(); /* close the scanner */
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();

        }
    }
}
