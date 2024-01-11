package Labs.ObjectsAndClassesLab.Labs.StudentClass;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName() + "/" + student.getGPA());

        student.setName("Felix");
        student.setGPA(3.7);
        System.out.println(student.getName() + "/" + student.getGPA());
    }
}
