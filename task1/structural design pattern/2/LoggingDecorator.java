class LoggingDecorator extends ClassroomManagerDecorator {
    public LoggingDecorator(ClassroomManager manager) {
        super(manager);
    }

    @Override
    public void addClassroom(String className) {
        super.addClassroom(className);
        logAction("Added classroom: " + className);
    }

    @Override
    public void addStudent(String studentId, String className) {
        super.addStudent(studentId, className);
        logAction("Enrolled student: " + studentId + " in " + className);
    }

    @Override
    public void scheduleAssignment(String className, String assignmentDetails) {
        super.scheduleAssignment(className, assignmentDetails);
        logAction("Scheduled assignment: " + assignmentDetails + " for " + className);
    }

    @Override
    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        super.submitAssignment(studentId, className, assignmentDetails);
        logAction("Student: " + studentId + " submitted assignment: " + assignmentDetails + " for " + className);
    }

    private void logAction(String message) {
        // Simulate logging to a database or file
        System.out.println("[LOG] " + message);
    }
}
