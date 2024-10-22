import java.util.Scanner;

public class FitnessController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Main Menu:");
            System.out.println("1. Student");
            System.out.println("2. Coach");
            System.out.println("3. Manager");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int mainChoice = scanner.nextInt();

            switch (mainChoice) {
                case 1:
                    studentMenu(scanner);
                    break;
                case 2:
                    coachMenu(scanner);
                    break;
                case 3:
                    managerMenu(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void studentMenu(Scanner scanner) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nStudent Menu:");
            System.out.println("1. Display Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. View Training Progress");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayCourses(scanner);
                    break;
                case 2:
                    registerCourse();
                    break;
                case 3:
                    viewProgress();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void coachMenu(Scanner scanner) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nCoach Menu:");
            System.out.println("1. Create Course");
            System.out.println("2. View Training Progress");
            System.out.println("3. View Registered Students");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createCourse();
                    break;
                case 2:
                    viewProgress();
                    break;
                case 3:
                    viewRegisteredStudents();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void managerMenu(Scanner scanner) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nManager Menu:");
            System.out.println("1. Display Courses Registered by Students");
            System.out.println("2. Approve Coach List");
            System.out.println("3. View Coach Information");
            System.out.println("4. Calculate Coach Salary");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayRegisteredCourses();
                    break;
                case 2:
                    approveCoachList();
                    break;
                case 3:
                    viewCoachInformation();
                    break;
                case 4:
                    calculateCoachSalary();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void displayCourses(Scanner scanner) {
        System.out.println("\nDisplaying courses:");
        System.out.println("1. View specific course");
        System.out.println("2. View exercises (e.g., leg, arm, thigh workouts)");
        System.out.print("Select an option: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Displaying course details...");
        } else if (choice == 2) {
            System.out.println("Displaying exercises (leg, arm, thigh workouts)...");
        } else {
            System.out.println("Invalid option.");
        }
    }

    private static void registerCourse() {
        System.out.println("Registering for a course...");
    }

    private static void viewProgress() {
        System.out.println("Viewing training progress...");
    }

    private static void createCourse() {
        System.out.println("Creating a new course...");
    }

    private static void viewRegisteredStudents() {
        System.out.println("Viewing registered students...");
    }

    private static void displayRegisteredCourses() {
        System.out.println("Displaying courses registered by students...");
    }

    private static void approveCoachList() {
        System.out.println("Approving coach list...");
    }

    private static void viewCoachInformation() {
        System.out.println("Viewing coach information...");
    }

    private static void calculateCoachSalary() {
        System.out.println("Calculating coach salary...");
    }
}
