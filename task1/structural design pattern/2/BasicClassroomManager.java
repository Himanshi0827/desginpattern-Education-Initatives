import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BasicClassroomManager implements ClassroomManager {
    private Map<String, List<String>> classrooms;
    private Map<String, List<String>> assignments;
    private Map<String, List<String>> submissions;

    public BasicClassroomManager() {
        classrooms = new HashMap<>();
        assignments = new HashMap<>();
        submissions = new HashMap<>();
    }

    @Override
    public void addClassroom(String className) {
        classrooms.put(className, new ArrayList<>());
        System.out.println("Classroom " + className + " has been created.");
    }

    @Override
    public void addStudent(String studentId, String className) {
        if (classrooms.containsKey(className)) {
            classrooms.get(className).add(studentId);
            System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    @Override
    public void scheduleAssignment(String className, String assignmentDetails) {
        if (classrooms.containsKey(className)) {
            assignments.computeIfAbsent(className, k -> new ArrayList<>()).add(assignmentDetails);
            System.out.println("Assignment for " + className + " has been scheduled.");
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    @Override
    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        String submissionKey = studentId + "_" + className + "_" + assignmentDetails;
        submissions.computeIfAbsent(submissionKey, k -> new ArrayList<>()).add("Submitted");
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
    }
}
