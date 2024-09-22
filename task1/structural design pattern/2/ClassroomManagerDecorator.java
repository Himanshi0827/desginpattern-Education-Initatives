abstract class ClassroomManagerDecorator implements ClassroomManager {
    protected ClassroomManager decoratedManager;

    public ClassroomManagerDecorator(ClassroomManager manager) {
        this.decoratedManager = manager;
    }

    @Override
    public void addClassroom(String className) {
        decoratedManager.addClassroom(className);
    }

    @Override
    public void addStudent(String studentId, String className) {
        decoratedManager.addStudent(studentId, className);
    }

    @Override
    public void scheduleAssignment(String className, String assignmentDetails) {
        decoratedManager.scheduleAssignment(className, assignmentDetails);
    }

    @Override
    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        decoratedManager.submitAssignment(studentId, className, assignmentDetails);
    }
}
