package Labs.OOP.Labs.CourseInformation;

public class OfferedCourse extends Course {
    // TODO: Declare private fields
    private String instructorName;
    private String location;
    private String classTime;
    // TODO: Define mutator methods -
    //      setInstructorName(), setLocation(), setClassTime()

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

//    @Override
//    public void printInfo(){
//        super.printInfo();
//       System.out.println("     Instructors Name: " + instructorName);
//       System.out.println("     Location: " + location);
//        System.out.println("    Class Time: " + classTime);
//    }

}
