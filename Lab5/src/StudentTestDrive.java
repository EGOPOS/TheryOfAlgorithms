public class StudentTestDrive {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("Биба");
        student1.setLastName("Бобович");
        student1.setGradeMath(3);
        student1.setGradeJava(4);
        student1.printInformation();

        Student student2 = new Student();
        student2.setFirstName("Боба");
        student2.setLastName("Бибович");
        student2.setGradeMath(1);
        student2.setGradeJava(5);
        student2.printInformation();
    }
}
