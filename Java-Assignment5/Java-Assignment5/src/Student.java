public class Student {
    private String firstName;  /*Student's first name */
    private String lastName;    /*Student's last name */
    private String progName;    /*Student's program name */
    private String collName;    /*Student's college name */
    private double value1;  /*Student's first exam */
    private double value2;  /*Student's second exam */

    public Student (String firstName, String lastName, String progName, String collName){  /*create a public method with the same name */
        this.firstName = firstName; /*each variable of private will be stored as public in this */
        this.lastName = lastName;
        this.progName = progName;
        this.collName = collName;
    }
    
    public Student (String firstName, String lastName, String progName, String collName, double value1, double value2){
        this.firstName = firstName; /*each variable of private will be stored as public in this */
        this.lastName = lastName; 
        this.progName = progName;
        this.collName = collName;
        this.value1 =value1;
        this.value2 =value2;

    }

    public Student(){  /*Creating the constructor with all empty values */
        this.firstName="";
        this.lastName="";
        this.progName="";
        this.collName="";
        this.value1=0.0;
        this.value2=0.0;
    }
    /*Setters and Getters for each of the variables */
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProgName(){
        return progName;
    }

    public void setProgName(String progName) {
        this.progName = progName;
    }

    public String getCollName(){
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

    public double average() {
        double average = (value1 + value2)/2;
        return average;
    }

    public void printStudentInformation () {
        double average = average();
        String grade;
        
        if (average>=90 && average<=100){
            grade="A+";
        } else if (average>=80 && average<=89){
            grade="B";
        } else if (average>=70 && average<=79) {
            grade="C";
        } else if (average>=60 && average<=69) {
            grade="D";
        } else if (average<60){
            grade="F";
        } else {
            grade="Sorry, all marks have to be minimum 0 to maximum 100!";
        }

        System.out.println("Student Information:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("College: " + collName);
        System.out.println("Program: " + progName);
        System.out.println("Marks/Grades: " + value1 + ", " + value2);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

    }


}
