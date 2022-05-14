package chapter4;

public class StudentFileTest {
    public static void main(String[] args) {
        StudentFile student1 = new StudentFile("Omotoke", 89.6);
        StudentFile student2 = new StudentFile("Chinanza", 7.8);

        System.out.printf("%s's letter grade is %s%n", student1.getName(), student1.getStudentGrade());
        System.out.printf("%s's letter grade is %s%n", student2.getName(), student2.getStudentGrade());

    }
}
