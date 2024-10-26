interface Student {
    String course = "BTech";

    void displayStudent();
}

interface Faculty {
    String department = "CS";

    void displayFaculty();
}

class TeachingAssistant implements Student, Faculty {
    public void displayStudent() {
        System.out.println("Course is " + course);
    }

    public void displayFaculty() {
        System.out.println("Department is " + department);
    }
}

public class P11MultiInheritance {
    public static void main(String[] args) {
        TeachingAssistant teachingAssistant = new TeachingAssistant();
        teachingAssistant.displayStudent();
        teachingAssistant.displayFaculty();
    }
}
