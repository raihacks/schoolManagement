public class Student{
    private int id;
    private String name;
    private double grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    public void payFees(int amount){
        feesPaid += amount;
    }

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    public void printDetails(){
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Fees Paid: " + feesPaid);
        System.out.println("Remaining Fees: " + getRemainingFees());
    }
}
