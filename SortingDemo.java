import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int rollno;
    int marks;

    Student(String n, int r, int m) {
        name = n;
        rollno = r;
        marks = m;
    }

    // Sort by marks in DESCENDING order
    // If marks are same, sort by roll number in ASCENDING order
    public int compareTo(Student s) {
        if (this.marks != s.marks) {
            return s.marks - this.marks;
        } else {
            return this.rollno - s.rollno;
        }
    }

    public String toString() {
        return name + " " + rollno + " " + marks;
    }
}

public class SortingDemo {
    public static void main(String[] args) {

        // Sorting collection of Integers
        ArrayList<Integer> i = new ArrayList<>();

        i.add(25);
        i.add(15);
        i.add(65);
        i.add(20);
        i.add(45);

        // Ascending order
        i.sort(null);
        System.out.println("Integer Ascending: " + i);

        // Descending order
        i.sort(Collections.reverseOrder());
        System.out.println("Integer Descending: " + i);


        // Collection of Students
        ArrayList<Student> st = new ArrayList<>();

        st.add(new Student("A", 103, 85));
        st.add(new Student("B", 101, 95));
        st.add(new Student("C", 104, 85));
        st.add(new Student("D", 102, 90));

        // Uses compareTo() from Student class
        Collections.sort(st);

        System.out.println("\nStudents sorted by marks:");
        for (Student s : st) {
            System.out.println(s);
        }
    }
}