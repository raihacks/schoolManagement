public class Student {
    private int studentId;
    private String name;
    private double grade;
    private boolean feesPaid;
    Student(int studentId, String name, double grade, boolean feesPaid) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.feesPaid = feesPaid;
    }
    public void finalGrade() {
        if (grade >= 90) {
            System.out.println("Grade: A");
        } else if (grade >= 75) {
            System.out.println("Grade: B");
        } else if (grade >= 60) {
            System.out.println("Grade: C");
        } else if (grade >= 35) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Fail");
        }
    }
    public void feeStatus() {
        if (feesPaid) {
            System.out.println("Fees is paid.");
        } else {
            System.out.println("Fees is not paid.");
        }
    }
}
