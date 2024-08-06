import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // priority queue with printing
        Queue<Student> studentPriorityQueue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
                return t1.getGpa().compareTo(t2.getGpa());
            }
        }.reversed());;

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/rudr/Desktop/java/cs214/src/students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t"); // Assuming the data is tab-separated
                String name = parts[0];
                Double gpa = Double.parseDouble(parts[1]);
                Student student = new Student(name, gpa);
                studentPriorityQueue.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int counter = 0;

        System.out.println("Names according to highest GPA (priority queue)");
        while(!studentPriorityQueue.isEmpty() && counter < 5){
            System.out.println(studentPriorityQueue.poll());
            counter++;
        }

        // tree set. names and gpa printed according to alphabetical order of First name

        TreeSet<Student> studentsTreeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        studentsTreeSet.addAll(studentPriorityQueue);
        System.out.println("Names sorted alphabetically (TreeSet)");
        for (Student student : studentsTreeSet) {
            System.out.println(student);
        }

    }
}

class Student implements Comparable<Student>{
    private final String name;
    private final Double gpa;

    public Student(String name, Double gpa) {
        this.gpa = gpa;
        this.name = name;
    }

    public Double getGpa(){
        return gpa;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name + " " + gpa;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
