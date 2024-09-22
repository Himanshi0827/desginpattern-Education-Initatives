import java.util.Scanner;

public class VirtualClassroomApp {
    public static void main(String[] args) {
        ClassroomManager manager = new BasicClassroomManager();
        ClassroomManager loggingManager = new LoggingDecorator(manager);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Virtual Classroom Manager!");
        String command;

        while (true) {
            System.out.print("> ");
            command = scanner.nextLine();
            String[] parts = command.split(" ", 3);
            String action = parts[0];

            switch (action) {
                case "add_classroom":
                    if (parts.length > 1) {
                        loggingManager.addClassroom(parts[1]);
                    }
                    break;
                case "add_student":
                    if (parts.length > 2) {
                        loggingManager.addStudent(parts[1], parts[2]);
                    }
                    break;
                case "schedule_assignment":
                    if (parts.length > 2) {
                        loggingManager.scheduleAssignment(parts[1], parts[2]);
                    }
                    break;
                case "submit_assignment":
                    if (parts.length > 3) {
                        loggingManager.submitAssignment(parts[1], parts[2], parts[3]);
                    }
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}
