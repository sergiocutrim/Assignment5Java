public class Student {
    private String firstName; /* Student's first name */
    private String lastName; /* Student's last name */
    private String progName; /* Student's program name */
    private String collName; /* Student's college name */
    private double value1; /* Student's first exam */
    private double value2; /* Student's second exam */

    public Student(String firstName, String lastName, String progName, String collName) {
        /* create a public method with 4 parameters */
        this.firstName = firstName; /* each variable of private will be stored as public in this */
        this.lastName = lastName;
        this.progName = progName;
        this.collName = collName;
    }

    public Student(String firstName, String lastName, String progName, String collName, double value1, double value2) {
        /* create a public method with 6 parameters */
        this.firstName = firstName; /* each variable of private will be stored as public in this */
        this.lastName = lastName;
        this.progName = progName;
        this.collName = collName;
        this.value1 = value1;
        this.value2 = value2;

    }

    public Student() { /* Creating the constructor with all empty values */
        this.firstName = "";
        this.lastName = "";
        this.progName = "";
        this.collName = "";
        this.value1 = 0.0;
        this.value2 = 0.0;
    }

    /* Setters and Getters for each of the variables */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProgName() {
        return progName;
    }

    public void setProgName(String progName) {
        this.progName = progName;
    }

    public String getCollName() {
        return collName;
    }

    public void setCollName(String collName) {
        this.collName = collName;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    /* Creating a method to calculate the average */
    public double average() {
        double average = (value1 + value2) / 2;
        return average;
    }

    /* Create a method to print the average */
    public void printStudentInformation() {
        double average = average(); /* new var to store the average, get the value from the method average */
        String grade; /* new string to store the grade with letters */

        if (average >= 90 && average <= 100) { /* If grade is btw 90 and 100 it becomes the string A+ */
            grade = "A+";
        } else if (average >= 80 && average <= 89) { /* If grade is bte 80 and 89 it becomes string B */
            grade = "B";
        } else if (average >= 70 && average <= 79) { /* If grade is btw 70 and 79 it becomes string C */
            grade = "C";
        } else if (average >= 60 && average <= 69) { /* If grade is bte 60 and 69 it becomes string D */
            grade = "D";
        } else if (average < 60) { /* If grade is below 60, grade is F */
            grade = "F";
        } else { /* If user inputs something wrong grade informs a mistake */
            grade = "Sorry, all marks have to be minimum 0 to maximum 100!";
        }

        System.out.println("Student Information:"); /* Print the student information and all the grades */
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("College: " + collName);
        System.out.println("Program: " + progName);
        System.out.println("Marks/Grades: " + value1 + ", " + value2);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

    }

}
