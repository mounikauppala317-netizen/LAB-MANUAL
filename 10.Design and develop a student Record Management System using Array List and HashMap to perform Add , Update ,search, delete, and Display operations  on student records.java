import java.util.*;

public class StudentRecord {
    public static void main(String[] args) {

        HashMap<Integer, String> student = new HashMap<>();

        // Add
        student.put(101, "Mounika");
        student.put(102, "Ravi");

        // Display
        System.out.println(student);

        // Search
        System.out.println(student.get(101));

        // Update
        student.put(101, "Anitha");

        // Delete
        student.remove(102);

        // Display
        System.out.println(student);
    }
}
