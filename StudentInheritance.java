import java.util.Scanner;

class Student {
    int studentId;
    String studentName;
    String department;

    Student(int studentId, String studentName, String department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
    }

    void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department);
    }
}

class UndergraduateStudent extends Student {
    int semester;
    double cgpa;

    UndergraduateStudent(int studentId, String studentName, String department, int semester, double cgpa) {
        super(studentId, studentName, department);
        this.semester = semester;
        this.cgpa = cgpa;
    }

    void displayUGDetails() {
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends Student {
    String specialization;
    String researchTopic;

    PostgraduateStudent(int studentId, String studentName, String department,
                        String specialization, String researchTopic) {
        super(studentId, studentName, department);
        this.specialization = specialization;
        this.researchTopic = researchTopic;
    }

    void displayPGDetails() {
        System.out.println("Specialization: " + specialization);
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class StudentInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Undergraduate Student Details");
        int ugId = sc.nextInt();
        sc.nextLine();
        String ugName = sc.nextLine();
        String ugDept = sc.nextLine();
        int semester = sc.nextInt();
        double cgpa = sc.nextDouble();
        sc.nextLine();

       
