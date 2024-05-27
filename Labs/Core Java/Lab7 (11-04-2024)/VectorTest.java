//Write a program using Vector to store the list of students details and print the details.
import java.util.Vector;

	class Student {
	    private String name;
	    private int age;
	    private String grade;

	    public Student(String name, int age, String grade) {
	        this.name = name;
	        this.age = age;
	        this.grade = grade;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getGrade() {
	        return grade;
	    }
	}

	public class VectorTest {
	    public static void main(String[] args) {
	        Vector<Student> students = new Vector<>();

	        // Adding student details to the vector
	        students.add(new Student("Monika", 20, "A"));
	        students.add(new Student("Shrutika", 21, "B"));
	        students.add(new Student("Aarti", 19, "C"));
	        students.add(new Student("Radha", 19, "B+"));

	        // Printing student details
	        for (Student student : students) {
	            System.out.println("Name: " + student.getName());
	            System.out.println("Age: " + student.getAge());
	            System.out.println("Grade: " + student.getGrade());
	            System.out.println();
	        }
	    }
	}
	
	/* OUTPUT
	 * Name: Monika
	Age: 20
	Grade: A

	Name: Shrutika
	Age: 21
	Grade: B

	Name: Aarti
	Age: 19
	Grade: C

	Name: Radha
	Age: 19
	Grade: B+*/
	
