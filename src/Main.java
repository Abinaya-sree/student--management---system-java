import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n====================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("Total Students : " + service.getStudentCount());
            System.out.println("------------------------------------");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> service.addStudent();
                case 2 -> service.viewStudents();
                case 3 -> service.updateStudent();
                case 4 -> service.deleteStudent();
                case 5 -> {
                    System.out.print("Are you sure you want to exit? (yes/no): ");
                    String confirm = sc.next();
                    if (confirm.equalsIgnoreCase("yes")) {
                        System.out.println("✅ Program exited successfully. Thank you!");
                        System.exit(0);
                    }
                }
                default -> System.out.println("❌ Invalid Choice");
            }
        }
    }
}
