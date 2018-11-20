
package comparableexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample { 
  
  public static void main(String[] args) {
    
    List<Student> students = new ArrayList<>();
    students.add(new Student(1,"Siddhi",98));
    students.add(new Student(2,"Ishani",100));
    students.add(new Student(3,"Bhavna",97));
    
   Collections.sort(students);
    
    for(Student s: students){
      System.out.println(s);
    }    
  }  
}

class Student implements Comparable<Student> {
  int rollNo;
  String name;
  int marks;

  public Student(int rollNo, String name, int marks) {
    this.rollNo = rollNo;
    this.name = name;
    this.marks = marks;
  }

  @Override
  public String toString() {
    return "Student{" + "rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + '}';
  }

  @Override
  public int compareTo(Student o) {
    return marks>o.marks?-1:1;
  }

 
  
  
}
