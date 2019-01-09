
import java.util.ArrayList;
import java.util.Collections;
 
class Student implements Comparable<Student> 
{ 
    private double Marks; 
    private String name; 
    private int roll_no; 
  
    // Used to sort movies by year 
    public int compareTo(Student s) 
    { 
        return this.roll_no - s.roll_no; 
    } 
  
    // Constructor 
    public Student(String nm, double mk, int rn) 
    { 
        this.name = nm; 
        this.Marks = mk; 
        this.roll_no = rn; 
    } 
  
    // Getter methods for accessing private data 
    public double getMarks() { return Marks; } 
    public String getName()   {  return name; } 
    public int getRoll_No()      {  return roll_no;  } 
} 
  
// Driver class 
class Main 
{ 
    public static void main(String[] args) 
    { 
        ArrayList<Student> list = new ArrayList<Student>(); 
        list.add(new Student("Raj", 65, 004)); 
        list.add(new Student("Shyam", 80, 002)); 
        list.add(new Student("Kabir", 89, 006)); 
        list.add(new Student("Sukanya", 34, 003)); 
  
        Collections.sort(list); 
  
        System.out.println("Movies after sorting : "); 
        for (Student student: list) 
        { 
            System.out.println(student.getName() + " " + 
                               student.getMarks() + " " + 
                               student.getRoll_No()); 
        } 
    } 
} 