public class Student {
    private String firstName;
    private String lastName;
    private int gradeMath;
    private int gradeJava;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getGradeMath() {
        return gradeMath;
    }

    public int getGradeJava() {
        return gradeJava;
    }

    public void setGradeJava(int gradeJava) {
        this.gradeJava = filterGrade(gradeJava);
    }

    public void setGradeMath(int gradeMath) {
        this.gradeMath = filterGrade(gradeMath);
    }

    public boolean isFailded()
    {
        return gradeMath == 2 || gradeJava == 2;
    }

    public void printInformation() {
        System.out.println();
        System.out.println("-----------");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Grade math: " + gradeMath);
        System.out.println("Grade java: " + gradeJava);
        System.out.println("Is failed: " + isFailded());
        System.out.println("-----------");
        System.out.println();
    }

    private int filterGrade(int grade)
    {
        if (grade > 5 || grade < 2) {
            System.out.println("--Warning blin-- grade '" + grade + "' is invalid, changed to '2'");
            return 2;
        }
        return grade;
    }
}
