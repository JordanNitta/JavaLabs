package Labs.ObjectsAndClassesLab.Labs.StudentClass;
/*

In the Student.java file, build the Student class with the following specifications:

Private fields
String name - Initialized in default constructor to "Louie"
double gpa - Initialized in default constructor to 1.0
Default constructor
Public member methods
setName() & getName()
setGPA() & getGPA()
 */
public class Student {
    private String name;
    private double gpa;
    // FIXME: define two private member fields
    public Student() {
        name = "Louie";
        gpa = 1.0;
    }

    public void setName(String n) {
        //FIXME: assign parameter to instance field
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public double getGPA() {
        return gpa;
    }
    // FIXME: Add three more methods
}
