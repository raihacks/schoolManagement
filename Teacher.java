public class Teacher {
    private int teacherId;
    private String name;
    private String subject;
    private double salary;
    private boolean isPermanent;
    private String assignedClass;
    private int yearsOfExperience;
    public Teacher(int teacherId, String name, String subject, double salary, boolean isPermanent) {
        this.teacherId = teacherId;
        this.name = name;
        this.subject = subject;
        this.salary = salary;
        this.isPermanent = isPermanent;
        this.assignedClass = "Not assigned";
        this.yearsOfExperience = 0;
    }
    public void printDetails() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
        System.out.println("Employment: " + (isPermanent ? "Permanent" : "Temporary"));
        System.out.println("Class Assigned: " + assignedClass);
        System.out.println("Experience: " + yearsOfExperience + " years");
    }
    public void increaseSalary(double amount) {
        salary += amount;
        System.out.println("New Salary: " + salary);
    }
    public void changeSubject(String newSubject) {
        subject = newSubject;
        System.out.println("Subject updated to: " + subject);
    }
    public void assignClass(String className) {
        assignedClass = className;
        System.out.println(name + " assigned to: " + assignedClass);
    }
    public void addExperience(int years) {
        yearsOfExperience += years;
        System.out.println("Experience updated to: " + yearsOfExperience + " years");
    }
    public void employmentStatus() {
        System.out.println(name + (isPermanent ? " is a permanent teacher." : " is a temporary teacher."));
    }
}
