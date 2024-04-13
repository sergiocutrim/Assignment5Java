import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
try{

        Student student1 = new Student("Nicolas", "de la Cruz", "Computer Programming", "Georgian");
        Student student2 =new Student("Giorgian", "de Arrascaeta", "Science", "Ilac", 85.0, 95.0);
        Student student3 = new Student();
        student3.setFirstName("Adenor");
        student3.setLastName("'Tite' Bacchi");
        student3.setProgName("History");
        student3.setCollName("Georgian@Ilac");
        student3.setValue1(99.0);
        student3.setValue2(100.0);

        student1.printStudentInformation();
        System.out.println();
        student2.printStudentInformation();
        System.out.println();
        student3.printStudentInformation();
        System.out.println();


        student1.setValue1(80.0);
        student1.setValue2(95.0);
        student2.setValue1(50.0);
        student2.setValue2(100.0);
        student3.setValue1(40.0);
        student3.setValue2(50.0);
        System.out.println("Calculating new average using only the method and printing.");
        System.out.println("Student 1: " + student1.getLastName() +", " + student1.getFirstName() + " average is: " + student1.average());
        System.out.println("Student 2: " + student2.getLastName() + ", " + student2.getFirstName() + " average is: " + student2.average());
        System.out.println("Student 3: " + student3.getLastName() + ", " + student3.getFirstName() + " average is: " + student3.average());

        Scanner input = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Please inform student first name:");
        String firstName = input.nextLine();
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
           
        Student student4 = new Student(firstName, lastName, progName, collName, value1, value2);
        student4.printStudentInformation();
        


        input.close();
} catch (Exception e) {
    System.out.println("An error occurred: " + e.getMessage());
    e.printStackTrace();

    }
}
}
