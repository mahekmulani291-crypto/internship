import java.util.*;

public class StudentDuplicateRemoval {

    // ---------- Student Class ----------
    static class Student {
        private int id;
        private String name;
        private String course;

        public Student(int id, String name, String course) {
            this.id = id;
            this.name = name;
            this.course = course;
        }

        // Getters
        public int getId() { return id; }
        public String getName() { return name; }
        public String getCourse() { return course; }

        // Override equals() — students are equal if id, name, course match
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Student other = (Student) obj;
            return id == other.id &&
                    name.equals(other.name) &&
                    course.equals(other.course);
        }

        // Override hashCode()
        @Override
        public int hashCode() {
            return Objects.hash(id, name, course);
        }

        // Display student details
        @Override
        public String toString() {
            return id + " - " + name + " - " + course;
        }
    }

    // ---------- Main Method ----------
    public static void main(String[] args) {

        // Step 1: Create List with Duplicate Students
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Aman", "Java"));
        students.add(new Student(2, "Neha", "Python"));
        students.add(new Student(1, "Aman", "Java"));   // duplicate
        students.add(new Student(3, "Rohit", "C++"));
        students.add(new Student(2, "Neha", "Python")); // duplicate
        students.add(new Student(4, "Sahil", "Java"));
        students.add(new Student(1, "Aman", "Java"));   // duplicate again

        System.out.println("Original List (with duplicates):");
        for (Student s : students) {
            System.out.println(s);
        }

        // Step 2: Remove duplicates using HashSet
        Set<Student> uniqueSet = new HashSet<>(students);

        System.out.println("\nUnique Students (after removing duplicates):");
        for (Student s : uniqueSet) {
            System.out.println(s);
        }

        // Step 3: Convert back to list (optional)
        List<Student> uniqueList = new ArrayList<>(uniqueSet);
    }
}