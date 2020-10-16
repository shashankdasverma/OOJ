import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    String USN, Name;
    int credits[] = new int[5];
    float marks[] = new float[5];
    int points[] = new int[5];
    float SGPA;
    int totalCredits = 0;

    void input() {
        System.out.println("Enter Student's USN: ");
        USN = sc.nextLine();
        System.out.println("Enter Student's Name: ");
        Name = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Credits for Subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();
            totalCredits += credits[i];
            System.out.println("Enter Marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextFloat();
        }
    }

    void gpa() {

        for (int i = 0; i < 5; i++) {
            if (marks[i] > 100) {
                System.out.println("Error: Marks are above 100");
                return;
            } else if (marks[i] >= 90) {
                points[i] = 10;
            } else if (marks[i] >= 80) {
                points[i] = 9;
            } else if (marks[i] >= 70) {
                points[i] = 8;
            } else if (marks[i] >= 60) {
                points[i] = 7;
            } else if (marks[i] >= 50) {
                points[i] = 5;
            } else if (marks[i] >= 40) {
                points[i] = 4;
            } else {
                points[i] = 0;
            }

            SGPA += (points[i] * credits[i]);
        }
    }

    void display() {
        System.out.println("Student's USN: " + USN);
        System.out.println("Student's Name: " + Name);
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + " - Credits: " + credits[i] + " - Marks: " + marks[i]);
        }
        System.out.println("SGPA of " + Name + " is: " + (float) (SGPA / totalCredits));
    }

}

class st {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.input();
        s1.gpa();
        s1.display();

    }
}
